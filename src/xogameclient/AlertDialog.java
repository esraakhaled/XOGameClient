/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogameclient;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Raiaan
 */
public class AlertDialog {
    static String player1Name , player2Name;
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
       /* Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource(".Fxml"));
        //stage.setTitle("Log in");
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();*/
              Navigation nav = new Navigation();
                nav.playGame(e);
                
             //stage.close();
        });
        /*button.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.playGame(event);
                    }
        });*/
        GridPane layout = new GridPane();
         
        layout.setPadding(new Insets(10, 10, 10, 10)); 
        layout.setVgap(5); 
        layout.setHgap(5); 
         
        layout.add(player1, 1,1);
        layout.add(player2, 1,2);
        layout.add(button, 1,3);
         
        Scene scene = new Scene(layout, 250, 150);          
         
        stage.setTitle("Dialog");
        stage.setScene(scene);
        stage.show();
    }
    
}
