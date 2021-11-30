package com.bridg.mak;

public class GamblerSimulator {

    static int BET_PER_DAY = 1;
    private static int counter;
    static final int TOTAL_DAYS=20;
    static int[] perDayAmount = new int[TOTAL_DAYS];//for the storing day wiz amount
    GamblerSimulator() {
        counter=0;//initialize the counter
    }

    public static void main(String[] args) {
        Stakes stakes = new Stakes();

        int totalDays = TOTAL_DAYS;
        while (totalDays > 0) {
            checkWinnerLoose();
            totalDays--;
        }
        printResult();

    }
    //Print the day wise amount
    private static void printResult() {
        for (int i = 0; i <TOTAL_DAYS; i++) {
            System.out.println("Day " + (i+1) + " Amount is " + perDayAmount[i]);
        }
    }

//Check the bet win or loose
    private static void checkWinnerLoose() {
        Stakes stakes = new Stakes();
        int loosCash = 0;
        int winCash = 0;
        //50% of Stake
        int minStake = stakes.getTotalStakes() - 50;
        int maxStake = stakes.getTotalStakes() + 50;
        //Win lost 50% stake
        while (stakes.getTotalStakes() > minStake && stakes.getTotalStakes() < maxStake) {
            int betState = (int) ((Math.random() * 10)) % 2;

            int bet = stakes.getTotalStakes();

            if (betState == 1) {
                stakes.setTotalStakes(bet + BET_PER_DAY);
                winCash++;

            } else {
                stakes.setTotalStakes(bet - BET_PER_DAY);
                loosCash++;
            }
        }
        calculatePerDayAmmount(stakes.getTotalStakes(), winCash, loosCash);

    }

    private static void calculatePerDayAmmount(int totalStakes, int winCash, int loosCash) {
        // Storing the win or lost amount in variable
        if (totalStakes == 150) {
            perDayAmount[counter++] = winCash;
        } else perDayAmount[counter++] = loosCash;
    }
}
