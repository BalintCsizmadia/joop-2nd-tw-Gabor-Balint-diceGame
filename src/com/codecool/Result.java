package com.codecool;

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
        return "Snake eye: " + snakeEye + " wins from " + allGame + " games.\n" + 
               "Ace-deuce: " + aceDeuce + " wins from " + allGame + " games.\n" + 
               "Yo: " + yo + " wins from " + allGame + " games.\n" +
               "Boxcars: " + boxCars + " wins from " + allGame + " games.\n" +
               "Hi-lo: " + hiLo + " wins from " + allGame + " games.\n" +
               "Any craps: " + anyCraps + " wins from " + allGame + " games.\n" + 
               "Any seven: " + anySeven + " wins from "  + allGame + " games.";


    }
}
