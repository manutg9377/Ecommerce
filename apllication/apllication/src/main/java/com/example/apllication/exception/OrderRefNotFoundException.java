package com.example.apllication.exception;

public class OrderRefNotFoundException extends RuntimeException{

    public OrderRefNotFoundException(String message) {
        super(message);
    }

    public OrderRefNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderRefNotFoundException(Throwable cause) {
        super(cause);
    }
}
