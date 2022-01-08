/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogameclient;

import model.LocalGame;

import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Raiaan
 */
public class AlertDialog {

    static String player1Name, player2Name;

    static void display(String text) {

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        Label label = new Label(text);
        TextField player1 = new TextField();
        TextField player2 = new TextField();
        player1.setPromptText("Enter Player a");
        player2.setPromptText("Enter Player b");
        Button button = new Button("Play");
        button.setOnAction(e -> {
            player1Name = player1.getText();
            player2Name = player2.getText();
            Navigation.goToGameScreen(new LocalGame(player1Name, player2Name));
            stage.close();
        });
        GridPane layout = new GridPane();

        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(5);
        layout.setHgap(5);

        layout.add(player1, 1, 1);
        layout.add(player2, 1, 2);
        layout.add(button, 1, 3);

        Scene scene = new Scene(layout, 250, 150);
        scene.getStylesheets().add("design/styling.css");
        layout.getStyleClass().add("fullscreen");
        player1.getStyleClass().add("text_field");
        player2.getStyleClass().add("text_field");
        button.getStyleClass().add("play_button");

        stage.setTitle("Dialog");
        stage.setScene(scene);
        stage.show();
    }

}
