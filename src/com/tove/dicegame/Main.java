package com.tove.dicegame;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Instantiate a scanner and Random
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        // Variables
        int numberOfPlayers = 0;
        int highestScore = 0;

        System.out.println("Input how many dices you want");
        int numberOfDices = scan.nextInt();

        System.out.println("How many turns would you like to play?");
        int numberOfTurns = scan.nextInt();


        // A do while loop to make sure the player can't choose less than 2 players
        do {
            System.out.println("How many players? It has to be at least 2");
            numberOfPlayers = scan.nextInt();

        } while(numberOfPlayers < 2);
        scan.nextLine(); // I only use this so nextInt does not mess with nextLine

        Player[] players = new Player[numberOfPlayers];

        // This for loop is asking for all of the players names
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter username for player" + " " + (i + 1));
            String username = scan.nextLine();
            Player player = new Player(username);
            players[i] = player;

        }

        for (int t = 0; t < numberOfTurns; t++) {

            System.out.println("----- Turn " + (t + 1) + " -----");

            for (int j = 0; j < players.length; j++) {

                int totalSum = 0;

                System.out.print(players[j].username + " is throwing the dice: ");

                for (int i = 0; i < numberOfDices; i++) {

                    // Dice
                    int die = rand.nextInt(1, 7);

                    totalSum += die;

                    System.out.print(die + " ");

                    TimeUnit.SECONDS.sleep(1);

                }

                // Used to make a new row after the throw to make sure the sum is printed on a new row
                System.out.println();

                players[j].points += totalSum;

                System.out.println(players[j].username + " total sum is " + players[j].points);
            }

        }

        Player winner = new Player("dummy user");


        for (int i = 0; i < players.length; i++) {
            if (players[i].points > highestScore) {
                highestScore = players[i].points;
                winner = players[i];
            }
        }
        System.out.println("The winner is " + winner.username + " with " + winner.points + " points in total");
    }

}


