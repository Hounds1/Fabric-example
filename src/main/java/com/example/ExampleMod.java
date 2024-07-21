package com.example;

import com.example.constant.ServerLoggingMessages;
import com.example.item.ExtendsScroll;
import com.example.utils.ItemRegistryExtender;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("hound");

	@Override
	public void onInitialize() {
		LOGGER.info(ServerLoggingMessages.INITIALIZATION_START.getMessage());

		ItemRegistryExtender.addEntries(ItemRegistryExtender.register(new ExtendsScroll(new FabricItemSettings()), "scroll_exam"));

		LOGGER.info(ServerLoggingMessages.INITIALIZATION_FINISH.getMessage());
	}
}