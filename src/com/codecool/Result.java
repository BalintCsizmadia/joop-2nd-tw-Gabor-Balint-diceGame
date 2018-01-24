package com.codecool;


import java.text.DecimalFormat;

public class Result {

    int snakeEye;
    int aceDeuce;
    int yo;
    int boxCars;
    int hiLo;
    int anyCraps;
    int anySeven;
    int allGame;

    public Result(int snakeEye, int aceDeuce, int yo, int boxCars, int hiLo, int anyCraps, int anySeven, int allGame) {
        this.snakeEye = snakeEye;
        this.aceDeuce = aceDeuce;
        this.yo = yo;
        this.boxCars = boxCars;
        this.hiLo = hiLo;
        this.anyCraps = anyCraps;
        this.anySeven = anySeven;
        this.allGame = allGame;
        
    }




    public String getStatistics() {
        float snakeNumber = (((float)snakeEye / (float)allGame) * (float)100);
        DecimalFormat df = new DecimalFormat("###.##");
        String snakePercent = df.format(snakeNumber);
        return "Snake eye: " + snakeEye + " wins from " + allGame + " games." + snakePercent + "%\n" +
               "Ace-deuce: " + aceDeuce + " wins from " + allGame + " games.\n" + 
               "Yo: " + yo + " wins from " + allGame + " games.\n" +
               "Boxcars: " + boxCars + " wins from " + allGame + " games.\n" +
               "Hi-lo: " + hiLo + " wins from " + allGame + " games.\n" +
               "Any craps: " + anyCraps + " wins from " + allGame + " games.\n" + 
               "Any seven: " + anySeven + " wins from "  + allGame + " games.";


    }
}
