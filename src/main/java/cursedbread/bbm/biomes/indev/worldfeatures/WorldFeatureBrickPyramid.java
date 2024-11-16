package cursedbread.bbm.biomes.indev.worldfeatures;

import cursedbread.bbm.BBMMain;
import cursedbread.bbm.biomes.indev.blocks.IndevBiomeBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;

import java.util.Random;

public class WorldFeatureBrickPyramid extends WorldFeature {
	@Override
	public boolean generate(World world, Random random, int x, int y, int z) {
		int rand = random.nextInt(100);
		int j1 = 5 + random.nextInt(10);
		if (rand <= 5 && world.getBlockId(x, y - (j1/2), z) == Block.grassRetro.id){
			int i;
			int i1 = 0;
			int j;
			int k;
			int k1 = 0;
			for (j = 0; j <= j1; j++){
				for (i = i1; i <= j; i++){
					for (k = k1; k <= j; k++){
						world.setBlock(x + i, y - j, z + k, IndevBiomeBlocks.bricksRetro.id);
						world.setBlock(x + i, y - j, z - k, IndevBiomeBlocks.bricksRetro.id);
						world.setBlock(x - i, y - j, z + k, IndevBiomeBlocks.bricksRetro.id);
						world.setBlock(x - i, y - j, z - k, IndevBiomeBlocks.bricksRetro.id);
					}
				}
				i1 = 0;
				k1 = 0;
				for (i = i1 ; i <= j - 1; i++){
					for (k = k1 ; k <= j - 1; k++){
						world.setBlock(x + i, y - j, z + k, 0);
						world.setBlock(x + i, y - j, z - k, 0);
						world.setBlock(x - i, y - j, z + k, 0);
						world.setBlock(x - i, y - j, z - k, 0);
					}
				}
			}
			for (i = i1; i <= j; i++){
				for (k = k1; k <= j; k++){
					world.setBlock(x + i, y - j, z + k, IndevBiomeBlocks.bricksRetro.id);
					world.setBlock(x + i, y - j, z - k, IndevBiomeBlocks.bricksRetro.id);
					world.setBlock(x - i, y - j, z + k, IndevBiomeBlocks.bricksRetro.id);
					world.setBlock(x - i, y - j, z - k, IndevBiomeBlocks.bricksRetro.id);
				}
			}
			return true;
		}
		return false;
	}
}
