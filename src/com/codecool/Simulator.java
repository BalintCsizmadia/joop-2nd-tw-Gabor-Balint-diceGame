package com.codecool;

public class Simulator {

    Simulation simulation;
    Logger logger;

    public Simulator(Simulation simulation, Logger logger) {
        this.simulation = simulation;
        this.logger = logger;
    }

    public void run() {
        // code
        simulation.generateData();
        simulation.load();
        logger.log("run", "adatok feldolgozva és visszatoltve");
        int wins = 0;
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
        
    }
        
        
}
