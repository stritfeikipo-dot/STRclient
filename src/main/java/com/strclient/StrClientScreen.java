
package com.strclient;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class StrClientScreen extends Screen {

    public StrClientScreen() {
        super(Component.literal("StrClient"));
    }

    @Override
    public void render(
            GuiGraphics graphics,
            int mouseX,
            int mouseY,
            float delta
    ) {
        this.renderBackground(graphics, mouseX, mouseY, delta);

        int panelWidth = 300;
        int panelHeight = 200;

        int left = (this.width - panelWidth) / 2;
        int top = (this.height - panelHeight) / 2;

        graphics.fill(
                left, top,
                left + panelWidth, top + panelHeight,
                0xF0181524
        );

        graphics.fill(
                left, top,
                left + panelWidth, top + 3,
                0xFF9B59FF
        );

        graphics.drawCenteredString(
                this.font,
                "StrClient",
                this.width / 2,
                top + 18,
                0xFFB98AFF
        );

        graphics.drawCenteredString(
                this.font,
                "PvP Visuals",
                this.width / 2,
                top + 42,
                0xFFFFFFFF
        );

        graphics.drawCenteredString(
                this.font,
                "Visual module is ready",
                this.width / 2,
                top + 75,
                0xFFCCCCCC
        );

        super.render(graphics, mouseX, mouseY, delta);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
