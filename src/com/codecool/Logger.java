package com.codecool;

import java.util.Date;

public class Logger{

    public Logger(){
    }

    public void log(String type, String message){
        System.out.println("Type: " + type + " / Message: " + message);
    }

    public void simpleLog(String string) {
        System.out.println(string);
    }

    public void twoDatasLog(String str, String from) {
        System.out.println(str + from);
    }

    public void percentLog(String game, String percent, String sign){
        System.out.println(game + percent + sign);
    }

    public void informLog(String message, int game, String wf, int fromAllGame, String endMessage) {
        System.out.println(message + game + " win from " + fromAllGame + endMessage);
    }


}