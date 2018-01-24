package com.codecool;

public class Main{

    int round;

    public static Simulation generateSimulation(int round) {
        Simulation rounds = new Simulation(round);
        rounds.generateData();
        rounds.load();
        
        return rounds;
    }
    
    public static void main(String[] args) {
        Logger logger = new Logger();
        Simulation simulation = generateSimulation(Integer.parseInt(args[0]));
        Simulator simulator = new Simulator(simulation, logger);
        simulator.run();
        logger.log("all games", Integer.toString(simulator.run().stats.allGame));
        logger.logStringStatistic(simulator.run().stats.calcStaticSnakePercent());

    }
}