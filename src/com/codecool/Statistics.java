package com.codecool;

public class Statistics{

    public Statistics() {
        Logger log = new Logger();
        Simulation sim = new Simulation();
        Simulator simu = new Simulator(sim, log);
/*
        int snakeEye = simu.run().snakeEye;
        int aceDeuce = simu.run().aceDeuce;
        int yo = simu.run().yo;
        int boxCars = simu.run().boxCars;
        int hiLo = simu.run().hiLo;
        int anyCraps = simu.run().anyCraps;
        int anySeven = simu.run().anySeven;
        int allGame = simu.run().allGame;
        
        Result result = new Result(snakeEye, aceDeuce, yo, boxCars, hiLo, anyCraps, anySeven, allGame);

        System.out.println(result.getStatistics());
*/
        
    }
    
}