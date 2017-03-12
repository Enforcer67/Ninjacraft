package de.bitowner.ninjacraft.init;

import de.bitowner.ninjacraft.biomes.DarkBiome;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicBiome{
public static DarkBiome darkbiome;
	
	
	public static void initBiome() {
		
		darkbiome = new DarkBiome(new Biome.BiomeProperties("darkbiome"));
		
		GameRegistry.register(darkbiome);
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(darkbiome, 1000));
	
		BiomeManager.addSpawnBiome(darkbiome);
		
		
		

	}
}
