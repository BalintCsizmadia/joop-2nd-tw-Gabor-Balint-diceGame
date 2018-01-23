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
        
    }
}