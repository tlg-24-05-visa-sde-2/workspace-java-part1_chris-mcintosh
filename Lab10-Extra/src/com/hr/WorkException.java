package com.hr;

public class WorkException extends Exception {
    public WorkException(Throwable cause) {
        super(cause);
    }

    public WorkException(String message, Throwable cause) {
        super(message, cause);
    }

    public WorkException(String message) {
        super(message);
    }

    public WorkException() {
    }
}