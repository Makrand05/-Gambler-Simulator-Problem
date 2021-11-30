package com.bridg.mak;

public class GamblerSimulator {


    GamblerSimulator(){

    }
    public static void main(String[] args) {
        checkWinorLoose();
        printResult();
    }

    private static void printResult() {
        Stakes stakes = new Stakes();
       // print the stake and bet per day
        System.out.println("Total Stakes in Day :" + stakes.getStakePerDay());
        System.out.println("Total bet per game : " + stakes.getBetPerGame());
    }

    private static void checkWinorLoose() {
        int betState= (int) ((Math.random()*10))%2;
        Stakes stakes=new Stakes();
        int bet=stakes.getBetPerGame();
        int stake=stakes.getStakePerDay();
        if(betState==1){
            System.out.println("You Win the bet");
            stakes.setStakePerDay(stake+bet);

        }else {
            System.out.println("You Lost the bet");
            stakes.setStakePerDay(stake-bet);
        }
    }
}
