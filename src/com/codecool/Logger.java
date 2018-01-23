package com.codecool;

import java.util.Date;

public class Logger{
    String type;
    String message;
   // Date date = new Date();

    public Logger(){
        this.type = type;
        this.message = message;
    }

    public void log(String type, String message){
        System.out.println("Type: " + type + "\nMessage: " + message);
    }

}