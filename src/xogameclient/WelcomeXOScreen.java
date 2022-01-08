package xogameclient;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import models.PcGame;

public  class WelcomeXOScreen extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ImageView xoImage;
    protected final HBox hBox;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane0;
    protected final Button play_local;
    protected final AnchorPane anchorPane1;
    protected final Button playWithPc;
    protected final AnchorPane anchorPane2;
    protected final Button play_online;


    public WelcomeXOScreen() {
      

       
//        columnConstraints = new ColumnConstraints();
//        rowConstraints = new RowConstraints();
//        rowConstraints0 = new RowConstraints();
//        rowConstraints1 = new RowConstraints();
//        borderPane = new BorderPane();
//        txt_name = new Text();

        anchorPane = new AnchorPane();
        xoImage = new ImageView();
        hBox = new HBox();
        borderPane = new BorderPane();
        anchorPane0 = new AnchorPane();
        play_local = new Button();
        anchorPane1 = new AnchorPane();
        playWithPc = new Button();
        anchorPane2 = new AnchorPane();
        play_online = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        xoImage.setFitHeight(301.0);
        xoImage.setFitWidth(329.0);
        xoImage.setLayoutX(126.0);
        xoImage.setLayoutY(1.0);
        xoImage.setPickOnBounds(true);
        xoImage.setPreserveRatio(true);
        setCenter(anchorPane);

        BorderPane.setAlignment(hBox, javafx.geometry.Pos.CENTER);
        hBox.setPrefHeight(100.0);
        hBox.setPrefWidth(200.0);

        borderPane.setPrefHeight(200.0);
        borderPane.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        play_local.setAlignment(javafx.geometry.Pos.CENTER);
        play_local.setLayoutX(27.0);
        play_local.setLayoutY(25.0);
        play_local.setMnemonicParsing(false);
        play_local.setPrefHeight(50.0);
        play_local.setPrefWidth(146.0);
        play_local.setText("play local");
        play_local.setWrapText(true);
         play_local.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            AlertDialog.display("JavaFX Custom Dialog Demo");
                    }
        });
        borderPane.setLeft(anchorPane0);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        playWithPc.setAlignment(javafx.geometry.Pos.CENTER);
        playWithPc.setLayoutX(19.0);
        playWithPc.setLayoutY(25.0);
        playWithPc.setMnemonicParsing(false);
        playWithPc.setPrefHeight(50.0);
        playWithPc.setPrefWidth(146.0);
        playWithPc.setText("play with pc");
        playWithPc.setWrapText(true);
        playWithPc.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation.goToGameScreen( new PcGame());
            }
        });
        borderPane.setCenter(anchorPane1);

        BorderPane.setAlignment(anchorPane2, javafx.geometry.Pos.CENTER);
        anchorPane2.setPrefHeight(200.0);
        anchorPane2.setPrefWidth(200.0);

        play_online.setAlignment(javafx.geometry.Pos.CENTER);
        play_online.setLayoutX(27.0);
        play_online.setLayoutY(25.0);
        play_online.setMnemonicParsing(false);
        play_online.setPrefHeight(50.0);
        play_online.setPrefWidth(146.0);
        play_online.setText("play online");
        play_online.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        play_online.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Navigation.goToIpScreen();

            }
        });
        borderPane.setRight(anchorPane2);
        setBottom(hBox);

        anchorPane.getChildren().add(xoImage);
        anchorPane0.getChildren().add(play_local);
        anchorPane1.getChildren().add(playWithPc);
        anchorPane2.getChildren().add(play_online);
        hBox.getChildren().add(borderPane);
         getStylesheets().add("design/styling.css");
        getStyleClass().add("screen");
        play_online.getStyleClass().add("play_online");
        play_local.getStyleClass().add("play_local");
        playWithPc.getStyleClass().add("play_computer");
    }

    }

