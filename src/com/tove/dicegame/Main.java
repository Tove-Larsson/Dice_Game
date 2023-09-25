package com.tove.dicegame;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Input how many dices you want with numbers");
        int numberOfDices = scan.nextInt();

        System.out.println("How many turns would you like to play?");
        int numberOfTurns = scan.nextInt();


        System.out.println("Input how many players in with numbers");
        int numberOfPlayers = scan.nextInt();
        String newRow = scan.nextLine(); // I only use this so nextInt does not mess with nextLine

        Player[] players = new Player[numberOfPlayers];

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter username for player" + " " + (i + 1));
            String username = scan.nextLine();
            Player player = new Player(username, numberOfPlayers, numberOfDices, numberOfTurns);
            players[i] = player;
        }


        for (int i = 0; i < players.length; i++) {
            System.out.println("Username " + players[i].username);
        }


    }



}


