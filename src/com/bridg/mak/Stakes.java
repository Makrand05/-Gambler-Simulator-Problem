package com.bridg.mak;

public class Stakes {
    int stakePerDay;
    int betPerGame;
    int month;

    public Stakes(int i, int i1) {
        setStakePerDay(i);
        setBetPerGame(i1);
   }

    public int getStakePerDay() {
        return stakePerDay;
    }

    public void setStakePerDay(int stakePerDay) {
        this.stakePerDay = stakePerDay;
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
