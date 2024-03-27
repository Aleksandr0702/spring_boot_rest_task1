package com.example.spring_boot_rest_task1.authorization.handler;


import com.example.spring_boot_rest_task1.authorization.exception.InvalidCredentials;
import com.example.spring_boot_rest_task1.authorization.exception.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidCredentials.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public String handleInvalidCredentials(InvalidCredentials e) {
        return e.getMessage();
    }

    @ExceptionHandler(UnauthorizedUser.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public String handleUnauthorizedUser(UnauthorizedUser e) {
        System.out.println(e.getMessage());
        return e.getMessage();
    }
}

