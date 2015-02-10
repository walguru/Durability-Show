package com.sixonethree.durabilityshow.event;

import com.sixonethree.durabilityshow.client.gui.EnumGuiState;
import com.sixonethree.durabilityshow.client.gui.GuiItemDurability;
import com.sixonethree.durabilityshow.handler.KeyHandler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEvent {
	@SubscribeEvent public void keyPressed(InputEvent.KeyInputEvent e) {
		if (KeyHandler.showHud.isPressed()) {
			if (GuiItemDurability.getGuiState() == EnumGuiState.CLOSED || GuiItemDurability.getGuiState() == EnumGuiState.CLOSING) {
				GuiItemDurability.setGuiState(EnumGuiState.OPENING);
				return;
			}
			if (GuiItemDurability.getGuiState() == EnumGuiState.OPEN || GuiItemDurability.getGuiState() == EnumGuiState.OPENING) {
				GuiItemDurability.setGuiState(EnumGuiState.CLOSING);
				return;
			}
		}
	}
}