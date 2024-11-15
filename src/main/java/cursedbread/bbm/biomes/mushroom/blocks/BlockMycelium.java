package cursedbread.bbm.biomes.mushroom.blocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockGrass;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockMycelium extends BlockGrass {
	public BlockMycelium(String key, int id, Material material) {
		super(key, id, material);
		this.setTicking(true);
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		if (world.isClientSide) {
			return;
		}
		if (world.getBlockId(x, y+1, z) != 0 && world.getBlockId(x, y+1, z) != Block.mushroomBrown.id && world.getBlockId(x, y+1, z) != Block.mushroomRed.id) {
			if (rand.nextInt(4) != 0) {
				return;
			}
			world.setBlockWithNotify(x, y, z, Block.dirt.id);
		} else if (world.getBlockLightValue(x, y + 1, z) >= 0) {
			int l = x + rand.nextInt(3) - 1;
			int i1 = y + rand.nextInt(5) - 3;
			int j1 = z + rand.nextInt(3) - 1;
			int k1 = world.getBlockId(l, i1 + 1, j1);
			if (world.getBlockId(l, i1, j1) == Block.dirt.id && world.getBlockLightValue(l, i1 + 1, j1) >= 0 && Block.lightBlock[k1] <= 255) {
				world.setBlockWithNotify(l, i1, j1, this.id);
			}
			int idToSpawn = 0;
			int r = rand.nextInt(400);
			if (r < 26) {
				idToSpawn = Block.mushroomRed.id;
			} else if (r < 41) {
				idToSpawn = Block.mushroomBrown.id;
			} else if (r < 60) {
				return;
			} else {
				return;
			}
			world.setBlockWithNotify(x, y + 1, z, idToSpawn);
		}
	}
}
