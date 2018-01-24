package com.codecool;

public class Statistics{

    public Statistics() {
        Logger log = new Logger();
        Simulation sim = new Simulation();
        Simulator simu = new Simulator(sim, log);

        System.out.println(simu.run().getStatistics());


       // System.out.println(result.getStatistics());

        
    }
    
}