package de.bitowner.ninjacraft.init;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.item.LutetiumSword;
import de.bitowner.ninjacraft.item.LutetiumSwordSmall;
import de.bitowner.ninjacraft.item.SpaklingItem;
import de.bitowner.ninjacraft.lib.Names;
import de.bitowner.ninjacraft.wurfwaffen.Wurfstern2;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BasicWeapons {
	/**
	 * Stichwaffen
	 */
	public static LutetiumSword lutetiumSword;
	public static LutetiumSwordSmall lutetiumSwordSmall;

	/**
	 * Wurfwaffen
	 */
	public static Wurfstern2 wurfstern2;

	public static void init() {
		// Lutetium Sword
		lutetiumSword = new LutetiumSword();
		lutetiumSword.setRegistryName(new ResourceLocation(Ninjacraft.MOD_ID, Names.LUTETIUM_SWORD));
		GameRegistry.register(lutetiumSword);

		// Lutetium Sword Small

		lutetiumSwordSmall = new LutetiumSwordSmall();
		lutetiumSwordSmall.setRegistryName(new ResourceLocation(Ninjacraft.MOD_ID, Names.LUTETIUM_SWORD_SMALL));
		GameRegistry.register(lutetiumSwordSmall);

		/**
		 * Wurfwaffen
		 */

		// Wurfstern 2

		wurfstern2 = new Wurfstern2();
		wurfstern2.setRegistryName(new ResourceLocation(Ninjacraft.MOD_ID, Names.WURFSTERN2));
		GameRegistry.register(wurfstern2);
	}

	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {

		// Lutetium Sword
		ModelResourceLocation modeLS = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.LUTETIUM_SWORD,
				"inventory");
		ModelLoader.registerItemVariants(lutetiumSword, modeLS);
		mesher.register(lutetiumSword, 0, modeLS);

		// Lutetium Sword Small
		ModelResourceLocation modeLSS = new ModelResourceLocation(
				Ninjacraft.RESOURCE_PREFIX + Names.LUTETIUM_SWORD_SMALL, "inventory");
		ModelLoader.registerItemVariants(lutetiumSwordSmall, modeLSS);
		mesher.register(lutetiumSwordSmall, 0, modeLSS);

		/**
		 * Wurfwaffen
		 */

		// Wurfstern 2
		ModelResourceLocation modeWS2 = new ModelResourceLocation(
				Ninjacraft.RESOURCE_PREFIX + Names.WURFSTERN2, "inventory");
		ModelLoader.registerItemVariants(wurfstern2, modeWS2);
		mesher.register(wurfstern2, 0, modeWS2);
	}

	public static void initRecipes() {
		lutetiumSwordSmall.initRecipes();
		lutetiumSword.initRecipes();
		wurfstern2.initRecipes();

	}
}
