package com.codecool;

import java.util.Scanner;
import java.util.InputMismatchException;

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
            
            logger.simpleLog("Craps Casino Calculator\n");
            while(true) {
                logger.simpleLog("( 1.) Wins from games");
                logger.simpleLog("( 2.) Winning percent");
                logger.simpleLog("( 3.) Make me millionaire, bet this!");
                logger.simpleLog("( 4.) Rules and chances");
                logger.simpleLog("( 0.) Exit");
                int answer = 0;
                Scanner scanner = new Scanner(System.in);
                try {
                    answer = scanner.nextInt();
                } 
                catch (InputMismatchException e) {
                    System.out.print("Invalid number.\n");
                }

                long startTime = System.nanoTime();
                if(answer == 1) {
                    logger.loadScreen();
                    logger.twoDatasLog("Details from ", Integer.toString(allGames) + " simulations:\n\n");
                    logger.informLog("Snake eye: ", path.snakeEye, "wf", allGames, " games.\n");  // 30:1
                    logger.informLog("Ace-deuce: ", path.aceDeuce, "wf", allGames, " games.\n");  // 15:1
                    logger.informLog("Yo: ", path.yo, "wf", allGames, " games.\n");               // 15:1
                    logger.informLog("Boxcars: ", path.boxCars, "wf", allGames, " games.\n");     // 30:1
                    logger.informLog("Hi-lo: ", path.hiLo, "wf", allGames, " games.\n");          // 15:1
                    logger.informLog("Any craps: ", path.anyCraps, "wf", allGames, " games.\n");  // 7:1
                    logger.informLog("Any seven: ", path.anySeven, "wf", allGames, " games.\n");  // 4:1
                    final long duration = (System.nanoTime() - startTime);
                    logger.twoDatasLog("\nProcessing time: ", Double.toString(duration / 1000000000.0) + " sec\n");   
                }
                else if(answer == 2) {
                    logger.loadScreen();
                    logger.twoDatasLog("Details from ", Integer.toString(allGames) + " simulations:\n");
                    logger.percentLog("Snake eye winning percent: ", path.calcSnakePercent(), " %\n");
                    logger.percentLog("Ace-deuce winning percent: ", path.calcAcePercent(), " %\n");
                    logger.percentLog("Yo winning percent: ", path.calcYoPercent(), " %\n");
                    logger.percentLog("Boxcars winning percent: ", path.calcBoxCarsPercent(), " %\n");
                    logger.percentLog("Hi-lo winning percent: ", path.calcHiLoPercent(), " %\n");
                    logger.percentLog("Any craps winning percent: ", path.calcAnyCrapsPercent(), " %\n");
                    logger.percentLog("Any seven winning percent: ", path.calcAnySevenPercent(), " %\n");
                    final long duration = (System.nanoTime() - startTime);
                    logger.twoDatasLog("\nProcessing time: ", Double.toString(duration / 1000000000.0) + " sec\n");   
                }
                else if(answer == 3) {
                    
                    logger.loadScreen();
                    logger.twoDatasLog("Details from ", Integer.toString(allGames) + " simulations:\n");

                    String score = Integer.toString(simulator.run().getTheBestBetScore());
                    // from the Result.
                    logger.simpleLog("The winner game's name: " + simulator.run().getTheBestBetName() + " (score: " + score + ")"); 
                    final long duration = (System.nanoTime() - startTime);
                    logger.twoDatasLog("\nProcessing time: ", Double.toString(duration / 1000000000.0) + " sec\n");   
                }
                else if (answer == 4) {
                    logger.simpleLog("\033[H\033[2J");
                    logger.simpleLog("Snake eye:  Wins if a 2 is thrown. Payoff 30:1\n");
                    logger.simpleLog("Ace Duece: Wins if a 3 is rolled. Payoff 15:1\n");
                    logger.simpleLog("Yo: Wins if a 11 is thrown. Payoff 15:1\n");
                    logger.simpleLog("Boxcars: Wins if a 12 is thrown. Payoff 30:1\n");
                    logger.simpleLog("Hi-lo: Wins if a 2, or 12 is thrown. Payoff 15:1\n");
                    logger.simpleLog("Any craps: Wins if a 2, 3 or 12 is thrown. Payoff 7:1\n");
                    logger.simpleLog("Any Seven: Wins if a 7 is rolled. Payoff 4:1\n");
                }
                else if(answer == 0) {
                    scanner.close();
                    break;
                }
            }
        } 
        else {
            logger.log("Error", "Enter a bigger number");
        }    
    }
}