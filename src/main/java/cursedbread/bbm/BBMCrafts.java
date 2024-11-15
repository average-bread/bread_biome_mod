package cursedbread.bbm;

import cursedbread.bbm.biomes.indev.blocks.IndevBiomeBlocks;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class BBMCrafts implements RecipeEntrypoint {

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(BBMMain.MOD_ID);
		RecipeBuilder.getRecipeNamespace(BBMMain.MOD_ID);
	}

	@Override
	public void onRecipesReady() {
		RecipeBuilder.addItemsToGroup("minecraft", "cobblestones", IndevBiomeBlocks.cobblestoneRetro);
	}
}
