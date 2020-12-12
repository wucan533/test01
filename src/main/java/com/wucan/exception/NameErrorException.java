package com.wucan.exception;

public class NameErrorException extends GlobalErrorException{

    public NameErrorException() {
        super();
    }

    public NameErrorException(String message) {
        super(message);
    }
}
