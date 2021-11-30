package com.bridg.mak;

public class GamblerSimulator {

    static int BET_PER_DAY = 1;

    GamblerSimulator() {

    }

    public static void main(String[] args) {
        checkWinorLoose();
        printResult();
    }

    private static void printResult() {
        Stakes stakes = new Stakes();
        // print the stake and bet per day
        System.out.println("Total Stakes in Day :" + stakes.getTotalStakes());
        System.out.println("Total bet per game : " + stakes.getBetPerGame());
    }

    private static void checkWinorLoose() {
        Stakes stakes = new Stakes();
        int minStake = stakes.getTotalStakes() - 50;
        int maxStake = stakes.getTotalStakes() + 50;

        while (stakes.getTotalStakes() > minStake && stakes.getTotalStakes() < maxStake) {
            int betState = (int) ((Math.random() * 10)) % 2;

            int bet = stakes.getTotalStakes();

            if (betState == 1) {

                stakes.setTotalStakes(bet + BET_PER_DAY);

            } else {

                stakes.setTotalStakes(bet - BET_PER_DAY);
            }
        }
    }
}
