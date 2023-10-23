package com.tove.dicegame;


import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Player {



    public String username;
    public int points;



    public Player(String username) {
        this.username = username;
        this.points = 0;

    }
    // In this class I create the players different values and make a constructor to use in main


    public void throwDices(int numberOfDice) throws InterruptedException {

        for (int i = 0; i < numberOfDice; i++) {
            this.points += throwDie();
            TimeUnit.SECONDS.sleep(1);
        }

    }

    public int throwDie() {
        Random rand = new Random();
        int die = rand.nextInt(1,7);
        System.out.print(die + " ");

        return die;
    }



}
