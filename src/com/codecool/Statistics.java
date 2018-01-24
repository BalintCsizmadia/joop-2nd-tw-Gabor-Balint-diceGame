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


    public Statistics(int snakeEye, int aceDeuce, int yo, int boxCars, int hiLo, int anyCraps, int anySeven, int allGame) {
        this.snakeEye = snakeEye;
        this.aceDeuce = aceDeuce;
        this.yo = yo;
        this.boxCars = boxCars;
        this.hiLo = hiLo;
        this.anyCraps = anyCraps;
        this.anySeven = anySeven;
        this.allGame = allGame;

       // System.out.println(result.getStatistics());
  
    }

    public String calcStaticSnakePercent(){
        float snakeNumber = (((float)snakeEye / (float)allGame) * (float)100);
        String snakePercent = df.format(snakeNumber);
        return snakePercent;
    }
    public String calcStaticAcePercent(){
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
    public String anySevenPercent() {
        float anySevenNumber = (((float)anySeven / (float)allGame) * (float)100);
        String anySevenPercent = df.format(anySevenNumber);
        return anySevenPercent;
    }
        
}
    
    
