package xogameclient;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import model.SocketSingleton;

public class IPScreenBase extends AnchorPane {

    protected final ImageView ipImage;
    protected final TextField ipTextField;
    protected final Button connectButton;
    protected final Button backButton;
    protected final Text text;
    protected Socket socket;

    public IPScreenBase() {
        ipImage = new ImageView();
        ipTextField = new TextField();
        connectButton = new Button();
        backButton = new Button();
        text = new Text();

        setId("AnchorPane");
        setPrefHeight(401.0);
        setPrefWidth(543.0);

        AnchorPane.setBottomAnchor(ipImage, 151.0);
        ipImage.setFitHeight(161.0);
        ipImage.setFitWidth(200.0);
        ipImage.setLayoutX(200.0);
        ipImage.setLayoutY(88.0);
        ipImage.setPickOnBounds(true);
        ipImage.setPreserveRatio(true);
        ipImage.setImage(new Image(getClass().getResource("/assets/ip2.png").toExternalForm()));

        AnchorPane.setBottomAnchor(ipTextField, 104.0);
        ipTextField.setLayoutX(191.0);
        ipTextField.setLayoutY(271.0);

        AnchorPane.setBottomAnchor(connectButton, 104.0);
        connectButton.setLayoutX(361.0);
        connectButton.setLayoutY(271.0);
        connectButton.setMnemonicParsing(false);
        connectButton.setText("Connect");

        AnchorPane.setBottomAnchor(backButton, 26.0);
        AnchorPane.setLeftAnchor(backButton, 50.0);
        backButton.setLayoutX(50.0);
        backButton.setLayoutY(349.0);
        backButton.setMnemonicParsing(false);
        backButton.setText("Back");

        text.setFill(javafx.scene.paint.Color.valueOf("#f50808"));
        text.setLayoutX(189.0);
        text.setLayoutY(317.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);

        getChildren().add(ipImage);
        getChildren().add(ipTextField);
        getChildren().add(connectButton);
        getChildren().add(backButton);
        getChildren().add(text);

        connectButton.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isValidIPAddress(ipTextField.getText())) {
                    System.out.println("s7");
                    text.setText("");
                    Navigation nav = new Navigation();
                    socket = SocketSingleton.getInstanceOf(ipTextField.getText());
  
                    nav.loginScreen(event);

                } else {

                    text.setText("Invalid ip, please enter valid ip");
                }

            }

        });

        backButton.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Navigation nav = new Navigation();
                nav.backGame(event);
            }

        });

    }

    public static boolean isValidIPAddress(String ip) {

        String zeroTo255
                = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";

        String regex
                = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        if (ip == null) {
            return false;
        }

        Matcher m = p.matcher(ip);
        return m.matches();
    }
}
