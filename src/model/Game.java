/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



import serialize.models.Player;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

import java.util.Vector;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author ahmed
 */
public abstract class Game implements Playable {
   // winningVedioBase vedio = new winningVedioBase();
    public static final char X = 'X';
    public static final char O = 'O';
// true means player A turn
    boolean playerTurn = true;
    public Player playerA;
    public Player playerB;
    protected char[][] board = new char[3][3];
    Playable playable;
    protected Vector<Button> buttons = new Vector<>();
    protected Text ScoreA,ScoreB;
    protected Button back;
    protected Button restart;

    public String winner;

    public void setCell(int x, int y) {

        board[x][y] = playerTurn ? X : O;
    }

    private boolean checkColumns(char c) {
        boolean win = false;
        if ((board[0][0] == c) && (board[1][0] == c && board[2][0] == c)) {
            win = true;
        } else if ((board[0][1] == c) && (board[1][1] == c && board[2][1] == c)) {
            win = true;
        } else if ((board[0][2] == c) && (board[1][2] == c && board[2][2] == c)) {
            win = true;
        }
        return win;
    }

    private boolean checkRows(char c) {
        boolean win = false;
        if ((board[0][0] == c) && (board[0][1] == c && board[0][2] == c)) {
            win = true;
        } else if ((board[1][0] == c) && (board[1][1] == c && board[1][2] == c)) {
            win = true;
        } else if ((board[2][0] == c) && (board[2][1] == c && board[2][2] == c)) {
            win = true;
        }

        return win;
    }

    private boolean checkDiagonl(char c) {
        boolean win = false;
        if ((board[0][0] == c) && (board[1][1] == c && board[2][2] == c)) {
            win = true;
        } else if ((board[0][2] == c) && (board[1][1] == c && board[2][0] == c)) {
            win = true;
        }

        return win;
    }

    public boolean winningCases(char c) {
        return (checkRows(c) || checkColumns(c) || checkDiagonl(c));
    }

    public void reset() {
        //rest all
        board = new char[3][3];
        playerTurn = true;
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setDisable(false);
            buttons.get(i).setText("");

        }
    }

    public boolean endGame() {
        return (draw() || winningCases(X) || winningCases(O));

    }
     
    public boolean draw() {
        boolean draw = false;
        int count=0;
        if (winningCases(X) || winningCases(O)) {
            draw = false;
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    count=(board[i][j] == X || board[i][j] == O)?count++:count;
                }
            }
            return(count==9?true:false);
        }

        return draw;
    }

    public void handleButton(Button b) {

    }

    public void disableButtons() {
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setDisable(true);

        }
    }

    public void update() {
    }

    public void getButtons(Vector<Button> b) {
        for (int i = 0; i < b.size(); i++) {
            buttons.add(b.get(i));

        }
    }
     public void addScoreText(Text scoreA,Text scoreB){
        ScoreA=scoreA;
        ScoreB=scoreB;
    }
      public void addBack(Button back){
          this.back=back;
    }
       public void addRestart(Button restart){
          this.restart=restart;
    }
       
       
    public void vedioDialog(String p){
        String path = p;
        Stage stage = new Stage();
        VBox vBox = new VBox();
        
        ImageView imageView = new ImageView();
        Image image = new Image(getClass().getResourceAsStream(path));
        imageView.setImage(image);
        vBox.getChildren().add(imageView);
        Scene sceen = new Scene(vBox,600,500);
        stage.setScene(sceen);
        stage.show();
        
        PauseTransition pauseTransition =new PauseTransition(Duration.seconds(4));
        pauseTransition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });
        pauseTransition.play();

    }
    
    
}
