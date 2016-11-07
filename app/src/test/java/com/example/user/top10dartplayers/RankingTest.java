package com.example.user.top10dartplayers;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by user on 07/11/2016.
 */

public class RankingTest {

    ArrayList<Player> testRanking;
    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Player player5;

    @Before
    public void before() {
        testRanking = new ArrayList<Player>();
        player5 = new Player("Jan ver der Rassel", "Rassel Dazzle", 5);
        testRanking.add(player1);
        testRanking.add(player2);
        testRanking.add(player3);
        testRanking.add(player4);


    }

    @Test
    public void getRankingTest() {
        Ranking ranking = new Ranking();
        assertNotNull(ranking.getRanking());
    }

    @Test
    public void createRankingWithTestList() {
        Ranking ranking = new Ranking(testRanking);
        assertEquals(4, ranking.getLength());
    }

    @Test
    public void getRankingAtIndexTest() {
        Ranking ranking = new Ranking(testRanking);
        Player result = ranking.getRankingAtIndex(2);
        assertEquals(player3, result);
    }

    @Test
    public void addPlayerTest() {
        Ranking ranking = new Ranking();
        int originalRanking = ranking.getLength();
        ranking.add(player5);
        assertEquals(originalRanking + 1, ranking.getLength());
    }



}
