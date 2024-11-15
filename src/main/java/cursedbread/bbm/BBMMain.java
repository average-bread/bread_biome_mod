package cursedbread.bbm;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;

import java.util.Properties;


public class BBMMain implements ModInitializer, GameStartEntrypoint {
    public static final String MOD_ID = "bbm";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","2200");
		prop.setProperty("starting_item_id","17890");

		ConfigHandler config = new ConfigHandler(MOD_ID,prop);

		BBMBlocks.blockId = config.getInt("starting_block_id");
		BBMItems.itemId = config.getInt("starting_item_id");
	}

    @Override
    public void onInitialize() {
        LOGGER.info("Biomes, I love biomes, I LOVE BIOMES, YEEEEEEEEEEEEEES");
		new BBMBlocks().initilizeBlocks();
		new BBMItems().initilizeItems();
		new BBMBiomes().initilizeBiomes();
    }

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}


}
