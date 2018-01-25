package com.codecool;

public class Main{

    int round;

    public static Simulation generateSimulation(int round) {
        Simulation newSimulation = new Simulation(round);
        newSimulation.generateData();
        newSimulation.load();
        return newSimulation;
    }
    
    public static void main(String[] args) {
        Logger logger = new Logger();
        if (Integer.parseInt(args[0]) >= 1) {
        Simulation simulation = generateSimulation(Integer.parseInt(args[0]));    
        Simulator simulator = new Simulator(simulation, logger);
        Statistics path = simulator.run().stats;
        int allGames = path.allGame;

        logger.simpleLog("\033[H\033[2J");
        logger.simpleLog("Calculating.");
        logger.simpleLog("--------------------------");
        path.loadWaiting(800);
        logger.simpleLog("\033[H\033[2J");
        logger.simpleLog("Calculating..");
        logger.simpleLog("||||----------------------");
        path.loadWaiting(600);
        logger.simpleLog("\033[H\033[2J");
        logger.simpleLog("Calculating...");
        logger.simpleLog("|||||||||||---------------");
        path.loadWaiting(1000);
        logger.simpleLog("\033[H\033[2J");
        logger.simpleLog("Calculating.");
        logger.simpleLog("|||||||||||||||||||-------");
        path.loadWaiting(1100);
        logger.simpleLog("\033[H\033[2J");
        logger.simpleLog("Calculating..");
        logger.simpleLog("|||||||||||||||||||||||---");
        path.loadWaiting(500);
        logger.simpleLog("\033[H\033[2J");
        logger.simpleLog("Calculating...");
        logger.simpleLog("||||||||||||||||||||||||||");
        path.loadWaiting(700);
        logger.simpleLog("\033[H\033[2J");
        logger.simpleLog("Simulation completed.");
        path.loadWaiting(700);
        logger.twoDatasLog("Details from ", Integer.toString(allGames) + " simulations:\n") ;
       // logger.log("Games", Integer.toString(allGames) + " simulations\n");
       // logger.log("Snake eye winning percent", simulator.run().stats.calcStaticSnakePercent() + " %");
       // logger.log("Ace-deuce winning percent", simulator.run().stats.calcStaticAcePercent() + " %");
        logger.informLog("Snake eye: ", path.snakeEye, "wf", allGames, " games.");  // 30:1
        logger.percentLog("Snake eye winning percent: ", path.calcSnakePercent(), " %\n");
        logger.informLog("Ace-deuce: ", path.aceDeuce, "wf", allGames, " games.");  // 15:1
        logger.percentLog("Ace-deuce winning percent: ", path.calcAcePercent(), " %\n");
        logger.informLog("Yo: ", path.yo, "wf", allGames, " games.");               // 15:1
        logger.percentLog("Yo winning percent: ", path.calcYoPercent(), " %\n");
        logger.informLog("Boxcars: ", path.boxCars, "wf", allGames, " games.");     // 30:1
        logger.percentLog("Boxcars winning percent: ", path.calcBoxCarsPercent(), " %\n");
        logger.informLog("Hi-lo: ", path.hiLo, "wf", allGames, " games.");          // 15:1
        logger.percentLog("Hi-lo winning percent: ", path.calcHiLoPercent(), " %\n");
        logger.informLog("Any craps: ", path.anyCraps, "wf", allGames, " games.");  // 7:1
        logger.percentLog("Any craps winning percent: ", path.calcAnyCrapsPercent(), " %\n");
        logger.informLog("Any seven: ", path.anySeven, "wf", allGames, " games.");  // 4:1
        logger.percentLog("Any seven winning percent: ", path.calcAnySevenPercent(), " %\n");

        String score = Integer.toString(simulator.run().getTheBestBetScore()); // legtöbbször nyert-pontszám
     //   System.out.println(path.theLeastWin()); // legkevesebbszer nyert -pontszám
     // System.out.println(path.theWorstBetGameName()); // legkevesebbet nyert - játék neve
        logger.simpleLog("The winner game's name: " + simulator.run().getTheBestBetName() + ", score: " + score); 
        // legtöbbször nyert - játék neve (ezt már a Resultból szedi ki)
        

        } else {
            logger.log("Error", "Enter a bigger number");
        }
    }
}