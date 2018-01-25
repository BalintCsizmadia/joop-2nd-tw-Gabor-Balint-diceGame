package com.codecool;

import java.text.DecimalFormat;


public class Statistics{
    DecimalFormat df = new DecimalFormat("###.##");
    int snakeEye;
    int aceDeuce;
    int yo;
    int boxCars;
    int hiLo;
    int anyCraps;
    int anySeven;
    int allGame;
    int[] findTheBiggest;
    int maximum;
    int minimum;
    String bestGameName;
    String worstGameName;


    public Statistics(int snakeEye, int aceDeuce, int yo, int boxCars, int hiLo, int anyCraps, int anySeven, int allGame) {
        this.snakeEye = snakeEye;
        this.aceDeuce = aceDeuce;
        this.yo = yo;
        this.boxCars = boxCars;
        this.hiLo = hiLo;
        this.anyCraps = anyCraps;
        this.anySeven = anySeven;
        this.allGame = allGame;
        this.findTheBiggest = new int[] {snakeEye, aceDeuce, yo, boxCars, hiLo, anyCraps, anySeven};
    }
    
    public String calcSnakePercent(){
        float snakeNumber = (((float)snakeEye / (float)allGame) * (float)100);
        String snakePercent = df.format(snakeNumber);
        return snakePercent;
    }
    public String calcAcePercent(){
        float aceDeuceNumber = (((float)aceDeuce / (float)allGame) * (float)100);
        String aceDucePercent = df.format(aceDeuceNumber);
        return aceDucePercent;
    }
    public String calcYoPercent() {
        float yoNumber = (((float)yo / (float)allGame) * (float)100);
        String yoPercent = df.format(yoNumber);
        return yoPercent;
    }
    public String calcBoxCarsPercent() {
        float boxCarsNumber = (((float)boxCars / (float)allGame) * (float)100);
        String boxCarsPercent = df.format(boxCarsNumber);
        return boxCarsPercent;
    }
    public String calcHiLoPercent() {
        float hiLoNumber = (((float)hiLo / (float)allGame) * (float)100);
        String hiLoPercent = df.format(hiLoNumber);
        return hiLoPercent;
    }
    public String calcAnyCrapsPercent() {
        float anyCrapsNumber = (((float)anyCraps / (float)allGame) * (float)100);
        String anyCrapsPercent = df.format(anyCrapsNumber);
        return anyCrapsPercent;
    }
    public String calcAnySevenPercent() {
        float anySevenNumber = (((float)anySeven / (float)allGame) * (float)100);
        String anySevenPercent = df.format(anySevenNumber);
        return anySevenPercent;
    }

    public int theMostWin() {
        int maximum = 0;
        for (int i = 0; i < findTheBiggest.length; i++) {
            if (findTheBiggest[i] > maximum) {
                maximum = findTheBiggest[i];
            }
        } return maximum;
    }
    public int theLeastWin() {
        int minimum = 0;
        for (int i = 0; i < findTheBiggest.length; i++) {
            if (minimum == 0 || minimum > findTheBiggest[i]) {
                minimum = findTheBiggest[i];
            }
        }
        return minimum;
    }
    public String theBestBetGameName() {
        bestGameName = "";
        if (snakeEye == theMostWin()) {
            bestGameName = "Snake eye";
        } else if (aceDeuce == theMostWin()) {
            bestGameName = "Ace-deuce";
        } else if (yo == theMostWin()) {
            bestGameName = "Yo";
        } else if (boxCars == theMostWin()) {
            bestGameName = "Boxcars";
        } else if (hiLo == theMostWin()) {
            bestGameName = "Hi-lo";
        } else if (anyCraps == theMostWin()) {
            bestGameName = "Any craps";
        } else if (anySeven == theMostWin()) {
            bestGameName = "Any seven";
        }
        return bestGameName;
    }
    public String theWorstBetGameName() {
        worstGameName = "";
        if (snakeEye == theLeastWin()) {
            worstGameName = "Snake eye";
        } else if (aceDeuce == theLeastWin()) {
            worstGameName = "Ace-deuce";
        } else if (yo == theLeastWin()) {
            worstGameName = "Yo";
        } else if (boxCars == theLeastWin()) {
            worstGameName = "Boxcars";
        } else if (hiLo == theLeastWin()) {
            worstGameName = "Hi-lo";
        } else if (anyCraps == theLeastWin()) {
            worstGameName = "Any craps";
        } else if (anySeven == theLeastWin()) {
            worstGameName = "Any seven";
        }
        return worstGameName;
    }
        
}
