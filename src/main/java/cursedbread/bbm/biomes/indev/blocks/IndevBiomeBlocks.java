package cursedbread.bbm.biomes.indev.blocks;

import cursedbread.bbm.BBMBlocks;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;

public class IndevBiomeBlocks {
	public static Block cobblestoneRetro;
	public static Block cobblestoneMossyRetro;
	public static Block bricksRetro;

	public void initilizeBlockDetailsIndev(){

	}

	public void initilizeBlocksIndev(){
		cobblestoneRetro = BBMBlocks.fullBlock
			.setBlockModel(
				block -> new BlockModelStandard(block)
					.withTextures("bbm:block/indev/cobbled_stone_retro"))
			.build(new Block("retro.cobble", BBMBlocks.blockId++, Material.stone));

		cobblestoneMossyRetro = BBMBlocks.fullBlock
			.setBlockModel(
				block -> new BlockModelStandard(block)
					.withTextures("bbm:block/indev/mossy_cobbled_stone_retro"))
			.build(new Block("retro.cobble.mossy", BBMBlocks.blockId++, Material.stone));

		bricksRetro = BBMBlocks.fullBlock
			.setBlockModel(
				block -> new BlockModelStandard(block)
					.withTextures("bbm:block/indev/brick_clay_retro"))
			.build(new Block("retro.bricks", BBMBlocks.blockId++, Material.stone));
	}
}
