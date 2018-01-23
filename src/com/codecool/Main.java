package com.codecool;

public class Main{

    public Simulation generateSimulation(int round) {
        return null;
    }
    
    public static void main(String[] args) {
        Logger logger = new Logger();
        Simulation simulation = new Simulation();
        Simulator simulator = new Simulator(simulation, logger);
        simulator.logger.log("Test message", "it works");
        simulator.run();
        simulation.load();

    }
}