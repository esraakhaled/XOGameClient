package xogameclient;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.application.Platform;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.Game;
import model.OnlineGame;
import model.SocketSingleton;
import serialize.models.LogOut;
import serialize.models.Player;

import serialize.models.RequestGame;

import serialize.models.RequestProfileBase;

public class playerProfileScreen extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ListView<String> availablePlayerList;
    protected final Text text;
    protected final AnchorPane anchorPane0;
    protected final ListView<listItemBase> TopPlayersList;
    protected final Text text0;
    protected final Text text1;
    protected final Rectangle rectangle;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final Text text2;
    protected final Text text3;
    protected final Text text4;
    protected final Text text5;
    protected final Text text6;
    protected final Text text7;
    protected final Text text8;
    protected final Text text9;
    protected final BorderPane borderPane;
    protected final Text text10;
    protected final AnchorPane anchorPane1;
    protected final Text playerName;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final Button backButton;
    protected final Button signOutButton;
    protected final Button recorderGameButton;
    private Player player;

    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;

    private RequestGame requestGame;
    public int acceptance = 0;
    private Game g;
    private Stage waittingStatge;
    private Stage acceptanceStage;
    private String playerOne;
    private Thread thread;
    ObservableList<listItemBase> topPlayersNames;
    ObservableList<String> availablePlayer;
    private ActionEvent eventAction;
    private RequestProfileBase playersData;
    private Player playerA;
    private Player playerB;

    public playerProfileScreen(Player player) {

        getStreams();
        anchorPane = new AnchorPane();

        topPlayersNames = FXCollections.observableArrayList();
        availablePlayer = FXCollections.observableArrayList();
        availablePlayerList = new ListView<String>(availablePlayer);
        text = new Text();
        anchorPane0 = new AnchorPane();
        TopPlayersList = new ListView<listItemBase>(topPlayersNames);
        text0 = new Text();
        text1 = new Text();
        rectangle = new Rectangle();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        text2 = new Text();
        text3 = new Text();
        text4 = new Text();
        text5 = new Text();
        text6 = new Text();
        text7 = new Text();
        text8 = new Text();
        text9 = new Text();
        borderPane = new BorderPane();
        text10 = new Text();
        anchorPane1 = new AnchorPane();
        playerName = new Text();
        anchorPane2 = new AnchorPane();
        anchorPane3 = new AnchorPane();
        backButton = new Button();
        signOutButton = new Button();
        recorderGameButton = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(208.0);
        setMinWidth(500.0);
        setPrefHeight(400.0);
        setPrefWidth(582.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(292.0);
        anchorPane.setPrefWidth(203.0);
        AnchorPane.setBottomAnchor(availablePlayerList, 6.0);
        AnchorPane.setLeftAnchor(availablePlayerList, 14.0);
        AnchorPane.setRightAnchor(availablePlayerList, 40.0);
        AnchorPane.setTopAnchor(availablePlayerList, 44.0);
        availablePlayerList.setEditable(true);
        availablePlayerList.setLayoutX(14.0);
        availablePlayerList.setLayoutY(44.0);
        availablePlayerList.setPrefHeight(219.0);
        availablePlayerList.setPrefWidth(149.0);
        text.setLayoutX(14.0);
        text.setLayoutY(34.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Players");
        text.setFont(new Font(18.0));
        setRight(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(312.0);
        anchorPane0.setPrefWidth(252.0);

        AnchorPane.setBottomAnchor(TopPlayersList, 7.0);
        AnchorPane.setRightAnchor(TopPlayersList, 35.0);
        AnchorPane.setTopAnchor(TopPlayersList, 167.0);
        TopPlayersList.setLayoutX(35.0);
        TopPlayersList.setLayoutY(167.0);
        TopPlayersList.setPrefHeight(141.0);
        TopPlayersList.setPrefWidth(182.0);

        text0.setLayoutX(21.0);
        text0.setLayoutY(159.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Top Players");
        text0.setFont(new Font(14.0));

        text1.setLayoutX(27.0);
        text1.setLayoutY(19.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Statistics");
        text1.setFont(new Font(14.0));

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#edeff2"));
        rectangle.setHeight(112.0);
        rectangle.setLayoutX(35.0);
        rectangle.setLayoutY(33.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(181.0);

        gridPane.setLayoutX(37.0);
        gridPane.setLayoutY(35.0);
        gridPane.setPrefHeight(109.0);
        gridPane.setPrefWidth(179.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Games");
        text2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text2.setWrappingWidth(87.841796875);

        GridPane.setColumnIndex(text3, 1);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("0");
        text3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text3.setWrappingWidth(96.46875);

        GridPane.setRowIndex(text4, 1);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Score");
        text4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text4.setWrappingWidth(90.396484375);

        GridPane.setRowIndex(text5, 2);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Lose");
        text5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text5.setWrappingWidth(87.046875);

        GridPane.setRowIndex(text6, 3);
        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Rank");
        text6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text6.setWrappingWidth(89.0390625);

        GridPane.setColumnIndex(text7, 1);
        GridPane.setRowIndex(text7, 1);
        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("0");
        text7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text7.setWrappingWidth(96.46875);

        GridPane.setColumnIndex(text8, 1);
        GridPane.setRowIndex(text8, 2);
        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("0");
        text8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text8.setWrappingWidth(96.46875);

        GridPane.setColumnIndex(text9, 1);
        GridPane.setRowIndex(text9, 3);
        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("0");
        text9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text9.setWrappingWidth(96.46875);
        setLeft(anchorPane0);

        BorderPane.setAlignment(borderPane, javafx.geometry.Pos.CENTER);
        borderPane.setPrefHeight(85.0);
        borderPane.setPrefWidth(594.0);

        BorderPane.setAlignment(text10, javafx.geometry.Pos.CENTER);
        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText("XO Game");
        text10.setFont(new Font("System Bold", 24.0));
        borderPane.setCenter(text10);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        playerName.setLayoutX(20.0);
        playerName.setLayoutY(78.0);
        playerName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerName.setStrokeWidth(0.0);
        playerName.setText("PlayerName");
        playerName.setFont(new Font(18.0));
        borderPane.setLeft(anchorPane1);

        BorderPane.setAlignment(anchorPane2, javafx.geometry.Pos.CENTER);
        anchorPane2.setPrefHeight(200.0);
        anchorPane2.setPrefWidth(200.0);
        borderPane.setRight(anchorPane2);
        setTop(borderPane);

        BorderPane.setAlignment(anchorPane3, javafx.geometry.Pos.CENTER);
        anchorPane3.setPrefHeight(51.0);
        anchorPane3.setPrefWidth(594.0);

        AnchorPane.setBottomAnchor(backButton, 13.0);
        AnchorPane.setRightAnchor(backButton, 128.0);
        AnchorPane.setTopAnchor(backButton, 13.0);
        backButton.setLayoutX(399.0);
        backButton.setLayoutY(13.0);
        backButton.setMnemonicParsing(false);
        //backButton.setOnAction(this::back);
        backButton.setPrefHeight(25.0);
        backButton.setPrefWidth(52.0);
        backButton.setText("Back");
        backButton.setVisible(false);

        AnchorPane.setBottomAnchor(signOutButton, 13.0);
        AnchorPane.setRightAnchor(signOutButton, 20.0);
        AnchorPane.setTopAnchor(signOutButton, 13.0);
        signOutButton.setLayoutX(508.0);
        signOutButton.setLayoutY(13.0);
        signOutButton.setMnemonicParsing(false);
        signOutButton.setText("sign out");

        AnchorPane.setBottomAnchor(recorderGameButton, 13.0);
        AnchorPane.setLeftAnchor(recorderGameButton, 20.0);
        AnchorPane.setTopAnchor(recorderGameButton, 13.0);
        recorderGameButton.setLayoutX(29.0);
        recorderGameButton.setLayoutY(13.0);
        recorderGameButton.setMnemonicParsing(false);
        recorderGameButton.setText("recorded game");
        recorderGameButton.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
//                nav.signupProfile(event);
        });
        setBottom(anchorPane3);

        anchorPane.getChildren().add(availablePlayerList);
        anchorPane.getChildren().add(text);
        anchorPane0.getChildren().add(TopPlayersList);
        anchorPane0.getChildren().add(text0);
        anchorPane0.getChildren().add(text1);
        anchorPane0.getChildren().add(rectangle);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getChildren().add(text2);
        gridPane.getChildren().add(text3);
        gridPane.getChildren().add(text4);
        gridPane.getChildren().add(text5);
        gridPane.getChildren().add(text6);
        gridPane.getChildren().add(text7);
        gridPane.getChildren().add(text8);
        gridPane.getChildren().add(text9);
        anchorPane0.getChildren().add(gridPane);
        anchorPane1.getChildren().add(playerName);
        anchorPane3.getChildren().add(backButton);
        anchorPane3.getChildren().add(signOutButton);
        anchorPane3.getChildren().add(recorderGameButton);

        signOutButton.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {

            eventAction = event;
            System.out.println(eventAction + "esraa Navigation");
            LogOut logOut = new LogOut(player.getUserName(), 0);
            try {
                //     objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(logOut);
                objectOutputStream.flush();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        });
        RequestProfileBase playersData = new RequestProfileBase(player.getUserName(), null, null);
        try {
            objectOutputStream.writeObject(playersData);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        thread = new Thread() {
            @Override
            public void run() {

                while (true) {
                    System.out.println("1");
                    try {
                        //   objectInputStream = new ObjectInputStream(inputStream);
                        Object obj = objectInputStream.readObject();
                        if (obj instanceof LogOut) {
                            LogOut logOutDB = (LogOut) obj;
                            if (logOutDB.getAck() == 1) {

                                SocketSingleton.closeStreams();
                                SocketSingleton.closeSocket();
                                Platform.runLater(() -> {
                                    Navigation.goToWelcomScreen();
                                });
                                thread.stop();

                            } else {
                                System.out.println("fail");
                            }

                        } else if (obj instanceof RequestProfileBase) {
                            RequestProfileBase requestProfileBase;
                            requestProfileBase = (RequestProfileBase) obj;
                            topPlayersNames.clear();
                            availablePlayer.clear();
//                                    System.out.println(playersData.getOnlinePlayer().size());
                            for (Player p : requestProfileBase.getTopPlayers()) {
                                topPlayersNames.add(new listItemBase(p.getUserName(), String.valueOf(p.getScore())));
                            }

                            for (Player p : requestProfileBase.getOnlinePlayer()) {
                                availablePlayer.add(new String(p.getUserName()));
                            }
                        } else if (obj instanceof RequestGame) {
                            requestGame = (RequestGame) obj;
                            switch (requestGame.getGameResponse()) {
                                case 0:
                                    System.out.println("request from server to client"  + requestGame.getGameRoom());
                                    acceptRequest(requestGame.getRequstedUserName() + "want to play with you !");

                                    break;
                                case 1:
                                    initiatePlayers();
                                    System.out.println("accept from server to client" + requestGame.getGameRoom());

                                    Platform.runLater(() -> {
                                        Platform.runLater(() -> {
                                            Navigation.goToGameScreen(g);

                                        });
                                        waittingStatge.close();

                                        thread.stop();

                                    });
                                    break;
                                case 2:
                                    Platform.runLater(() -> {
                                        waittingStatge.close();
                                    });
                                    break;
                                   
                                default:
                                    break;
                            }
                        }

                    } catch (EOFException ex) {
                        SocketSingleton.closeStreams();
                        CustomPopup.display(" 404 NotFound ");
                        Navigation.goToIpScreen();

                    } catch (SocketException ex) {
                        SocketSingleton.closeSocket();
                        CustomPopup.display(" 404 NotFound ");
                        Navigation.goToIpScreen();
                    } catch (IOException ex) {
                        SocketSingleton.closeStreams();
                        SocketSingleton.closeSocket();
                        CustomPopup.display(" 404 NotFound ");
                        Navigation.goToIpScreen();;
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    }
                }

            }

            //
        };
        thread.start();

        initiatePlayerProfile(player);

        availablePlayerList.getSelectionModel()
                .selectedItemProperty().addListener(new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue,
                            String newValue
                    ) {
                        playerOne = player.getUserName();
                        System.out.println(playerOne);
                        requestGame = new RequestGame(playerOne, newValue, 0);
                        requestGame.setGameRoom(acceptance);
                        System.out.println("requst from client to server" + newValue);
                        try {
//                outputStream = socket.getOutputStream();
                            //               objectOutputStream = new ObjectOutputStream(outputStream);
                            objectOutputStream.writeObject(requestGame);
                            objectOutputStream.flush();
                            waitingResponse("waiting response from " + " " + newValue);

                        } catch (EOFException ex) {
                            SocketSingleton.closeStreams();
                            CustomPopup.display(" 404 NotFound ");
                            Navigation.goToIpScreen();

                        } catch (SocketException ex) {
                            SocketSingleton.closeSocket();
                            CustomPopup.display(" 404 NotFound ");
                            Navigation.goToIpScreen();
                        } catch (IOException ex) {
                            SocketSingleton.closeStreams();
                            SocketSingleton.closeSocket();
                            CustomPopup.display(" 404 NotFound ");
                            Navigation.goToIpScreen();;
                        }

                    }
                }
                );

    }

    public void initiatePlayerProfile(Player player) {
        playerName.setText(player.getUserName());
    }

    public void acceptRequest(String waiting) {
        Platform.runLater(() -> {
            acceptanceStage = new Stage();
            acceptanceStage.initModality(Modality.APPLICATION_MODAL);
        });

        Text message = new Text(waiting);
        Button sureButton = new Button("accept");

        sureButton.setOnAction(e -> {

            try {
                requestGame.setGameResponse(RequestGame.acceptChallenge);
                //       objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(requestGame);

            } catch (EOFException ex) {
                SocketSingleton.closeStreams();
                CustomPopup.display(" 404 NotFound ");
                Navigation.goToIpScreen();

            } catch (SocketException ex) {
                SocketSingleton.closeSocket();
                CustomPopup.display(" 404 NotFound ");
                Navigation.goToIpScreen();
            } catch (IOException ex) {
                SocketSingleton.closeStreams();
                SocketSingleton.closeSocket();
                CustomPopup.display(" 404 NotFound ");
                Navigation.goToIpScreen();;
            }
            initiatePlayers();

            Platform.runLater(() -> {
                acceptanceStage.close();
                Platform.runLater(() -> {
                    Navigation.goToGameScreen(g);
                });
                thread.stop();

            });

        });

        Button refusButton = new Button("refuse");

        refusButton.setOnAction(e -> {
            acceptanceStage.close();
            try {
                requestGame.setGameResponse(RequestGame.refuseChallenge);
                //  objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(requestGame);

            } catch (EOFException ex) {
                SocketSingleton.closeStreams();
                CustomPopup.display(" 404 NotFound ");
                Navigation.goToIpScreen();

            } catch (SocketException ex) {
                SocketSingleton.closeSocket();
                CustomPopup.display(" 404 NotFound ");
                Navigation.goToIpScreen();
            } catch (IOException ex) {
                SocketSingleton.closeStreams();
                SocketSingleton.closeSocket();
                CustomPopup.display(" 404 NotFound ");
                Navigation.goToIpScreen();;
            }
        });
        Platform.runLater(() -> {
            GridPane layout = new GridPane();
            GridPane subLayout = new GridPane();
            layout.setPadding(new Insets(10, 10, 10, 10));
            subLayout.setPadding(new Insets(10, 10, 10, 10));
            layout.setVgap(5);
            layout.setHgap(5);
            subLayout.setVgap(5);
            subLayout.setHgap(5);
            layout.add(message, 0, 0);
            subLayout.add(sureButton, 1, 0);
            subLayout.add(refusButton, 2, 0);
            layout.add(subLayout, 0, 1);
            Scene scene = new Scene(layout, 250, 90);
            acceptanceStage.setTitle("acceptance...");
            acceptanceStage.setScene(scene);
            acceptanceStage.showAndWait();
           
        });
         PauseTransition pauseTransition =new PauseTransition(Duration.seconds(10));
        pauseTransition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                acceptanceStage.close();
            }
        });
        pauseTransition.play();

    }

    public void waitingResponse(String waiting) {
        Platform.runLater(() -> {
            waittingStatge = new Stage();
            waittingStatge.initModality(Modality.APPLICATION_MODAL);
        });

        Text message = new Text(waiting);
        
        Platform.runLater(() -> {
            GridPane layout = new GridPane();
            GridPane subLayout = new GridPane();
            layout.setPadding(new Insets(10, 10, 10, 10));
            subLayout.setPadding(new Insets(10, 10, 10, 10));
            layout.setVgap(5);
            layout.setHgap(5);
            subLayout.setVgap(5);
            subLayout.setHgap(5);
            layout.add(message, 0, 0);
            layout.add(subLayout, 0, 1);
            Scene scene = new Scene(layout, 250, 90);
            waittingStatge.setTitle("waitting...");
            waittingStatge.setScene(scene);
            waittingStatge.showAndWait();
         
        });
           PauseTransition pauseTransition =new PauseTransition(Duration.seconds(10));
        pauseTransition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                waittingStatge.close();
            }
        });
        pauseTransition.play();
    }

    public void getStreams() {
        this.objectInputStream = SocketSingleton.getObjectInputStream();
        this.objectOutputStream = SocketSingleton.getObjectOutputStream();

    }

    public void initiatePlayers() {
        playerA = new Player(requestGame.getRequstedUserName());
        playerA.setScore(0);
        playerB = new Player(requestGame.getChoosePlayerUserName());
        playerB.setScore(0);
        g = new OnlineGame(playerA, playerB);
    }
}
