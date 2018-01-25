package com.codecool;

import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Simulation {
    int limit;
    int[] rollTheDice;
    StringBuffer allNumber;
    int[] intArray;

    public Simulation(int limit) {
        this.limit = limit;
        this.rollTheDice = new int[limit];
    }
    
    public void generateData() {
        int[] tempArr = new int[rollTheDice.length + 1];
        Random randomDice = new Random();
        for (int i = 0; i <= limit; i++){
            int firstDie = randomDice.nextInt(6) + 1;
            int secondDie = randomDice.nextInt(6) + 1;
            int result = firstDie + secondDie;
            tempArr[i] = result;
        }
        rollTheDice = tempArr;

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("../data/results.csv", true));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < rollTheDice.length -1; i++) {
                    sb.append(rollTheDice[i]);
                    sb.append(",");
            }
            String finish = sb.toString().replaceAll(",$", "");
            bw.write (finish + "\n");
            bw.close();
        }
        catch (IOException ioe) {
                ioe.printStackTrace();
        }
    }

    public void load() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("../data/results.csv"));
            allNumber = new StringBuffer("");
            String line = null;
            while((line = br.readLine()) != null){
                allNumber.append(line + ",");
            }
        }
        catch (IOException ice) {
            ice.printStackTrace();
        }
        String allNumberString = allNumber.toString();
        String[] stringArray = allNumberString.split(",");
        intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            String numberAsString = stringArray[i];
            intArray[i] = Integer.parseInt(numberAsString);
        }

    }

}