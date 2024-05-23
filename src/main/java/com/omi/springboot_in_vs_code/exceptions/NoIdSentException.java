package com.omi.springboot_in_vs_code.exceptions;

public class NoIdSentException extends NullPointerException {
    public NoIdSentException() {
        System.err.println("Id Not Received");
        ;
    }
}
