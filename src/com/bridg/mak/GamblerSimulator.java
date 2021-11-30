package com.bridg.mak;

public class GamblerSimulator {

    public static void main(String[] args) {
        Stakes stakes = new Stakes();
        stakes.setStakePerDay(100);
        stakes.setBetPerGame(1);
        System.out.println("Total Stakes in Day :" + stakes.getStakePerDay());
        System.out.println("Total bet per mage : " + stakes.getBetPerGame());
    }
}
