/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.SocketException;
import javafx.scene.control.Button;
import model.SocketSingleton;
import serialize.models.Player;
import serialize.models.PlayingGame;

/**
 *
 * @author ahmed
 */
public class OnlineGame extends Game {

    Thread th;
    ObjectInputStream objectInputStream;
    ObjectOutputStream objectOutputStream;
    int roomID;
    PlayingGame playingGame;

    public OnlineGame(Player playerA, Player playerB, int roomID) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.roomID = roomID;
        this.objectOutputStream = SocketSingleton.getObjectOutputStream();

        this.objectInputStream = SocketSingleton.getObjectInputStream();

    }

    public void GameSession() {
        playingGame = null;
        //  objectOutputStream = SocketSingleton.getObjectOutputStream();
        //  objectInputStream = SocketSingleton.getObjectInputStream();
        th = new Thread() {

            public void run() {

                while (true) {
                    try {

                        Object obj = objectInputStream.readObject();
                        if (obj != null) {
                            if (obj instanceof PlayingGame) {
                                playingGame = (PlayingGame) obj;
                                String buttonID = playingGame.getPlayedButtonID();

                                Button b = getButton(buttonID);
                                handleButton(b);
                                //            th.suspend();
                            }
                            System.out.println(" object is null ");
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    }
                }
            }

        };
        th.start();
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

    }

    public void handleButton(Button b) {

        String cellPostion = b.getId();
        b.setDisable(true);
        if (playerTurn) {
            actionPlayerA(cellPostion);
            b.setText("X");
        } else {
            actionPlayerB(cellPostion);
            b.setText("O");
        }
        playerTurn = !playerTurn;
        /*
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
    }

    
        else {
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
                 */
    }

    public void sendModel(Button button) {
        playingGame = new PlayingGame(roomID, playerTurn ? playerB.getUserName() : playerA.getUserName(), button.getId());
        try {
            objectOutputStream.writeObject(playingGame);
            objectOutputStream.flush();
            //th.resume();
            //  GameSession();
            System.out.println("send from client one to server" + playingGame.getClass().getName());

        } catch (SocketException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
