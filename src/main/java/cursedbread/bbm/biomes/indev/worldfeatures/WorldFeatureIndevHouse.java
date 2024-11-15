package cursedbread.bbm.biomes.indev.worldfeatures;

import cursedbread.bbm.biomes.indev.blocks.IndevBiomeBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;

import java.util.Random;

public class WorldFeatureIndevHouse extends WorldFeature {
	@Override
	public boolean generate(World world, Random random, int x, int y, int z) {
		int rand = random.nextInt(100);
		if (rand <= 25 && world.getBlockId(x, y-1, z) == Block.grassRetro.id){
			int i;
			int j;
			int k;
			int door = random.nextInt(4);
			for (i = 0; i <= 8; i++) {
				for (k = 0; k <= 8; k++) {
					for (j = 0; j <= 5; j++) {
						world.setBlock(x + i, y + j, z + k, Block.planksOak.id);
					}
				}
			}
			for (i = 1; i <= 7; i++) {
				for (k = 1; k <= 7; k++) {
					for (j = 0; j <= 3; j++) {
						world.setBlock(x + i, y + j, z + k, 0);
					}
				}
			}
			for (i = 0; i <= 8; i++) {
				for (k = 0; k <= 8; k++) {
					j = -1;
					int moss = random.nextInt(100);
					if (moss <= 10) {
						world.setBlock(x + i, y + j, z + k, IndevBiomeBlocks.cobblestoneMossyRetro.id);
					} else {
						world.setBlock(x + i, y + j, z + k, IndevBiomeBlocks.cobblestoneRetro.id);
					}
				}
			}
			if (door == 0) {
				world.setBlock(x + 4, y, z, 0);
				world.setBlock(x + 4, y+1, z, 0);
			} else if (door == 1) {
				world.setBlock(x - 4, y, z, 0);
				world.setBlock(x - 4, y+1, z, 0);
			} else if (door == 2) {
				world.setBlock(x, y, z + 4, 0);
				world.setBlock(x, y+1, z + 4, 0);
			} else {
				world.setBlock(x, y, z - 4, 0);
				world.setBlock(x, y+1, z - 4, 0);
			}
			world.setBlock(x + 4, y, z + 4, Block.torchCoal.id);
			return true;
		} else {
			return false;
		}
	}
}
