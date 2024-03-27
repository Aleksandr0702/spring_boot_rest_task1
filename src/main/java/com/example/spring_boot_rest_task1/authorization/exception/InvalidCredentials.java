package com.example.spring_boot_rest_task1.authorization.exception;


public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(msg);
    }
}

