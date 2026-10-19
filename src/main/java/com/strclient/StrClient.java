
package com.strclient;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping.Category;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StrClient implements ClientModInitializer {

    public static final String MOD_ID = "strclient";
    public static final Logger LOGGER =
            LoggerFactory.getLogger(MOD_ID);

    private static KeyMapping openMenuKey;

    @Override
    public void onInitializeClient() {
        openMenuKey = KeyBindingHelper.registerKeyBinding(
                new KeyMapping(
                        "key.strclient.open_menu",
                        GLFW.GLFW_KEY_RIGHT_SHIFT,
                        Category.MISC
                )
        );

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (openMenuKey.consumeClick()) {
                Minecraft minecraft = Minecraft.getInstance();

                if (minecraft.screen == null) {
                    minecraft.setScreen(new StrClientScreen());
                }
            }
        });

        LOGGER.info("StrClient loaded successfully!");
    }
}
