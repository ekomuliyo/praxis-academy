package com.ekomuliyo;

public class NotFullPadException extends RuntimeException{
    private String message;
    private long remaining;

    public NotFullPadException(String message, long remaining){
        this.message = message;
        this.remaining = remaining;
    }

    public long getRemaining(){
        return remaining;
    }

    @Override
    public String getMessage(){
        return message + remaining;
    }

}