package com.example.springpractice.common.exception;

import com.example.springpractice.common.Constants;
import org.springframework.http.HttpStatus;

public class SpringBootException extends Exception{

    private static final long serialVersionUID = 123456789;

    private Constants.ExceptionClass exceptionClass;
    private HttpStatus httpStatus;

    public SpringBootException(Constants.ExceptionClass exceptionClass, HttpStatus httpStatus, String message) {
        super(exceptionClass.toString() + message);
        this.exceptionClass = exceptionClass;
        this.httpStatus = httpStatus;
    }

    public int getHttpStatusCode() {
        return httpStatus.value();
    }

    public String getHttpStatusType() {
        return httpStatus.getReasonPhrase();
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

}
