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
        if (Integer.parseInt(args[0]) >= 1) {
        Simulation simulation = generateSimulation(Integer.parseInt(args[0]));    
        Simulator simulator = new Simulator(simulation, logger);
        logger.log("All games", Integer.toString(simulator.run().stats.allGame));
        logger.log("Snake eye winning percent: ", simulator.run().stats.calcStaticSnakePercent() + " %");
        logger.log("Ace-deuce winning percent: ", simulator.run().stats.calcStaticAcePercent() + " %");
        } else {
            logger.log("Error", "Enter a bigger number");
        }

    }
}