package Screens;

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

public abstract class playerProfilenewBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ListView PlayerList;
    protected final Text text;
    protected final AnchorPane anchorPane0;
    protected final ListView recordedList;
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
    protected final Text gameNumber;
    protected final Text text3;
    protected final Text text4;
    protected final Text text5;
    protected final Text scoreNumber;
    protected final Text loseNumber;
    protected final Text rankNumber;
    protected final BorderPane borderPane;
    protected final Text text6;
    protected final AnchorPane anchorPane1;
    protected final Text playerName;
    protected final AnchorPane anchorPane2;
    protected final AnchorPane anchorPane3;
    protected final Button backButton;
    protected final Button signOutButton;
    protected final Button recorderGameButton;

    public playerProfilenewBase() {

        anchorPane = new AnchorPane();
        PlayerList = new ListView();
        text = new Text();
        anchorPane0 = new AnchorPane();
        recordedList = new ListView();
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
        gameNumber = new Text();
        text3 = new Text();
        text4 = new Text();
        text5 = new Text();
        scoreNumber = new Text();
        loseNumber = new Text();
        rankNumber = new Text();
        borderPane = new BorderPane();
        text6 = new Text();
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

        AnchorPane.setBottomAnchor(PlayerList, 6.0);
        AnchorPane.setLeftAnchor(PlayerList, 14.0);
        AnchorPane.setRightAnchor(PlayerList, 40.0);
        AnchorPane.setTopAnchor(PlayerList, 44.0);
        PlayerList.setEditable(true);
        PlayerList.setLayoutX(14.0);
        PlayerList.setLayoutY(44.0);
        PlayerList.setPrefHeight(219.0);
        PlayerList.setPrefWidth(149.0);

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

        AnchorPane.setBottomAnchor(recordedList, 7.0);
        AnchorPane.setRightAnchor(recordedList, 35.0);
        AnchorPane.setTopAnchor(recordedList, 167.0);
        recordedList.setLayoutX(35.0);
        recordedList.setLayoutY(167.0);
        recordedList.setPrefHeight(141.0);
        recordedList.setPrefWidth(182.0);

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

        GridPane.setColumnIndex(gameNumber, 1);
        gameNumber.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        gameNumber.setStrokeWidth(0.0);
        gameNumber.setText("0");
        gameNumber.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameNumber.setWrappingWidth(96.46875);

        GridPane.setRowIndex(text3, 1);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Score");
        text3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text3.setWrappingWidth(90.396484375);

        GridPane.setRowIndex(text4, 2);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Lose");
        text4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text4.setWrappingWidth(87.046875);

        GridPane.setRowIndex(text5, 3);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Rank");
        text5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text5.setWrappingWidth(89.0390625);

        GridPane.setColumnIndex(scoreNumber, 1);
        GridPane.setRowIndex(scoreNumber, 1);
        scoreNumber.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        scoreNumber.setStrokeWidth(0.0);
        scoreNumber.setText("0");
        scoreNumber.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        scoreNumber.setWrappingWidth(96.46875);

        GridPane.setColumnIndex(loseNumber, 1);
        GridPane.setRowIndex(loseNumber, 2);
        loseNumber.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        loseNumber.setStrokeWidth(0.0);
        loseNumber.setText("0");
        loseNumber.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        loseNumber.setWrappingWidth(96.46875);

        GridPane.setColumnIndex(rankNumber, 1);
        GridPane.setRowIndex(rankNumber, 3);
        rankNumber.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        rankNumber.setStrokeWidth(0.0);
        rankNumber.setText("0");
        rankNumber.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        rankNumber.setWrappingWidth(96.46875);
        setLeft(anchorPane0);

        BorderPane.setAlignment(borderPane, javafx.geometry.Pos.CENTER);
        borderPane.setPrefHeight(85.0);
        borderPane.setPrefWidth(594.0);

        BorderPane.setAlignment(text6, javafx.geometry.Pos.CENTER);
        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("XO Game");
        text6.setFont(new Font("System Bold", 24.0));
        borderPane.setCenter(text6);

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
        backButton.setOnAction(this::back);
        backButton.setPrefHeight(25.0);
        backButton.setPrefWidth(52.0);
        backButton.setText("Back");

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
        setBottom(anchorPane3);

        anchorPane.getChildren().add(PlayerList);
        anchorPane.getChildren().add(text);
        anchorPane0.getChildren().add(recordedList);
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
        gridPane.getChildren().add(gameNumber);
        gridPane.getChildren().add(text3);
        gridPane.getChildren().add(text4);
        gridPane.getChildren().add(text5);
        gridPane.getChildren().add(scoreNumber);
        gridPane.getChildren().add(loseNumber);
        gridPane.getChildren().add(rankNumber);
        anchorPane0.getChildren().add(gridPane);
        anchorPane1.getChildren().add(playerName);
        anchorPane3.getChildren().add(backButton);
        anchorPane3.getChildren().add(signOutButton);
        anchorPane3.getChildren().add(recorderGameButton);

    }

    protected abstract void back(javafx.event.ActionEvent actionEvent);

}
