package com.wucan.exception;

public class GlobalErrorException extends Exception{

    public GlobalErrorException() {
        super();
    }

    public GlobalErrorException(String message) {
        super(message);
    }
}
