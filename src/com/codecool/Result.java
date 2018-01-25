package com.codecool;


public class Result {
    
    Statistics stats;


    public Result(Statistics stats) {
        this.stats = stats;
    }
    

    public Statistics getStatistics() {
        return stats;
    }

    public String getTheBestBetName() {
        return stats.theBestBetGameName();
    }
    public int getTheBestBetScore() {
        return stats.theMostWin();
    }
}
