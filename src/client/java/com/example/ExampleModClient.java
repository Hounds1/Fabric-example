package com.example;

import com.example.constant.ClientLoggingMessage;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleModClient implements ClientModInitializer {

	private static final Logger LOGGER = LoggerFactory.getLogger("hound");

	@Override
	public void onInitializeClient() {
		LOGGER.info(ClientLoggingMessage.INITIALIZATION_START.getMessage());



		LOGGER.info(ClientLoggingMessage.INITIALIZATION_FINISH.getMessage());
	}
}