package com.dasari.featurs9.interfacechanges9;

public interface InterfaceChanges9 {

	void dataLogInfo();

	default void logInfo(String message) {
		log(message, "INFO");
	}

	default void logWarn(String message) {
		log(message, "WARN");
	}

	default void logError(String message) {
		log(message, "ERROR");
	}

	default void logFatal(String message) {
		log(message, "FATAL");
	}

	private void log(String message, String msgPrefix) {
		System.out.println(message + " -->" + msgPrefix);
	}

}
