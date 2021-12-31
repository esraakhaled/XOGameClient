/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;


import java.util.Random;
import javafx.scene.control.Button;

/**
 *
 * @author ahmed
 */
public class PcGame extends LocalGame{
    private static final String CELL00 = "cell_0_0";
    private static final String CELL01 = "cell_0_1";
    private static final String CELL02 = "cell_0_2";
    private static final String CELL10 = "cell_1_0";
    private static final String CELL11 = "cell_1_1";
    private static final String CELL12 = "cell_1_2";
    private static final String CELL20 = "cell_2_0";
    private static final String CELL21 = "cell_2_1";
    private static final String CELL22 = "cell_2_2";   
 public PcGame() {
     super("PlayerA","BOOT");
       
    }
 //function playing with computer

    public int[] computerPlay() {
        int c= new Random().nextInt(3); 
        int v= new Random().nextInt(3);  
       
        while(!isFound(c, v)) {
            c = new Random().nextInt(3);  ;
            v = new Random().nextInt(3);  ; 
        }
         int arr[] = {c, v};
        System.out.println(c+" , " +v);
         return arr;

    }
    //function check whether x or o is on board

    public boolean isFound(int x, int y) {
        return (board[x][y] != X && board[x][y] != O);
    }
    //function return button in which player computer is playing

    public Button playerB() {
        Button d = new Button();
        int arr[] = computerPlay();
        int x = arr[0];
        int y = arr[1];
        if ((x == 0) && (y == 0)) {
            d = buttons.get(0);
        } else if ((x == 0) && (y == 1)) {
            d = buttons.get(1);
        } else if ((x == 0) && (x == 2)) {
            d = buttons.get(2);
        } else if ((x == 1) && (y == 0)) {
            d = buttons.get(3);
        } else if ((x == 1) && (y == 1)) {
            d = buttons.get(4);
        } else if ((x == 1) && (y == 2)) {
            d = buttons.get(5);
        } else if ((x == 2) && (y == 0)) {
            d = buttons.get(6);
        } else if ((x == 2) && (y == 1)) {
            d = buttons.get(7);
        } else if ((x == 2) && (y == 2)) {
            d = buttons.get(8);
        } else {

            System.out.println("out of bound");
        }

        return d;
    }

    @Override
    public void handleButton(Button b) {

        String cellPostion = b.getId();
        b.setDisable(true);

        actionPlayerA(cellPostion);
        b.setText("X");
        
        if (!winningCases(X)) {
            
        } else  {
            disableButtons();
            winner = playerA.getName();
            playerA.setScore(playerA.getScore() + 1);
            update();
            // endbale back
            enableBack();
            enableRestart();
        }Button buttonB=null;
        buttonB = playerB();
        buttonB.setDisable(true);
        actionPlayerB(buttonB.getId());
        buttonB.setText("O");
        
        if (!winningCases(O)) {

        } else {
            disableButtons();
            winner = playerB.getName();
            playerB.setScore(playerB.getScore() + 1);
            update();
            enableBack();
            enableRestart();

        }

    }

}


  

