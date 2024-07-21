package com.example.constant;

public enum ServerLoggingMessages {

    INITIALIZATION_START("Hounds Example mod server starting initialization"),
    INITIALIZATION_FINISH("Hounds Example mod server finished initialization");

    private final String message;

    ServerLoggingMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
