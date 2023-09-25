package com.tove.dicegame;

public class Player {

    public String username;
    public int numberOfPlayers;
    public int numberOfDices;
    public int numberOfTurns;

    public int points;

    public Player(String username, int numberOfPlayers, int numberOfDices, int numberOfTurns) {
        this.username = username;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfDices = numberOfDices;
        this.numberOfTurns = numberOfTurns;
        this.points = 0;
    }
}
