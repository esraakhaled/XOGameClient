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
public abstract class Game {

    public static final char X = 'X';
    public static final char O = 'O';
// true means player A turn
    boolean playerTurn = true;
    Player playerA;
    Player playerB;
    private char[][] board = new char[3][3];
    Playable playable;

    public void setCell(int x, int y) {
        board[x][y] = playerTurn ? X : O;
    }
    private boolean checkRows(char c){
        boolean win =false;
          if((board[0][0] == c) && (board[1][0] == c && board[1][2] == c)){
                        win = true;
        }else if((board[0][1] == c) && (board[1][1] == c && board[2][1] == c)){
                        win = true;
        }else if((board[0][2] == c) && (board[1][2] == c && board[2][2] == c)){
                        win = true;
        }
          return win;
    }
     
    private boolean checkColumns(char c){
        boolean win =false;
         if((board[0][0] == c) && (board[1][0] == c && board[1][2] == c)){
                        win = true;
        }else if((board[0][1] == c) && (board[1][1] == c && board[2][1] == c)){
                        win = true;
        }else if((board[0][2] == c) && (board[1][2] == c && board[2][2] == c)){
                        win = true;
        }
        
          return win;
    }
    private boolean checkDiagonl(char c){
        boolean win =false;
          if((board[0][0] == c) && (board[1][1] == c && board[2][2] == c)){
                        win = true;
        }else if((board[0][2] == c) && (board[1][1] == c && board[2][0] == c)){
                        win = true;
        }

        return win;
    }
    public boolean winningCases(char c) {
        return(checkRows(c)||checkColumns(c)||checkDiagonl(c));
    }

    public void rest() {

    }

}
