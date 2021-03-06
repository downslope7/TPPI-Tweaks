package tppitweaks.recipetweaks.modTweaks;

import ic2.core.Ic2Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import tppitweaks.config.ConfigurationHandler;
import tterrag.rtc.RecipeAddition;
import tterrag.rtc.RecipeRemoval;
import tterrag.rtc.TweakingRegistry;
import tterrag.rtc.TweakingRegistry.TweakingAction;

public class BuildcraftTweaks {
	@RecipeRemoval(requiredModids={"IC2","BuildCraft|Factory"})
	public static void init(){
		if(ConfigurationHandler.harderQuarryRecipe){
			TweakingRegistry.markItemForRecipeRemoval(GameRegistry.findItem("BuildCraft|Factory", "machineBlock"), 0, TweakingAction.CHANGED, "Replaced Diamond Pickaxe with Drill", "as temporary cost adjustment.");
		}
	}
	
	@RecipeAddition(requiredModids={"IC2","BuildCraft|Factory"})
	public static void addRecipes(){
		if(ConfigurationHandler.harderQuarryRecipe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(GameRegistry.findItem("BuildCraft|Factory", "machineBlock")),
					"IRI",
					"GIG",
					"DAD",
					'I', "gearIron",
					'R', "dustRedstone",
					'G', "gearGold",
					'D', "gearDiamond",
					'A', Ic2Items.diamondDrill
					));
		}
	}
}
