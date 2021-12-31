/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogameclient;
import xogameclient.model.Game;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ELZAHBIA
 */
public class Navigation {
    //protected WelcomeXO welcomeScreen = new WelcomeXO();
    protected GameScreen playScreen;
    protected WelcomeXO welcomeScreen = new WelcomeXO();
    protected playerProfileBase playerProfile=new playerProfileBase();
    protected SignUpBase signUp = new SignUpBase ();
    protected Login login = new Login ();
    protected RecordedGameBase record = new RecordedGameBase ();

    public void playGame(ActionEvent event,Game g) {
        playScreen = new GameScreen(g);
        Parent root = playScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }   
     public void recordedGame(ActionEvent event) {
        Parent root = record;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
      
       public void backGame(ActionEvent event) {
        Parent root = welcomeScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
     public void loginButton(ActionEvent event) {
        Parent root =playerProfile;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
      public void signupScreen(ActionEvent event) {
        Parent root = signUp;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
     public void loginScreen(ActionEvent event) {
        Parent root = login ;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    public void signupProfile(ActionEvent event) {
        Parent root = playerProfile;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
     public void signoutProfile(ActionEvent event) {
        Parent root = welcomeScreen;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    
   
    
    
}
