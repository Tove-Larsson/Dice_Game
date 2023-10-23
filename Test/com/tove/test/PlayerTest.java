package com.tove.test;

import com.tove.dicegame.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void testCreatePlayer () {

        Player player = new Player("Zelda");

        assertNotNull(player);
        assertEquals(0, player.points);
        assertEquals("Zelda", player.username);
    }






}