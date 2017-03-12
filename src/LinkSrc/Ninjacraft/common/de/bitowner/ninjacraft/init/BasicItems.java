package de.bitowner.ninjacraft.init;

import de.bitowner.ninjacraft.Ninjacraft;
import de.bitowner.ninjacraft.block.FeatherSteel;
import de.bitowner.ninjacraft.item.Alice;
import de.bitowner.ninjacraft.item.Feather;
import de.bitowner.ninjacraft.item.FeatherSteelIngot;
import de.bitowner.ninjacraft.item.Gift_Bottle;
import de.bitowner.ninjacraft.item.Lutetium_bar;
import de.bitowner.ninjacraft.item.Lutetium_roh;
import de.bitowner.ninjacraft.item.SpaklingItem;
import de.bitowner.ninjacraft.item.The_Death;
import de.bitowner.ninjacraft.item.Wissen;
import de.bitowner.ninjacraft.lib.Names;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.reflect.internal.Trees.This;

public class BasicItems {

	public static SpaklingItem sparklingItem;
	public static Alice heartAlice;
	public static Gift_Bottle giftBottle;
	public static The_Death thedeath;
	public static Lutetium_roh lutetiumRoh;
	public static Lutetium_bar lutetiumBar;
	public static Wissen wissen;
	public static FeatherSteelIngot featherSteelIngot;
	public static Feather feather;

	public static void init() {

		// Sparkling Item
		sparklingItem = new SpaklingItem();
		sparklingItem.setRegistryName(new ResourceLocation(Ninjacraft.MOD_ID, Names.SPARKLING_ITEM));
		GameRegistry.register(sparklingItem);

		// Heart Alice
		heartAlice = new Alice();
		heartAlice.setRegistryName(new ResourceLocation(Ninjacraft.MOD_ID, Names.HEART_ALICE));
		GameRegistry.register(heartAlice);

		// GiftBottle
		giftBottle = new Gift_Bottle();
		giftBottle.setRegistryName(new ResourceLocation(Ninjacraft.MOD_ID, Names.GIFT_BOTTLE));
		GameRegistry.register(giftBottle);

		// TheDeath
		thedeath = new The_Death();
		thedeath.setRegistryName(new ResourceLocation(Ninjacraft.MOD_ID, Names.THE_DEATH)); //
		GameRegistry.register(thedeath);

		// Luthetium Roh
		lutetiumRoh = new Lutetium_roh();
		lutetiumRoh.setRegistryName(new ResourceLocation(Ninjacraft.MOD_ID, Names.LUTETIUM_ROH));
		GameRegistry.register(lutetiumRoh);

		// Luthetium Bar
		lutetiumBar = new Lutetium_bar();
		lutetiumBar.setRegistryName(new ResourceLocation(Ninjacraft.MOD_ID, Names.LUTETIUM_BAR));
		GameRegistry.register(lutetiumBar);

		// Wissen
		wissen = new Wissen();
		wissen.setRegistryName(new ResourceLocation(Ninjacraft.MOD_ID, Names.WISSEN));
		GameRegistry.register(wissen);

		// Feather Steel
		featherSteelIngot = new FeatherSteelIngot();
		featherSteelIngot.setRegistryName(new ResourceLocation(Ninjacraft.MOD_ID, Names.FEATHER_STEEL_INGOT));
		GameRegistry.register(featherSteelIngot);
		

		// Feather
		feather = new Feather();
		feather.setRegistryName(new ResourceLocation(Ninjacraft.MOD_ID, Names.FEATHER));
		GameRegistry.register(feather);

	}

	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		// Sparkling Item
		ModelResourceLocation modelSP = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.SPARKLING_ITEM,
				"inventory");
		ModelLoader.registerItemVariants(sparklingItem, modelSP);
		mesher.register(sparklingItem, 0, modelSP);

		// Heart Alice Item
		ModelResourceLocation modelHA = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.HEART_ALICE,
				"inventory");
		ModelLoader.registerItemVariants(heartAlice, modelHA);
		mesher.register(heartAlice, 0, modelHA);

		// GiftBottle
		ModelResourceLocation modelGB = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.GIFT_BOTTLE,
				"inventory");
		ModelLoader.registerItemVariants(giftBottle, modelGB);
		mesher.register(giftBottle, 0, modelGB);

		// TheDeath
		ModelResourceLocation modelTD = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.THE_DEATH,
				"inventory");
		ModelLoader.registerItemVariants(thedeath, modelTD);
		mesher.register(thedeath, 0, modelTD);

		// Luthetium Roh
		ModelResourceLocation modelLR = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.LUTETIUM_ROH,
				"inventory");
		ModelLoader.registerItemVariants(lutetiumRoh, modelLR);
		mesher.register(lutetiumRoh, 0, modelLR);

		// Luthetium Bar
		ModelResourceLocation modelBAR = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.LUTETIUM_BAR,
				"inventory");
		ModelLoader.registerItemVariants(lutetiumBar, modelBAR);
		mesher.register(lutetiumBar, 0, modelBAR);

		// Wissen
		ModelResourceLocation modelWI = new ModelResourceLocation(Ninjacraft.RESOURCE_PREFIX + Names.WISSEN,
				"inventory");
		ModelLoader.registerItemVariants(wissen, modelWI);
		mesher.register(wissen, 0, modelWI);

		// FeatherSteel
		ModelResourceLocation modelFES = new ModelResourceLocation(
				Ninjacraft.RESOURCE_PREFIX + Names.FEATHER_STEEL_INGOT, "inventory");
		ModelLoader.registerItemVariants(featherSteelIngot, modelFES);
		mesher.register(featherSteelIngot, 0, modelFES);
		
		// Feather
		ModelResourceLocation modelFED = new ModelResourceLocation(
				Ninjacraft.RESOURCE_PREFIX + Names.FEATHER, "inventory");
		ModelLoader.registerItemVariants(feather, modelFED);
		mesher.register(feather, 0, modelFED);

	}

	public static void initRecipes() {
		lutetiumBar.addRecipes();
		feather.addRecipes();

	}

}
