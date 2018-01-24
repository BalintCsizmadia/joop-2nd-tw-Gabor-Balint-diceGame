package com.codecool;
import java.text.DecimalFormat;


public class Statistics{

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
        DecimalFormat df = new DecimalFormat("###.##");
        String snakePercent = df.format(snakeNumber);
        float aceDeuceNumber = (((float)aceDeuce / (float)allGame) * (float)100);
        String aceDucePercent = df.format(aceDeuceNumber);
        float yoNumber = (((float)yo / (float)allGame) * (float)100);
        String yoPercent = df.format(aceDeuceNumber);
        float boxCarsNumber = (((float)boxCars / (float)allGame) * (float)100);
        String boxCarsPercent = df.format(boxCarsNumber);
        float hiLoNumber = (((float)hiLo / (float)allGame) * (float)100);
        String hiLoPercent = df.format(hiLoNumber);
        float anyCrapsNumber = (((float)anyCraps / (float)allGame) * (float)100);
        String anyCrapsPercent = df.format(anyCrapsNumber);
        float anySevenNumber = (((float)anySeven / (float)allGame) * (float)100);
        String anySevenPercent = df.format(anySevenNumber);
        //System.out.println(snakePercent + "\n" + aceDucePercent);       
        return snakePercent;

    }
    
    
}