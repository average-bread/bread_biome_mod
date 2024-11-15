package cursedbread.bbm.biomes.indev;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTree;

import java.util.Random;

public class IndevPlainsBiome extends Biome {
	public IndevPlainsBiome(String key) {
		super(key);
		this.topBlock = (short) Block.grassRetro.id;
		this.fillerBlock = (short) Block.stone.id;
	}

	public WorldFeature getRandomWorldGenForTrees(Random random) {
		return new WorldFeatureTree(Block.leavesOakRetro.id, Block.logOak.id, 4);
	}
}
