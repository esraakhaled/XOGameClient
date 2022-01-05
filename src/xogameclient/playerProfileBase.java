package xogameclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import java.net.SocketException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
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
import model.Game;
import model.LocalGame;
import model.OnlineGame;
import model.SocketSingleton;
import serialize.models.LogOut;
import serialize.models.Player;

import serialize.models.RequestGame;

import serialize.models.RequestProfileBase;

public class playerProfileBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ListView<listItemBase> availablePlayerList;
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
    private Socket socket;
    String ip;
    private InputStream inputStream;
    private OutputStream outputStream;
    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;

    private RequestGame requestGame;
    private Navigation nav;
    public int acceptance = 0;
    private Game g;
    private Stage waittingStatge;
    private Stage acceptanceStage;
    private String playerOne;
    private Thread thread;
    ObservableList<listItemBase> topPlayersNames;
    ObservableList<listItemBase> availablePlayer;
    private ActionEvent eventAction;

    public playerProfileBase(Player player, String _ip) {

        this.player = player;
        ip = _ip;
        this.socket = SocketSingleton.getInstanceOf(ip);
        System.out.println(socket);
        anchorPane = new AnchorPane();

        topPlayersNames = FXCollections.observableArrayList();
        availablePlayer = FXCollections.observableArrayList();
        availablePlayerList = new ListView<listItemBase>(availablePlayer);
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
        recorderGameButton.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.signupProfile(event);
            }
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

        try {
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();

        } catch (IOException ex) {
            Logger.getLogger(playerProfileBase.class.getName()).log(Level.SEVERE, null, ex);
        }

        signOutButton.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                eventAction = event;
                LogOut logOut = new LogOut(player.getUserName(), 0);
                try {
                    objectOutputStream = new ObjectOutputStream(outputStream);
                    objectOutputStream.writeObject(logOut);
                    objectOutputStream.flush();
                } catch (IOException ex) {
                    Logger.getLogger(playerProfileBase.class.getName()).log(Level.SEVERE, null, ex);
                }

