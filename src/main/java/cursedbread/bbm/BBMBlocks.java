package cursedbread.bbm;

import cursedbread.bbm.biomes.indev.blocks.IndevBiomeBlocks;
import cursedbread.bbm.biomes.mushroom.blocks.BlockMycelium;
import cursedbread.bbm.biomes.mushroom.blocks.MushroomBiomeBlocks;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;

import static cursedbread.bbm.BBMMain.MOD_ID;
import static net.minecraft.core.sound.BlockSounds.GRASS;

public class BBMBlocks {

	public static int blockId;

	public static BlockBuilder fullBlock = new BlockBuilder(MOD_ID);

	private void initializeBlockDetails(){
		new IndevBiomeBlocks().initilizeBlockDetailsIndev();
		new MushroomBiomeBlocks().initilizeBlockDetailsMushroom();
	}

	public void initilizeBlocks(){
		new IndevBiomeBlocks().initilizeBlocksIndev();
		new MushroomBiomeBlocks().initilizeBlocksMushroom();
		initializeBlockDetails();
	}
}
