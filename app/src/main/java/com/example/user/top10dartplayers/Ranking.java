package com.example.user.top10dartplayers;

import java.util.ArrayList;


/**
 * Created by user on 07/11/2016.
 */

public class Ranking {

    protected ArrayList<Player> mRanking;
    Player player1;
    Player player2;
    Player player3;
    Player player4;





    public Ranking() {
        mRanking = new ArrayList<Player>();
        setUpPlayers();
    }

    public Ranking(ArrayList<Player> existingRanking) {
        mRanking = new ArrayList<Player>(existingRanking);
    }

    public void setUpPlayers() {
        Player[] ranking = {
               player1 = new Player("Phil Taylor", "The Power", 1),
                player2 = new Player("Bob Anderson", "The Limestone Cowboy", 2),
                player3 = new Player("Carlos Rodriguez", "The Spanish Assassin", 3),
                player4 = new Player("Darren Webster", "Demolition Man", 4)

        };
                for (Player player : ranking){
                  add(player);
                }

    }
    public void add(Player player) {
        mRanking.add(player);
    }

    public ArrayList<Player> getRanking() {
        return new ArrayList<Player>(mRanking);
    }

    public Player getRankingAtIndex(int index) {
        return mRanking.get(index);
    }

    public int getLength() {
        return mRanking.size();
    }



}
