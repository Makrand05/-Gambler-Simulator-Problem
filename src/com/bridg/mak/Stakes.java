package com.bridg.mak;

public class Stakes {
    static int totalStakes=100;
    static int betPerGame=1;
    int month;

    public int getStakePerDay() {
        return totalStakes;
    }

    public void setStakePerDay(int stakePerDay) {
        this.totalStakes = stakePerDay;
    }

    public int getBetPerGame() {
        return betPerGame;
    }

    public void setBetPerGame(int betPerGame) {
        this.betPerGame = betPerGame;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
