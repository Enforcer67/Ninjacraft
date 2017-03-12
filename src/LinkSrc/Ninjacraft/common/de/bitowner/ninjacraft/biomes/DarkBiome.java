package de.bitowner.ninjacraft.biomes;

import java.util.Iterator;
import java.util.Random;

import de.bitowner.ninjacraft.init.BasicBlocks;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraft.world.gen.feature.WorldGenFossils;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DarkBiome extends Biome {

	public DarkBiome(Biome.BiomeProperties properties) {

		super(properties);
		setRegistryName("Darkbiom");
		this.spawnableCreatureList.clear();

		this.topBlock = Blocks.DIRT.getDefaultState();
		this.fillerBlock = BasicBlocks.featherSteel.getDefaultState();
		this.theBiomeDecorator.treesPerChunk = 100;
		this.theBiomeDecorator.extraTreeChance = 3;
		this.theBiomeDecorator.deadBushPerChunk = 200;
		this.theBiomeDecorator.reedsPerChunk = 0;
		this.theBiomeDecorator.cactiPerChunk = 0;
		this.theBiomeDecorator.waterlilyPerChunk = 3;
		this.genBigTreeChance(new Random());
		this.spawnableCreatureList.clear();
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));

		Iterator<Biome.SpawnListEntry> iterator = this.spawnableMonsterList.iterator();

		while (iterator.hasNext()) {
			Biome.SpawnListEntry biome$spawnlistentry = (Biome.SpawnListEntry) iterator.next();

			if (biome$spawnlistentry.entityClass == EntityZombie.class
					|| biome$spawnlistentry.entityClass == EntityZombieVillager.class) {
				iterator.remove();
			}
		}

		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityZombie.class, 19, 4, 4));
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityZombieVillager.class, 1, 1, 1));
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityHusk.class, 80, 4, 4));

	}

	public void decorate(World worldIn, Random rand, BlockPos pos) {
		super.decorate(worldIn, rand, pos);

		if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos,
				net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.LAKE_LAVA))
			if (rand.nextInt(1000) == 0) {
				int i = rand.nextInt(16) + 8;
				int j = rand.nextInt(16) + 8;
				BlockPos blockpos = worldIn.getHeight(pos.add(i, 0, j)).up();
				(new WorldGenDesertWells()).generate(worldIn, rand, blockpos);
			}

		if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos,
				net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FOSSIL))
			if (rand.nextInt(64) == 0) {
				(new WorldGenFossils()).generate(worldIn, rand, pos);
			}
	}


	
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getWaterColorMultiplier() {

		return 0x000000;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float currentTemperature) {

		return 0x000000;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getGrassColorAtPos(BlockPos pos) {

		return 0x000000;
	}

	@Override
	public WorldGenAbstractTree genBigTreeChance(Random rand) {
		rand.nextInt(50);
		return super.genBigTreeChance(rand);
	}
	
	


}
