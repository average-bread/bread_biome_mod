package cursedbread.bbm.TerrainApiStuff;

import cursedbread.bbm.BBMBiomes;
import cursedbread.bbm.BBMMain;
import cursedbread.bbm.biomes.indev.worldfeatures.WorldFeatureBrickPyramid;
import cursedbread.bbm.biomes.indev.worldfeatures.WorldFeatureIndevHouse;
import net.minecraft.core.world.biome.Biome;
import useless.terrainapi.api.TerrainAPI;
import useless.terrainapi.generation.overworld.api.ChunkDecoratorOverworldAPI;

public class TerrainApiStuff implements TerrainAPI {
	@Override
	public String getModID() {
		return BBMMain.MOD_ID;
	}

	@Override
	public void onInitialize() {
		ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureIndevHouse(), 1, 1f, 1, new Biome[]{BBMBiomes.OVERWORLD_INDEV_PLAINS});
		ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureBrickPyramid(), 1, 1f, 1, new Biome[]{BBMBiomes.OVERWORLD_INDEV_PLAINS});
	}
}
