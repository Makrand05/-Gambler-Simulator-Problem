package com.bridg.mak;

public class GamblerSimulator {


    GamblerSimulator(){

    }
    public static void main(String[] args) {
        Stakes stakes = new Stakes(100,1);
        //print the stake and bet per day
        System.out.println("Total Stakes in Day :" + stakes.getStakePerDay());
        System.out.println("Total bet per mage : " + stakes.getBetPerGame());
    }
}
