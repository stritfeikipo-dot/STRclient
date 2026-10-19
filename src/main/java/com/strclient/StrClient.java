
package com.strclient;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StrClient implements ClientModInitializer {

    public static final String MOD_ID = "strclient";
    public static final Logger LOGGER =
            LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("StrClient loaded successfully!");
    }
}
