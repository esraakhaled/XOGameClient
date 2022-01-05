/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogameclient;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Raiaan
 */
public class CustomPopup {
    public static void display(String error) {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text message = new Text(error);
        Button sureButton = new Button("OK");
       
        sureButton.setOnAction(e -> {
             stage.close();
        });
        GridPane layout = new GridPane();
        GridPane subLayout = new GridPane();
        layout.setPadding(new Insets(10, 10, 10, 10));
        subLayout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(5); 
        layout.setHgap(5); 
        subLayout.setVgap(5);
        subLayout.setHgap(5);
        layout.add(message, 0,0);
        subLayout.add(sureButton, 1,0);
        layout.add(subLayout,0,1);
        Scene scene = new Scene(layout, 250, 90);        
        scene.getStylesheets().add("assets/css/styling.css");
        layout.getStyleClass().add("screen");
        message.getStyleClass().add("text");
        sureButton.getStyleClass().add("connectBtn");
        
        stage.setTitle("Dialog");
        stage.setTitle("closing...");
        stage.setScene(scene);
        stage.showAndWait();
    }
    
     
     
}
