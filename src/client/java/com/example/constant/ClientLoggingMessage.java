package com.example.constant;

public enum ClientLoggingMessage {

    INITIALIZATION_START("Hounds Example mod client starting initialization"),
    INITIALIZATION_FINISH("Hounds Example mod client finished initialization");

    private final String message;

    ClientLoggingMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