//                    if (inputStream == null) {
//
//                        objectInputStream.close();
//                        inputStream.close();
//                        objectOutputStream.close();
//                        outputStream.close();
//                    }
            }
        });
        if (socket == null || socket.isClosed()) {
            thread.stop();
        } else {

            thread = new Thread() {
                @Override
                public void run() {
                    System.out.println("runnnnnnnn");
                    try {
                        objectOutputStream = new ObjectOutputStream(outputStream);
                        RequestProfileBase playersData = new RequestProfileBase(player.getUserName(), null, null);
                        objectOutputStream.writeObject(playersData);
                        objectOutputStream.flush();
                        while (true) {
                            try {
                                objectInputStream = new ObjectInputStream(inputStream);
                                Object obj = objectInputStream.readObject();
                                if (obj instanceof LogOut) {
                                    LogOut logOutDB = (LogOut) obj;
                                    if (logOutDB.getAck() == 1) {
                                        socket.close();
                                        Platform.runLater(() -> {
                                            Stage r = (Stage) availablePlayerList.getScene().getWindow();
                                            Parent root = new IPScreenBase();
                                            Scene scene = new Scene(root);
                                            r.setScene(scene);
                                            r.show();
                                        });

                                    } else {
                                        System.out.println("fail");
                                    }

                                } else if (obj instanceof RequestProfileBase) {
                                    playersData = (RequestProfileBase) obj;
                                    topPlayersNames.clear();
                                    availablePlayer.clear();
//                                    System.out.println(playersData.getOnlinePlayer().size());
                                    for (Player p : playersData.getTopPlayers()) {
                                        topPlayersNames.add(new listItemBase(p.getUserName(), String.valueOf(p.getScore())));
                                    }

                                    for (Player p : playersData.getOnlinePlayer()) {
                                        availablePlayer.add(new listItemBase(p.getUserName(), String.valueOf(p.getScore())));
                                    }
                                } else if (obj instanceof RequestGame) {
                                    if (requestGame.getGameResponse() == 0) {
                                        acceptRequest(requestGame.getRequstedUserName() + "want to play with you !");

                                    } else if (requestGame.getGameResponse() == 1) {
                                        waittingStatge.close();
                                        g = new OnlineGame(new Player(requestGame.getRequstedUserName()), new Player(requestGame.getChoosePlayerUserName()));
                                        Stage r = (Stage) availablePlayerList.getScene().getWindow();
                                        g = new OnlineGame(new Player(requestGame.getRequstedUserName()), new Player(requestGame.getChoosePlayerUserName()));

                                        Parent root = new GameScreen(g);
                                        Scene scene = new Scene(root);
                                        r.setScene(scene);
                                        r.show();

                                    } else if (requestGame.getGameResponse() == 2) {
                                        waittingStatge.close();
                                    }
                                }

                            } catch (SocketException ex) {
                                try {
                                    socket.close();
                                } catch (IOException ex1) {
                                    Logger.getLogger(playerProfileBase.class.getName()).log(Level.SEVERE, null, ex1);
                                }
                            } catch (IOException | ClassNotFoundException ex) {
                                Logger.getLogger(playerProfileBase.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(playerProfileBase.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

                //
            };
            thread.start();
        }

//        ScheduledExecutorService scedular = Executors.newScheduledThreadPool(1);
//        scedular.scheduleAtFixedRate(thread, 1, 1, TimeUnit.MILLISECONDS);
        // set player
        initiatePlayerProfile(player);

        availablePlayerList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<listItemBase>() {
            @Override
            public void changed(ObservableValue<? extends listItemBase> observable, listItemBase oldValue, listItemBase newValue) {
                playerOne = player.getUserName();
                requestGame = new RequestGame(playerOne, newValue.getUserNameStr(), 0);
                try {
                    outputStream = socket.getOutputStream();
                    objectOutputStream = new ObjectOutputStream(outputStream);
                    objectOutputStream.writeObject(requestGame);
                    objectOutputStream.flush();
                    waitingResponse("waiting response from " + " " + newValue);

                } catch (IOException ex) {
                    Logger.getLogger(playerProfileBase.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }

    public void initiatePlayerProfile(Player player) {
        playerName.setText(player.getUserName());
    }

    public void acceptRequest(String waiting) {
        acceptanceStage = new Stage();
        acceptanceStage.initModality(Modality.APPLICATION_MODAL);
        Text message = new Text(waiting);
        Button sureButton = new Button("accept");

        sureButton.setOnAction(e -> {

            try {
                requestGame.setGameResponse(RequestGame.acceptChallenge);
                objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(requestGame);
            } catch (IOException ex) {
                Logger.getLogger(playerProfileBase.class.getName()).log(Level.SEVERE, null, ex);
            }
            g = new OnlineGame(new Player(requestGame.getRequstedUserName()), new Player(requestGame.getChoosePlayerUserName()));
            acceptanceStage.close();
            Stage r = (Stage) availablePlayerList.getScene().getWindow();
            System.out.println("asdaskfk ");
            Parent root = new GameScreen(g);
            Scene scene = new Scene(root);
            r.setScene(scene);
            r.show();

        });

        Button refusButton = new Button("refuse");

        refusButton.setOnAction(e -> {
            acceptanceStage.close();
            try {
                requestGame.setGameResponse(RequestGame.refuseChallenge);
                objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(requestGame);
            } catch (IOException ex) {
                Logger.getLogger(playerProfileBase.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
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
    }

    public void waitingResponse(String waiting) {
        waittingStatge = new Stage();
        waittingStatge.initModality(Modality.APPLICATION_MODAL);
        Text message = new Text(waiting);
        Button sureButton = new Button("cancel");

        sureButton.setOnAction(e -> {
            waittingStatge.close();
        });
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
        layout.add(subLayout, 0, 1);
        Scene scene = new Scene(layout, 250, 90);
        waittingStatge.setTitle("waitting...");
        waittingStatge.setScene(scene);
        waittingStatge.showAndWait();
    }

//    public void smallRouting() {
//        while (!socket.isClosed()) {
//
//        }
//    }
    /*
    public void requestToPLay() {
            }

     */
}
