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
    
 public PcGame() {
     super("PlayerA","BOOT");
       
    }

 //function playing with computer

    public int[] computerPlay() {
        int c= new Random().nextInt(3); 
        int v= new Random().nextInt(3);  
       
        while(!isFound(c, v)) {
            c = new Random().nextInt(3);  
            v = new Random().nextInt(3);
            
            System.out.println(c+" , " +v);
        }
         int arr[] = {c, v};
        
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
        } else if ((x == 0) && (y == 2)) {
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
        
        if (winningCases(X)) {
            vedioDialog("/assets/win-victory.gif");
            disableButtons();
            winner = playerA.getName();
            playerA.setScore(playerA.getScore() + 1);
            update();
            // endbale back
            enableBack();
            enableRestart();
            
        } else if(endGame()) {
            enableBack();
            enableRestart();
            System.out.println("end");
        }else
        {
         Button buttonB=null;
        buttonB = playerB();
        buttonB.setDisable(true);
        actionPlayerB(buttonB.getId());
        buttonB.setText("O");
        
        if (winningCases(O)) {
            vedioDialog("/assets/gameOver.gif");
            disableButtons();
            winner = playerB.getName();
            playerB.setScore(playerB.getScore() + 1);
            update();
            enableBack();
            enableRestart();
        } else if(endGame()){
            enableBack();
            enableRestart();

          }
        }
        

    }

}


  

