package cavestreamgames.cavescustombeacons;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CavesCustomBeacons implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("cavescustombeacons");

	@Override
	public void onInitialize() {

		LOGGER.info("Cave's Custom Beacons is initializing!");
	}
}