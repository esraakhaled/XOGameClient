/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javafx.scene.control.Button;
import serialize.models.Player;


/**
 *
 * @author ahmed public LocalGame(String playerNameA, String playerNameB) {
 * playerA = new Player(playerNameA); playerB = new Player(playerNameB); }
 *
 * @Override public void actionPlayerA(String cellPostion) { int x=0, y=0;
 *
 */
public class LocalGame extends Game {

    

    public LocalGame(String playerNameA, String playerNameB) {
        playerA = new Player(playerNameA);
        playerB = new Player(playerNameB);
    }

    public void actionPlayerA(String cellPostion) {
        int x = 0, y = 0;
        switch (cellPostion) {
            case CELL00: {
                x = 0;
                y = 0;

            }
            break;
            case CELL01: {
                x = 0;
                y = 1;

            }

            break;
            case CELL02: {
                x = 0;
                y = 2;
            }
            break;
            case CELL10: {
                x = 1;
                y = 0;

            }

            break;
            case CELL11: {
                x = 1;
                y = 1;

            }

            break;
            case CELL12: {
                x = 1;
                y = 2;

            }
            ;
            break;
            case CELL20: {
                x = 2;
                y = 0;

            }

            break;
            case CELL21: {
                x = 2;
                y = 1;
            }
            break;
            case CELL22: {
                x = 2;
                y = 2;

            }

            break;
        }
        setCell(x, y);

        playerTurn = !playerTurn;

    }

    public void actionPlayerB(String cellPostion) {
        int x = 0, y = 0;
        switch (cellPostion) {
            case CELL00: {
                x = 0;
                y = 0;

            }
            break;
            case CELL01: {
                x = 0;
                y = 1;

            }

            break;
            case CELL02: {
                x = 0;
                y = 2;
            }
            break;
            case CELL10: {
                x = 1;
                y = 0;

            }

            break;
            case CELL11: {
                x = 1;
                y = 1;

            }

            break;
            case CELL12: {
                x = 1;
                y = 2;

            }
            ;
            break;
            case CELL20: {
                x = 2;
                y = 0;

            }

            break;
            case CELL21: {
                x = 2;
                y = 1;
            }
            break;
            case CELL22: {
                x = 2;
                y = 2;

            }

            break;
        }
        setCell(x, y);

        playerTurn = !playerTurn;
    }

    public void handleButton(Button b) {

        String cellPostion = b.getId();
        b.setDisable(true);
        if (playerTurn) {
            actionPlayerA(cellPostion);
            b.setText("X");
            if (winningCases(X)) {
                vedioDialog("/assets/win-victory.gif");
                disableButtons();
                winner = playerA.getUserName();
                playerA.setScore(playerA.getScore() + 1);
                update();
                // endbale back
                enableBack();
                enableRestart();
            } else if (endGame()) {
                enableBack();
                enableRestart();

            } else {
            }
        } else {
            actionPlayerB(cellPostion);
            b.setText("O");
            if (winningCases(O)) {
                vedioDialog("/assets/win-victory.gif");
                disableButtons();
                winner = playerB.getUserName();
                playerB.setScore(playerB.getScore() + 1);
                update();
                enableBack();
                enableRestart();
            } else if (endGame()) {
                
                enableBack();
                enableRestart();
            } else {
            }
        }
    }

    public void update() {
        if (playerTurn) {
            ScoreB.setText(playerB.getScore() + "");
        } else {
            ScoreA.setText(playerA.getScore() + "");
        }

    }

    public void enableBack() {
        back.setDisable(false);
    }

    public void enableRestart() {
        restart.setDisable(false);
    }
}