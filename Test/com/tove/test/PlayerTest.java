package com.tove.test;

import com.tove.dicegame.Player;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void testCreatePlayer () {

        Player player = new Player("Zelda");

        assertNotNull(player);
        assertEquals(0, player.points);
        assertEquals("Zelda", player.username);
    }

    @Test
    public void testThrowDices() throws InterruptedException {

        Player benny = new Player("Benny");
        benny.throwDices(2);
        assertTrue(benny.points >= 2);
        assertTrue(benny.points <= 12);
    }

    @Test
    public void testThrowDie() {
        Player player = new Player("");
        assertTrue(player.throwDie() > 0);
        assertTrue(player.throwDie() < 7);
    }

}