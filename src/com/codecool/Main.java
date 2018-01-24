package com.codecool;

public class Main{

    int round;

    public Simulation generateSimulation(int round) {
        Simulation rounds = new Simulation();
        return null;
    }
    
    public static void main(String[] args) {
        Logger logger = new Logger();
        Simulation simulation = new Simulation();
        Simulator simulator = new Simulator(simulation, logger);
        simulator.run();
        Statistics statistics = new Statistics();

    }
}