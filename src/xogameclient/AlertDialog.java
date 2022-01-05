/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogameclient;




import model.LocalGame;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Game;

/**
 *
 * @author Raiaan
 */
public class AlertDialog {
    static String player1Name , player2Name;
    static void display(String text, Stage parentStage) {
        
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        TextField player1 = new TextField();
        TextField player2 = new TextField();
        player1.setPromptText("Enter Player a");
        player2.setPromptText("Enter Player b");
        Button button = new Button("Play");
        button.setAlignment(Pos.CENTER);
        button.setTextAlignment(TextAlignment.CENTER);
        button.setOnAction(e -> {
             Game game = new LocalGame(player1Name, player2Name);
             player1Name = player1.getText();
             player2Name = player2.getText();
             stage.close();
             parentStage.close();
             Stage r = (Stage) player1.getScene().getWindow();
             r.close();
             Parent root = new GameScreen(game);
             Scene scene = new Scene(root);
             r.setScene(scene);
             r.show();    
             
        });
        GridPane layout = new GridPane();
         
        layout.setPadding(new Insets(10, 10, 10, 10)); 
        layout.setVgap(10); 
         
        layout.add(player1, 0,1);
        layout.add(player2, 0,2);
        layout.add(button, 0,3);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 250, 150);
        scene.getStylesheets().add("assets/css/styling.css");
        layout.getStyleClass().add("screen");
        player1.getStyleClass().add("text_field");
        player2.getStyleClass().add("text_field");
        button.getStyleClass().add("connectBtn");
        stage.setTitle("Dialog");
        stage.setScene(scene);
        stage.show();
    }
   
    
}
