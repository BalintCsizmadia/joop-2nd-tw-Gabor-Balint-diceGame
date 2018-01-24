package com.codecool;


import java.text.DecimalFormat;

public class Result {
    Statistics stats;


    public Result(Statistics stats) {
        this.stats = stats;
    }



    public Statistics getStatistics() {
    /*
        float snakeNumber = (((float)snakeEye / (float)allGame) * (float)100);
        DecimalFormat df = new DecimalFormat("###.##");
        String snakePercent = df.format(snakeNumber);
        "Snake eye: " + snakeEye + " wins from " + allGame + " games." + snakePercent + "%\n" +
        "Ace-deuce: " + aceDeuce + " wins from " + allGame + " games.\n" + 
        "Yo: " + yo + " wins from " + allGame + " games.\n" +
        "Boxcars: " + boxCars + " wins from " + allGame + " games.\n" +
        "Hi-lo: " + hiLo + " wins from " + allGame + " games.\n" +
        "Any craps: " + anyCraps + " wins from " + allGame + " games.\n" + 
        "Any seven: " + anySeven + " wins from "  + allGame + " games.";
        
    */

        // System.out.println(result.getStatistics()); // most ez printel egyet

        return stats;

    }
}
