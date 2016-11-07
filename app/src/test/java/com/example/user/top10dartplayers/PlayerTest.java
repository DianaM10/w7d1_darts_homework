package com.example.user.top10dartplayers;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {

    Player player1;
    Player player2;

    @Before
    public void before() {
        player1 = new Player("Phil Taylor", "The Power", 1);
        player2 = new Player("Raymond van Barneveld", "Barney");
    }

    @Test
    public void playerHasName(){
        assertEquals("Phil Taylor", player1.getName());
    }

    @Test
    public void playerHasNickname() {
        assertEquals("The Power", player1.getNickName());
        assertEquals("Barney", player2.getNickName());
    }

    @Test
    public void playerHasRanking() {
        assertEquals(1, player1.getRanking());
        assertEquals(0, player2.getRanking());
    }

    @Test
    public void setPlayerRanking() {
        player1.setRanking(10);
        assertEquals(10, player1.getRanking());
    }

    @Test
    public void setPlayerName() {
        player1.setName("Homer Simpson");
        assertEquals("Homer Simpson", player1.getName());
    }

    @Test
    public void setPlayerNickName() {
        player2.setNickName("Bawbag");
        assertEquals("Bawbag", player2.getNickName());
    }

    @Test
    public void outputString() {
        assertEquals("Name: Phil Taylor Nickname: The Power Ranking: 1", player1.toString());
    }


}
