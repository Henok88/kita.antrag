package de.behoerde.kita.antrag.service.rest;

public class ExceptionJsonInfo {
    private String message;

    public ExceptionJsonInfo(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
