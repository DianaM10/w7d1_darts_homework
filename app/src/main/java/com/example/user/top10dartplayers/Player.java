package com.example.user.top10dartplayers;

/**
 * Created by user on 07/11/2016.
 */

public class Player {

    private String name;
    private String nickName;
    private int ranking;

    public Player(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
        this.ranking = 0;
    }

    public Player(String name, String nickName, int ranking) {
        this.name = name;
        this.nickName = nickName;
        this.ranking = ranking;
    }

    public String getName() {
        return this.name;
    }

    public String getNickName(){
        return this.nickName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getRanking(){
        return this.ranking;
    }

    public void setRanking(int ranking){
        this.ranking = ranking;
    }


    @Override
    public String toString(){
        return "Name: " + name + " Nickname: " + nickName + " Ranking: " + ranking;
    }




}
