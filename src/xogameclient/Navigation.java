/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogameclient;

import models.Game;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import serialize.models.Player;

/**
 *
 * @author ELZAHBIA
 */
public class Navigation {

    //protected WelcomeXOScreen welcomeXoScreen = new WelcomeXOScreen();
    protected static GameScreen gameScreen;
    protected static WelcomeXOScreen welcomeXoScreen;
    protected static playerProfileScreen playerProfileScreen;
    protected static SignUpScreen signUpScreen;
    protected static LoginScreen loginScreen;
    protected static RecordedGameScreen recordGameScreen;
    protected static IPScreen ipScreen;
    protected static Parent root;
    protected static Scene scene;
    protected static Stage stage;

    public static void setStage(Stage stage) {
        Navigation.stage = stage;
    }
    
    
    public static void goToGameScreen(Game g) {
        gameScreen = new GameScreen(g);
        root = gameScreen;
        stage.setResizable(false);
        scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void goToRecordGameScreen() {
        recordGameScreen = new RecordedGameScreen();
        root = recordGameScreen;
        stage.setResizable(false);
        scene = new Scene(root, 700, 500);

        stage.setScene(scene);
        stage.show();
    }

    public static void goToWelcomScreen() {
        welcomeXoScreen = new WelcomeXOScreen();
        root = welcomeXoScreen;
        stage.setResizable(false);
        scene = new Scene(root, 700, 500);

        stage.setScene(scene);
        stage.show();
    }

    public static void goToProfileScreen(Player playerDB) {
        playerProfileScreen = new playerProfileScreen(playerDB);
        root = playerProfileScreen;
        stage.setResizable(false);
        scene = new Scene(root, 700, 500);

        stage.setScene(scene);
        stage.show();
    }

    public static void goToSignupScreen() {
        signUpScreen = new SignUpScreen();
        root = signUpScreen;
        stage.setResizable(false);
        scene = new Scene(root, 700, 500);

        stage.setScene(scene);
        stage.show();
    }

    public static void goToLoginScreen() {
        loginScreen = new LoginScreen();
        root = loginScreen;
        stage.setResizable(false);
        scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void goToIpScreen() {
        ipScreen = new IPScreen();
        root = ipScreen;
        stage.setResizable(false);
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
