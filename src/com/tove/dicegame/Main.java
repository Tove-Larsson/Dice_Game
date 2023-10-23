package com.tove.dicegame;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws InterruptedException {


        // Instantiate a scanner
        Random rand = new Random();

        System.out.println("Input how many dices you want");
        int numberOfDices = ScannerClass.getInt(1);

        System.out.println("How many turns would you like to play?");
        int numberOfTurns = ScannerClass.getInt(1);

        int numberOfPlayers = 0;

        System.out.println("How many players? It has to be at least 2");
        numberOfPlayers = ScannerClass.getInt(2);


        Player[] players = new Player[numberOfPlayers];

        // This for loop is asking for all of the players names
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter username for player" + " " + (i + 1));
            String username = ScannerClass.getString();
            Player player = new Player(username);
            players[i] = player;

        }

        for (int t = 0; t < numberOfTurns; t++) {

            System.out.println("----- Turn " + (t + 1) + " -----");

            for (int j = 0; j < players.length; j++) {

                int totalSum = 0;

                System.out.print(players[j].username + " is throwing the dice: ");

                players[j].throwDices(numberOfDices);

                System.out.println();

                players[j].points += totalSum;

                System.out.println(players[j].username + " total sum is " + players[j].points);
            }

        }

        List<Player> winners = new ArrayList<>();
        int highestScore = 0;

        for (int i = 0; i < players.length; i++) {
            if (players[i].points > highestScore) {
                highestScore = players[i].points;
                winners.clear();
                winners.add(players[i]);
            }
            else if(players[i].points == highestScore) {
                winners.add(players[i]);
            }
        }
        if (winners.size() == 1) {
            Player winner = winners.get(0);
            System.out.println("The winner is " + winner.username + " with " + winner.points + " points in total");

        } else {

            System.out.println("The winners are ");

            for (int i = 0; i < winners.size(); i++) {
                System.out.println(winners.get(i).username);

            }

            System.out.println("with " + highestScore + " points");

        }


    }

}


