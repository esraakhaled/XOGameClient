package xogameclient;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class WelcomeXO extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final BorderPane borderPane;
    protected final Text txt_name;
    protected final AnchorPane anchorPane;
    protected final Button button_local;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final BorderPane borderPane0;
    protected final AnchorPane anchorPane0;
    protected final Button button_computer;
    protected final BorderPane borderPane1;
    protected final AnchorPane anchorPane1;
    protected final Button button_online;

    public WelcomeXO() {

        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        borderPane = new BorderPane();
        txt_name = new Text();
        anchorPane = new AnchorPane();
        button_local = new Button();
        gridPane = new GridPane();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        borderPane0 = new BorderPane();
        anchorPane0 = new AnchorPane();
        button_computer = new Button();
        borderPane1 = new BorderPane();
        anchorPane1 = new AnchorPane();
        button_online = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

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

        borderPane.setPrefHeight(200.0);
        borderPane.setPrefWidth(200.0);

        BorderPane.setAlignment(txt_name, javafx.geometry.Pos.CENTER);
        txt_name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt_name.setStrokeWidth(0.0);
        txt_name.setText("XO Game");
        txt_name.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        txt_name.setWrappingWidth(214.13671875);
        txt_name.setFont(new Font("System Bold", 27.0));
        borderPane.setCenter(txt_name);

        GridPane.setRowIndex(anchorPane, 2);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(button_local, 51.0);
        AnchorPane.setLeftAnchor(button_local, 212.0);
        AnchorPane.setRightAnchor(button_local, 212.0);
        AnchorPane.setTopAnchor(button_local, 51.0);
        button_local.setLayoutX(212.0);
        button_local.setLayoutY(51.0);
        button_local.setMnemonicParsing(false);
        button_local.setPrefHeight(31.0);
        button_local.setPrefWidth(153.0);
        button_local.setText("Play Local");
        button_local.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button_local.setFont(new Font(15.0));
        button_local.setPadding(new Insets(25.0));
        button_local.addEventFilter(ActionEvent.ACTION, (ActionEvent event) -> {
            AlertDialog.display("JavaFX Custom Dialog Demo");
        });
        GridPane.setRowIndex(gridPane, 1);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(borderPane0, 1);
        borderPane0.setPrefHeight(200.0);
        borderPane0.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(button_computer, 31.0);
        AnchorPane.setLeftAnchor(button_computer, 58.0);
        AnchorPane.setRightAnchor(button_computer, 58.0);
        AnchorPane.setTopAnchor(button_computer, 31.0);
        button_computer.setAlignment(javafx.geometry.Pos.CENTER);
        button_computer.setLayoutX(58.0);
        button_computer.setLayoutY(31.0);
        button_computer.setMnemonicParsing(false);
        button_computer.setPrefHeight(31.0);
        button_computer.setPrefWidth(184.0);
        button_computer.setText("Play with computer");
        button_computer.setFont(new Font(15.0));
        button_computer.setPadding(new Insets(25.0));
        borderPane0.setCenter(anchorPane0);

        borderPane1.setPrefHeight(200.0);
        borderPane1.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(button_online, 31.0);
        AnchorPane.setLeftAnchor(button_online, 58.0);
        AnchorPane.setRightAnchor(button_online, 58.0);
        AnchorPane.setTopAnchor(button_online, 31.0);
        button_online.setAlignment(javafx.geometry.Pos.CENTER);
        button_online.setLayoutX(58.0);
        button_online.setLayoutY(31.0);
        button_online.setMnemonicParsing(false);
        button_online.setPrefHeight(31.0);
        button_online.setPrefWidth(184.0);
        button_online.setText("Play Online");
        button_online.setFont(new Font(15.0));
        button_online.setPadding(new Insets(25.0));
        borderPane1.setCenter(anchorPane1);

        getColumnConstraints().add(columnConstraints);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getChildren().add(borderPane);
        anchorPane.getChildren().add(button_local);
        getChildren().add(anchorPane);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        anchorPane0.getChildren().add(button_computer);
        gridPane.getChildren().add(borderPane0);
        anchorPane1.getChildren().add(button_online);
        gridPane.getChildren().add(borderPane1);
        getChildren().add(gridPane);

    }
}
