package com.codecool;

public class Main{

    int round;

    public static Simulation generateSimulation(int round) {
        Simulation rounds = new Simulation();
        rounds.generateData();
        rounds.load();
        
        return rounds;
    }
    
    public static void main(String[] args) {
        Logger logger = new Logger();
        Simulation simulation = generateSimulation(100);
        Simulator simulator = new Simulator(simulation, logger);
        simulator.run();

    }
}