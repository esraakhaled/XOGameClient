/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogameclient;

/**
 *
 * @author ahmed
 */
public class Player {
    private String name;
    private int score;
    private int numOfGames;
    private char XO;
    private String password;
    
    public Player(String name){
        this.name=name;
        score=0;
        numOfGames=0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumOfGames() {
        return numOfGames;
    }

    public void setNumOfGames(int numOfGames) {
        this.numOfGames = numOfGames;
    }

    public char getXO() {
        return XO;
    }

    public void setXO(char XO) {
        this.XO = XO;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    
}
