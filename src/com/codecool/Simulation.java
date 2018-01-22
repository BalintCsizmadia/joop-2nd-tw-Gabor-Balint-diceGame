package com.codecool;

import java.util.Random;

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
    }
    
}