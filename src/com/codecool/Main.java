package com.codecool;

import java.util.Scanner;

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
            String processTime;   
            
            
            
            while(true){
                logger.simpleLog("( 1.) Win from games.");
                logger.simpleLog("( 2.) Winning percent.");
                logger.simpleLog("( 3.) Make me millionare, bet this!");
                logger.simpleLog("( 0.) Exit.");
                int answer;
                Scanner scanner = new Scanner(System.in);
                answer = scanner.nextInt();
                long startTime = System.nanoTime();
                if(answer == 1){
                    logger.loadScreen();
                    logger.twoDatasLog("Details from ", Integer.toString(allGames) + " simulations:\n");
                    logger.informLog("Snake eye: ", path.snakeEye, "wf", allGames, " games.");  // 30:1
                    logger.informLog("Ace-deuce: ", path.aceDeuce, "wf", allGames, " games.");  // 15:1
                    logger.informLog("Yo: ", path.yo, "wf", allGames, " games.");               // 15:1
                    logger.informLog("Boxcars: ", path.boxCars, "wf", allGames, " games.");     // 30:1
                    logger.informLog("Hi-lo: ", path.hiLo, "wf", allGames, " games.");          // 15:1
                    logger.informLog("Any craps: ", path.anyCraps, "wf", allGames, " games.");  // 7:1
                    logger.informLog("Any seven: ", path.anySeven, "wf", allGames, " games.");  // 4:1
                    long duration = (System.nanoTime() - startTime);
                    //processTime = ;
                    logger.twoDatasLog("\nProcess time: ", Double.toString(duration / 1000000000.0) + " sec");
                    
                }
                else if(answer == 2){
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
                    logger.twoDatasLog("\nProcess time: ", Double.toString(duration / 1000000000.0) + " sec");
                    
                }
                else if(answer == 3){
                    
                    logger.loadScreen();
                    logger.twoDatasLog("Details from ", Integer.toString(allGames) + " simulations:\n");

                    String score = Integer.toString(simulator.run().getTheBestBetScore()); // legtöbbször nyert-pontszám
                    //   System.out.println(path.theLeastWin()); // legkevesebbszer nyert -pontszám
                    // System.out.println(path.theWorstBetGameName()); // legkevesebbet nyert - játék neve
                    logger.simpleLog("The winner game's name: " + simulator.run().getTheBestBetName() + ", score: " + score); 
                    // from the Result.
                    final long duration = (System.nanoTime() - startTime);
                    logger.twoDatasLog("\nProcess time: ", Double.toString(duration / 1000000000.0) + " sec");
                    
                }
                else if(answer == 0){
                    scanner.close();
                    break;
                }
            }
        } else {
            logger.log("Error", "Enter a bigger number");
        }
        
    }
}