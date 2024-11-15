package cursedbread.bbm.biomes.mushroom.blocks;

import cursedbread.bbm.BBMBlocks;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;

import static net.minecraft.core.sound.BlockSounds.GRASS;

public class MushroomBiomeBlocks {

	public static Block mycelium;

	public void initilizeBlockDetailsMushroom(){

	}

	public void initilizeBlocksMushroom(){
		/*mycelium = BBMBlocks.fullBlock
			.setBlockModel(
				block -> new BlockModelStandard(block)
					.withTextures("bbm:mushroom/block/mycelium/mycelium_grass_top", "bbm:mushroom/block/mycelium/mycelium_dirt", "bbm:mushroom/block/mycelium/mycelium_grass_side")
			)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.FENCES_CONNECT, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.GROWS_TREES, BlockTags.CAVES_CUT_THROUGH, BlockTags.CAVE_GEN_REPLACES_SURFACE)
			.setHardness(0.6f)
			.setBlockSound(GRASS)
			.build(new BlockMycelium("mycelium", BBMBlocks.blockId++, Material.grass));*/
	}
}
