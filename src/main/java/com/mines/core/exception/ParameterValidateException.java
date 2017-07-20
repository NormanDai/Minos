package com.mines.core.exception;


public class ParameterValidateException extends RuntimeException{

    public ParameterValidateException(){
        super();
    }

    public ParameterValidateException(Throwable throwable){
        super(throwable);
    }

    public ParameterValidateException(String message){
        super(message);
    }

}
