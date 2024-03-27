package com.example.spring_boot_rest_task1.authorization.exception;


public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {
        super(msg);
    }
}

