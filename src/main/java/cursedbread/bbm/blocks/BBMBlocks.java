package cursedbread.bbm.blocks;

import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockGlass;
import net.minecraft.core.block.BlockGrass;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSound;
import turniplabs.halplibe.helper.BlockBuilder;

import static cursedbread.bbm.BBMMain.MOD_ID;
import static net.minecraft.core.sound.BlockSounds.GRASS;

public class BBMBlocks {

	public static int blockId;

	public static BlockBuilder fullBlock = new BlockBuilder(MOD_ID);

	public static Block mycelium;

	private void initializeBlockDetails(){

	}

	public void initilizeBlocks(){
		mycelium = fullBlock
			.setBlockModel(
				block -> new BlockModelStandard(block)
					.withTextures("bbm:block/mycelium/mycelium_grass_top", "bbm:block/mycelium/mycelium_dirt", "bbm:block/mycelium/mycelium_grass_side")
			)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.FENCES_CONNECT, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.GROWS_TREES, BlockTags.CAVES_CUT_THROUGH, BlockTags.CAVE_GEN_REPLACES_SURFACE)
			.setHardness(0.6f)
			.setBlockSound(GRASS)
			.build(new BlockMycelium("mycelium", blockId++, Material.grass));



		initializeBlockDetails();
	}
}
