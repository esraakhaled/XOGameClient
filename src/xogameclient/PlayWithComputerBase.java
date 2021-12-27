package xogameclient;

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class PlayWithComputerBase extends BorderPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Text text;
    protected final Text text0;
    protected final Text text1;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
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
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints3;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final Text text2;
    protected final Text text3;

    public PlayWithComputerBase() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        text = new Text();
        text0 = new Text();
        text1 = new Text();
        gridPane0 = new GridPane();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
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
        gridPane1 = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints5 = new RowConstraints();
        text2 = new Text();
        text3 = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(text, javafx.geometry.HPos.CENTER);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Play With Computer");
        text.setFont(new Font(20.0));

        GridPane.setRowIndex(text0, 1);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("user_name: 90");
        text0.setFont(new Font(16.0));

        GridPane.setRowIndex(text1, 2);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Computer: 20");
        text1.setFont(new Font(16.0));
        setTop(gridPane);

        BorderPane.setAlignment(gridPane0, javafx.geometry.Pos.CENTER);
        gridPane0.setGridLinesVisible(true);
        gridPane0.setPrefHeight(187.0);
        gridPane0.setPrefWidth(200.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_0_0, 0.0);
        AnchorPane.setLeftAnchor(cell_0_0, 0.0);
        AnchorPane.setRightAnchor(cell_0_0, 0.0);
        AnchorPane.setTopAnchor(cell_0_0, 0.0);
        cell_0_0.setLayoutY(1.0);
        cell_0_0.setMnemonicParsing(false);
        cell_0_0.setPrefHeight(64.0);
        cell_0_0.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane0, 1);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_0_1, 0.0);
        AnchorPane.setLeftAnchor(cell_0_1, 0.0);
        AnchorPane.setRightAnchor(cell_0_1, 0.0);
        AnchorPane.setTopAnchor(cell_0_1, 0.0);
        cell_0_1.setMnemonicParsing(false);
        cell_0_1.setPrefHeight(64.0);
        cell_0_1.setPrefWidth(90.0);

        GridPane.setColumnIndex(anchorPane1, 2);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(cell_0_2, 0.0);
        AnchorPane.setLeftAnchor(cell_0_2, 0.0);
        AnchorPane.setRightAnchor(cell_0_2, 0.0);
        AnchorPane.setTopAnchor(cell_0_2, 0.0);
        cell_0_2.setLayoutX(1.0);
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
        cell_1_2.setLayoutX(-4.0);
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
        cell_1_1.setLayoutX(-14.0);
        cell_1_1.setLayoutY(-13.0);
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
        cell_1_0.setLayoutX(-2.0);
        cell_1_0.setLayoutY(-8.0);
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
        cell_2_0.setLayoutX(-24.0);
        cell_2_0.setLayoutY(-12.0);
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
        cell_2_1.setLayoutX(8.0);
        cell_2_1.setLayoutY(8.0);
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
        cell_2_2.setLayoutX(1.0);
        cell_2_2.setLayoutY(-3.0);
        cell_2_2.setMnemonicParsing(false);
        cell_2_2.setPrefHeight(64.0);
        cell_2_2.setPrefWidth(90.0);
        setCenter(gridPane0);

        BorderPane.setAlignment(gridPane1, javafx.geometry.Pos.CENTER);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(100.0);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(text2, javafx.geometry.HPos.CENTER);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("user_name : X");

        GridPane.setColumnIndex(text3, 1);
        GridPane.setHalignment(text3, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(text3, javafx.geometry.VPos.CENTER);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Computer: O");
        setBottom(gridPane1);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(text);
        gridPane.getChildren().add(text0);
        gridPane.getChildren().add(text1);
        gridPane0.getColumnConstraints().add(columnConstraints0);
        gridPane0.getColumnConstraints().add(columnConstraints1);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints4);
        anchorPane.getChildren().add(cell_0_0);
        gridPane0.getChildren().add(anchorPane);
        anchorPane0.getChildren().add(cell_0_1);
        gridPane0.getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(cell_0_2);
        gridPane0.getChildren().add(anchorPane1);
        anchorPane2.getChildren().add(cell_1_2);
        gridPane0.getChildren().add(anchorPane2);
        anchorPane3.getChildren().add(cell_1_1);
        gridPane0.getChildren().add(anchorPane3);
        anchorPane4.getChildren().add(cell_1_0);
        gridPane0.getChildren().add(anchorPane4);
        anchorPane5.getChildren().add(cell_2_0);
        gridPane0.getChildren().add(anchorPane5);
        anchorPane6.getChildren().add(cell_2_1);
        gridPane0.getChildren().add(anchorPane6);
        anchorPane7.getChildren().add(cell_2_2);
        gridPane0.getChildren().add(anchorPane7);
        gridPane1.getColumnConstraints().add(columnConstraints3);
        gridPane1.getColumnConstraints().add(columnConstraints4);
        gridPane1.getRowConstraints().add(rowConstraints5);
        gridPane1.getChildren().add(text2);
        gridPane1.getChildren().add(text3);

    }
}
