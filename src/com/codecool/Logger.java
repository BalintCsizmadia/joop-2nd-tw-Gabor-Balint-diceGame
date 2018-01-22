package com.codecool;

public class Logger{
    String type;
    String message;

    public Logger(String type, String message){
        this.type = type;
        this.message = message;

    }

    public String log(String type, String message){
        return message;
    }
}