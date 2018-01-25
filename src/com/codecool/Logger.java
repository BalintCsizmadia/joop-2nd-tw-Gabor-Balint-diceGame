package com.codecool;


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

    public void loadWaiting(int time) {        
        try        
            {
            Thread.sleep(time);
        } 
        catch(InterruptedException ex) 
            {
            Thread.currentThread().interrupt();
        }
    }

    public void loadScreen() {
        System.out.println("\033[H\033[2J");
        System.out.println("Calculating.");
        System.out.println("--------------------------");
        loadWaiting(800);
        System.out.println("\033[H\033[2J");
        System.out.println("Calculating..");
        System.out.println("||||----------------------");
        loadWaiting(600);
        System.out.println("\033[H\033[2J");
        System.out.println("Calculating...");
        System.out.println("|||||||||||---------------");
        loadWaiting(1000);
        System.out.println("\033[H\033[2J");
        System.out.println("Calculating.");
        System.out.println("|||||||||||||||||||-------");
        loadWaiting(1100);
        System.out.println("\033[H\033[2J");
        System.out.println("Calculating..");
        System.out.println("|||||||||||||||||||||||---");
        loadWaiting(500);
        System.out.println("\033[H\033[2J");
        System.out.println("Calculating...");
        System.out.println("||||||||||||||||||||||||||");
        loadWaiting(700);
        System.out.println("\033[H\033[2J");
        System.out.println("Simulation completed.\n");
        loadWaiting(700);
    }
}
