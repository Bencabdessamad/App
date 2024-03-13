package com.example.app;

public class EmailAlreadyExistsException extends RuntimeException {
    public EmailAlreadyExistsException() {
        super("Email déjà utilisé!");
    }
}