/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogameclient;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

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
             stage.close();
        });
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
    public void vedioDialog(){

        try {
            
            Dialog dialog = new Dialog();
            
            Parent root = FXMLLoader.load(getClass().getResource("winningVedio.fxml"));
            dialog.getDialogPane().setContent(root);
            dialog.show();
            PauseTransition pauseTransition =new PauseTransition(Duration.seconds(5));
            pauseTransition.setOnFinished(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    dialog.hide();
                    System.out.println("dhdhh");
                }
            });
            pauseTransition.play();
            /*
             new Thread(){
                 public void run(){
                     try {
                         sleep(3000);
                         
                        stop();
                     } catch (InterruptedException ex) {
                         Logger.getLogger(AlertDialog.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
                 
             }.start();
             */
        } catch (IOException ex) {
            Logger.getLogger(AlertDialog.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
