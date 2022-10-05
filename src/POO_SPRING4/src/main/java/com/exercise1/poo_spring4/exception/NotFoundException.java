package com.exercise1.poo_spring4.exception;

public class EmptyDatabaseException extends RuntimeException{
    public EmptyDatabaseException(String message) {
        super(message);
    }
}
