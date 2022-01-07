package xogameclient;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.NoRouteToHostException;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.util.Duration;
import model.SocketSingleton;
import serialize.models.Connection;

public class IPScreen extends AnchorPane {
    
    protected final ImageView ipImage;
    protected final TextField ipTextField;
    protected final Button connectButton;
    protected final Button backButton;
    protected final Text text;
    protected Socket socket;
    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;
    private InputStream inputStream;
    private OutputStream outputStream;

    public IPScreen() {
        // make socket equal null when navigate to ip screen
      
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

        connectButton.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            this.setDisable(true);
            if (isValidIPAddress(ipTextField.getText())) {
                text.setText("");
                socket = SocketSingleton.getInstanceOf(ipTextField.getText());
                
                if (socket != null) {
                    try {
                        Connection connection = new Connection(0, 0);
                        
                        
                        objectOutputStream = SocketSingleton.getObjectOutputStream();
                        objectOutputStream.writeObject(connection);
                        //nav.goToLoginScreen(event,ipTextField.getText());
                        objectInputStream = SocketSingleton.getObjectInputStream();
                        
                        connection = (Connection) objectInputStream.readObject();
                        System.out.println("connection before");
                        if (connection.getAck() == 1) {
                            System.out.println("conection done in client");
                            
                            Navigation.goToLoginScreen();
                            
                        }
                        this.setDisable(false);

                    } catch (SocketException ex) {
                        text.setText("Not Found, Error 404!");
                        ex.printStackTrace();
                        
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(IPScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    text.setText("Not Found, Error 404!");
                }

            } else {
                
                text.setText("Invalid ip, please enter valid ip");
            }
        });

        backButton.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                //  Navigation nav = new Navigation();
                Navigation.goToWelcomeXoScreen();
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
