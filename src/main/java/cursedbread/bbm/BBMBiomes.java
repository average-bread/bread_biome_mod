package cursedbread.bbm;

import cursedbread.bbm.biomes.indev.IndevPlainsBiome;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;

public class BBMBiomes {
	public static final Biome OVERWORLD_INDEV_PLAINS = new IndevPlainsBiome("bbm.indev");

	public void	initilizeBiomes(){
		Biomes.register(BBMMain.MOD_ID+":indev", OVERWORLD_INDEV_PLAINS);
	}
}
