package com.bridg.mak;

public class Stakes {
    static int totalStakes = 100;

    public static int getTotalStakes() {
        return totalStakes;
    }

    public static void setTotalStakes(int totalStakes) {
        Stakes.totalStakes = totalStakes;
    }

    public static int getBetPerGame() {
        return betPerGame;
    }

    public static void setBetPerGame(int betPerGame) {
        Stakes.betPerGame = betPerGame;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    static int betPerGame = 1;
    int month;
}

