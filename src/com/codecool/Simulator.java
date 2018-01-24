package com.codecool;


public class Simulator {

    Simulation simulation;
    Logger logger;

    public Simulator(Simulation simulation, Logger logger) {
        this.simulation = simulation;
        this.logger = logger;
    }

    public Result run() {
        simulation.generateData();
        simulation.load();
       // logger.log("run", "adatok feldolgozva és visszatoltve");
        int wins = 0;
/*
        for(int i = 0 ; i < simulation.intArray.length; i++){
            
            int x = simulation.intArray[i];
            if (x == 7 || x == 11) wins++;
            if (x == 2 || x == 3 || x == 12){
                break;
            }
            else {
                for(int j = 0; j < simulation.intArray.length; j++){
                int y = simulation.intArray[i+j];
                if (y == 7) break;
                if (y == x) wins++;
                }
            } 
        }
        System.out.println(wins);
*/       

        /*
        C & E: kombinált fogadás, a tét fele craps-re és a másik fele Yo-ra 
        Horn: kombinált fogadás, 1 egységgel fogadsz a 2, 3, 11 és 12-re egyszerre.
        Whirl vagy World: 5 egységes fogadás horn-ra és any seven-re egyszerre 
        Field: arra fogadsz, hogy 2, 3, 4, 9, 10, 11 vagy 12 lesz a következő dobás.
        */


        int snakeEye = 0;
        int aceDeuce = 0;
        int yo = 0; // 11
        int boxCars = 0;
        int hiLo = 0; // nyertes ha a dobás 2 vagy 12
        int anyCraps = 0; // nyertes 2, 3 és 12 esetén
        int anySeven = 0;

        int allGame = simulation.intArray.length;

        for (int i = 0; i < simulation.intArray.length; i++) {
            int number = simulation.intArray[i];
            if (number == 2) {
                snakeEye++;
            } else if (number == 3) {
                aceDeuce++;
            } else if (number == 11) {
                yo++;
            } else if (number == 12) {
                boxCars++;
            }
            if (number == 2 || number == 12) {
                hiLo++;
            }
            if (number == 2 || number == 3 || number == 12) {
                anyCraps++;
            } else if (number == 7) {
                anySeven++;
            }
            
        }
        Result result = new Result(snakeEye, aceDeuce, yo, boxCars, hiLo, anyCraps, anySeven, allGame);
        
        System.out.println(result.getStatistics()); // most ez printel egyet

        return result;

        
    }
    /*
    public String toString() {
        return "Snake eye: " + snakeEye + " wins from " + allGame + " games.\n" + 
               "Ace-deuce: " + aceDeuce + " wins from " + allGame + " games.\n" + 
               "Yo: " + yo + " wins from " + allGame + " games.\n" +
               "Boxcars: " + boxCars + " wins from " + allGame + " games.\n" +
               "Hi-lo: " + hiLo + " wins from " + allGame + " games.\n" +
               "Any craps: " + anyCraps + " wins from " + allGame + " games.\n" + 
               "Any seven: " + anySeven + " wins from "  + allGame + " games.";
    */
    
        
        
}
