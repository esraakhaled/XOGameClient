package xogameclient;

import javafx.geometry.Insets;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class RecordedGameBase extends BorderPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final AnchorPane anchorPane;
    protected final Button cell_0_0;
    protected final AnchorPane anchorPane0;
    protected final Button cell_0_1;
    protected final AnchorPane anchorPane1;
    protected final Button cell_0_2;
    protected final AnchorPane anchorPane2;
    protected final Button cell_1_2;
    protected final AnchorPane anchorPane3;
    protected final Button cell_1_1;
    protected final AnchorPane anchorPane4;
    protected final Button cell_1_0;
    protected final AnchorPane anchorPane5;
    protected final Button cell_2_0;
    protected final AnchorPane anchorPane6;
    protected final Button cell_2_1;
    protected final AnchorPane anchorPane7;
    protected final Button cell_2_2;
    protected final BorderPane borderPane;
    protected final Text TitleOFScreen;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints2;
    protected final AnchorPane anchorPane8;
    protected final Text secondPlayerName;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints3;
    protected final Text firstPlayerName;
    protected final AnchorPane anchorPane9;
    protected final Accordion accordion;
    protected final AnchorPane anchorPane10;
    protected final AnchorPane anchorPane11;
    protected final Button BackButton;
    

    public RecordedGameBase() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        anchorPane = new AnchorPane();
        cell_0_0 = new Button();
        anchorPane0 = new AnchorPane();
        cell_0_1 = new Button();
        anchorPane1 = new AnchorPane();
        cell_0_2 = new Button();
        anchorPane2 = new AnchorPane();
        cell_1_2 = new Button();
        anchorPane3 = new AnchorPane();
        cell_1_1 = new Button();
        anchorPane4 = new AnchorPane();
        cell_1_0 = new Button();
        anchorPane5 = new AnchorPane();
        cell_2_0 = new Button();
        anchorPane6 = new AnchorPane();
        cell_2_1 = new Button();
        anchorPane7 = new AnchorPane();
        cell_2_2 = new Button();
        borderPane = new BorderPane();
        TitleOFScreen = new Text();
        gridPane0 = new GridPane();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        anchorPane8 = new AnchorPane();
        secondPlayerName = new Text();
        gridPane1 = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints3 = new RowConstraints();
        firstPlayerName = new Text();
        anchorPane9 = new AnchorPane();
        accordion = new Accordion();
        anchorPane10 = new AnchorPane();
        anchorPane11 = new AnchorPane();
        BackButton = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(400.0);
        setMinWidth(500.0);
        setPrefHeight(400.0);
        setPrefWidth(586.0);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
        gridPane.setGridLinesVisible(true);
        gridPane.setPrefHeight(187.0);
        gridPane.setPrefWidth(200.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_0_0, 0.0);
        AnchorPane.setLeftAnchor(cell_0_0, 0.0);
        AnchorPane.setRightAnchor(cell_0_0, 0.0);
        AnchorPane.setTopAnchor(cell_0_0, 0.0);
        cell_0_0.setLayoutY(2.0);
        cell_0_0.setMnemonicParsing(false);
        cell_0_0.setPrefHeight(64.0);
        cell_0_0.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane0, 1);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_0_1, 0.0);
        AnchorPane.setLeftAnchor(cell_0_1, 1.0);
        AnchorPane.setRightAnchor(cell_0_1, 1.0);
        AnchorPane.setTopAnchor(cell_0_1, 0.0);
        cell_0_1.setLayoutX(26.0);
        cell_0_1.setLayoutY(-5.0);
        cell_0_1.setMnemonicParsing(false);
        cell_0_1.setPrefHeight(64.0);
        cell_0_1.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane1, 2);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_0_2, 1.0);
        AnchorPane.setLeftAnchor(cell_0_2, 0.0);
        AnchorPane.setRightAnchor(cell_0_2, 0.0);
        AnchorPane.setTopAnchor(cell_0_2, 0.0);
        cell_0_2.setLayoutX(37.0);
        cell_0_2.setLayoutY(-11.0);
        cell_0_2.setMnemonicParsing(false);
        cell_0_2.setPrefHeight(64.0);
        cell_0_2.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane2, 2);
        GridPane.setRowIndex(anchorPane2, 1);
        anchorPane2.setPrefHeight(200.0);
        anchorPane2.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_1_2, 0.0);
        AnchorPane.setLeftAnchor(cell_1_2, 0.0);
        AnchorPane.setRightAnchor(cell_1_2, 0.0);
        AnchorPane.setTopAnchor(cell_1_2, 0.0);
        cell_1_2.setLayoutX(35.0);
        cell_1_2.setMnemonicParsing(false);
        cell_1_2.setPrefHeight(64.0);
        cell_1_2.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane3, 1);
        GridPane.setRowIndex(anchorPane3, 1);
        anchorPane3.setPrefHeight(200.0);
        anchorPane3.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_1_1, 0.0);
        AnchorPane.setLeftAnchor(cell_1_1, 0.0);
        AnchorPane.setRightAnchor(cell_1_1, 0.0);
        AnchorPane.setTopAnchor(cell_1_1, 0.0);
        cell_1_1.setLayoutX(30.0);
        cell_1_1.setLayoutY(-6.0);
        cell_1_1.setMnemonicParsing(false);
        cell_1_1.setPrefHeight(64.0);
        cell_1_1.setPrefWidth(90.0);

        GridPane.setRowIndex(anchorPane4, 1);
        anchorPane4.setPrefHeight(200.0);
        anchorPane4.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_1_0, 0.0);
        AnchorPane.setLeftAnchor(cell_1_0, 0.0);
        AnchorPane.setRightAnchor(cell_1_0, 0.0);
        AnchorPane.setTopAnchor(cell_1_0, 0.0);
        cell_1_0.setLayoutX(12.0);
        cell_1_0.setLayoutY(-7.0);
        cell_1_0.setMnemonicParsing(false);
        cell_1_0.setPrefHeight(64.0);
        cell_1_0.setPrefWidth(90.0);

        GridPane.setRowIndex(anchorPane5, 2);
        anchorPane5.setPrefHeight(200.0);
        anchorPane5.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_2_0, 0.0);
        AnchorPane.setLeftAnchor(cell_2_0, 0.0);
        AnchorPane.setRightAnchor(cell_2_0, 0.0);
        AnchorPane.setTopAnchor(cell_2_0, 0.0);
        cell_2_0.setLayoutX(14.0);
        cell_2_0.setLayoutY(-5.0);
        cell_2_0.setMnemonicParsing(false);
        cell_2_0.setPrefHeight(64.0);
        cell_2_0.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane6, 1);
        GridPane.setRowIndex(anchorPane6, 2);
        anchorPane6.setPrefHeight(200.0);
        anchorPane6.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_2_1, 0.0);
        AnchorPane.setLeftAnchor(cell_2_1, 0.0);
        AnchorPane.setRightAnchor(cell_2_1, 0.0);
        AnchorPane.setTopAnchor(cell_2_1, 0.0);
        cell_2_1.setLayoutX(11.0);
        cell_2_1.setLayoutY(5.0);
        cell_2_1.setMnemonicParsing(false);
        cell_2_1.setPrefHeight(64.0);
        cell_2_1.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane7, 2);
        GridPane.setRowIndex(anchorPane7, 2);
        anchorPane7.setPrefHeight(200.0);
        anchorPane7.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_2_2, 0.0);
        AnchorPane.setLeftAnchor(cell_2_2, 0.0);
        AnchorPane.setRightAnchor(cell_2_2, 0.0);
        AnchorPane.setTopAnchor(cell_2_2, 0.0);
        cell_2_2.setLayoutX(25.0);
        cell_2_2.setLayoutY(15.0);
        cell_2_2.setMnemonicParsing(false);
        cell_2_2.setPrefHeight(64.0);
        cell_2_2.setPrefWidth(90.0);
        setCenter(gridPane);

        BorderPane.setAlignment(borderPane, javafx.geometry.Pos.CENTER);
        borderPane.setPrefHeight(117.0);
        borderPane.setPrefWidth(699.0);

        BorderPane.setAlignment(TitleOFScreen, javafx.geometry.Pos.TOP_CENTER);
        TitleOFScreen.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        TitleOFScreen.setStrokeWidth(0.0);
        TitleOFScreen.setText("Recorded Game");
        TitleOFScreen.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        TitleOFScreen.setWrappingWidth(147.4921875);
        TitleOFScreen.setFont(new Font("System Bold", 24.0));
        BorderPane.setMargin(TitleOFScreen, new Insets(20.0, 0.0, 0.0, 0.0));
        borderPane.setCenter(TitleOFScreen);

        BorderPane.setAlignment(gridPane0, javafx.geometry.Pos.CENTER);
        gridPane0.setPrefHeight(73.0);
        gridPane0.setPrefWidth(153.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        BorderPane.setMargin(gridPane0, new Insets(60.0, 0.0, 0.0, 0.0));

        anchorPane8.setPrefHeight(200.0);
        anchorPane8.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(secondPlayerName, 15.0);
        AnchorPane.setLeftAnchor(secondPlayerName, 2.0);
        AnchorPane.setRightAnchor(secondPlayerName, 10.0);
        AnchorPane.setTopAnchor(secondPlayerName, 20.0);
        secondPlayerName.setLayoutX(7.0);
        secondPlayerName.setLayoutY(28.0);
        secondPlayerName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        secondPlayerName.setStrokeWidth(0.0);
        secondPlayerName.setText(": player2Name");
        secondPlayerName.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        secondPlayerName.setWrappingWidth(141.37109375);
        secondPlayerName.setFont(new Font(14.0));
        borderPane.setRight(gridPane0);

        BorderPane.setAlignment(gridPane1, javafx.geometry.Pos.CENTER);
        gridPane1.setPrefHeight(83.0);
        gridPane1.setPrefWidth(100.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        BorderPane.setMargin(gridPane1, new Insets(60.0, 0.0, 0.0, 10.0));

        firstPlayerName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        firstPlayerName.setStrokeWidth(0.0);
        firstPlayerName.setText("player1Name :");
        firstPlayerName.setFont(new Font(14.0));
        borderPane.setLeft(gridPane1);
        setTop(borderPane);

        BorderPane.setAlignment(anchorPane9, javafx.geometry.Pos.CENTER);
        anchorPane9.setPrefHeight(234.0);
        anchorPane9.setPrefWidth(168.0);

        accordion.setLayoutY(7.0);
        setLeft(anchorPane9);

        BorderPane.setAlignment(anchorPane10, javafx.geometry.Pos.CENTER);
        anchorPane10.setPrefHeight(234.0);
        anchorPane10.setPrefWidth(161.0);
        setRight(anchorPane10);

        BorderPane.setAlignment(anchorPane11, javafx.geometry.Pos.CENTER);
        anchorPane11.setPrefHeight(61.0);
        anchorPane11.setPrefWidth(685.0);

        BackButton.setLayoutX(33.0);
        BackButton.setLayoutY(22.0);
        BackButton.setMnemonicParsing(false);
        BackButton.setPrefHeight(25.0);
        BackButton.setPrefWidth(110.0);
        BackButton.setText("Back");
        setBottom(anchorPane11);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        anchorPane.getChildren().add(cell_0_0);
        gridPane.getChildren().add(anchorPane);
        anchorPane0.getChildren().add(cell_0_1);
        gridPane.getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(cell_0_2);
        gridPane.getChildren().add(anchorPane1);
        anchorPane2.getChildren().add(cell_1_2);
        gridPane.getChildren().add(anchorPane2);
        anchorPane3.getChildren().add(cell_1_1);
        gridPane.getChildren().add(anchorPane3);
        anchorPane4.getChildren().add(cell_1_0);
        gridPane.getChildren().add(anchorPane4);
        anchorPane5.getChildren().add(cell_2_0);
        gridPane.getChildren().add(anchorPane5);
        anchorPane6.getChildren().add(cell_2_1);
        gridPane.getChildren().add(anchorPane6);
        anchorPane7.getChildren().add(cell_2_2);
        gridPane.getChildren().add(anchorPane7);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints2);
        anchorPane8.getChildren().add(secondPlayerName);
        gridPane0.getChildren().add(anchorPane8);
        gridPane1.getColumnConstraints().add(columnConstraints3);
        gridPane1.getRowConstraints().add(rowConstraints3);
        gridPane1.getChildren().add(firstPlayerName);
        anchorPane9.getChildren().add(accordion);
        anchorPane11.getChildren().add(BackButton);

    }
}
