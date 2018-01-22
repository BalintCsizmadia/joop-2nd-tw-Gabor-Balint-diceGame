package com.codecool;

import java.util.Random;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.util.*;
public class Simulation{

    int firstDie, secondDie;

    public Simulation(int firstDie, int secondDie){
        this.firstDie = firstDie;
        this.secondDie = secondDie;
    }
    
    public void generateDate(){
        Random randomDice = new Random();
        int firstDie = randomDice.nextInt(6) + 1;
        int secondDie = randomDice.nextInt(6) + 1;
        int result = firstDie + secondDie;
        /*System.out.println(firstDie);
        System.out.println(secondDie);
        System.out.println(result);*/
        String res = "" + result;


        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("com/codecool/results.csv", true));
            StringBuilder sb = new StringBuilder();
            bw.write (res);
            bw.append(",");
            bw.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
        }
    }

    
}