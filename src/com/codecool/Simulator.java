package com.codecool;


public class Simulator {

    Simulation simulation;
    Logger logger;

    public Simulator(Simulation simulation, Logger logger) {
        this.simulation = simulation;
        this.logger = logger;
    }

    public Result run() {

/*      int wins = 0;
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
*/       
        int snakeEye = 0;
        int aceDeuce = 0;
        int yo = 0;
        int boxCars = 0;
        int hiLo = 0;
        int anyCraps = 0;
        int anySeven = 0;
        int allGame = simulation.intArray.length;

        for (int i = 0; i < allGame; i++) {
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
        Statistics stats = new Statistics(snakeEye, aceDeuce, yo, boxCars, hiLo, anyCraps, anySeven, allGame);
        Result result = new Result(stats);
       // result.getStatistics();
        
       return result; 
    }
        
}
