package de.bitowner.ninjacraft.util;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGenerator implements IWorldGenerator {
	private Block block;
	private int maxHeight;
	private int aderGroesse;

	public OreGenerator(Block block, int maxHeight, int aderGroesse) {
		this.block = block;
		this.maxHeight = maxHeight; // Spawnhöhe
		this.aderGroesse = aderGroesse;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {

		if (world.provider.getDimensionType().getId() == 0) {

			chunkX *= 16;
			chunkZ *= 16;

			for (int i = 0; i < 25; i++) {

				int posX = chunkX + random.nextInt(16);
				int posY = random.nextInt(maxHeight);
				int posZ = chunkZ + random.nextInt(16);

				WorldGenMinable wgn = new WorldGenMinable(block.getDefaultState(), aderGroesse);
				wgn.generate(world, random, new BlockPos(posX, posY, posZ));

			}

		}

	}
}
