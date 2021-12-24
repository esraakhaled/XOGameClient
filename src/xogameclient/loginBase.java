package xogameclient;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class loginBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final Text login_text;
    protected final BorderPane borderPane;
    protected final Button login_btn;
    protected final BorderPane borderPane0;
    protected final Button sign_btn;
    protected final BorderPane borderPane1;
    protected final TextField user_field;
    protected final BorderPane borderPane2;
    protected final TextField pass_field;

    public loginBase() {

        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        login_text = new Text();
        borderPane = new BorderPane();
        login_btn = new Button();
        borderPane0 = new BorderPane();
        sign_btn = new Button();
        borderPane1 = new BorderPane();
        user_field = new TextField();
        borderPane2 = new BorderPane();
        pass_field = new TextField();

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

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(login_text, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(login_text, javafx.geometry.VPos.CENTER);
        login_text.setDisable(true);
        login_text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        login_text.setStrokeWidth(0.0);
        login_text.setText("Login");
        login_text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        login_text.setTextOrigin(javafx.geometry.VPos.CENTER);
        login_text.setWrappingWidth(168.13671875);
        login_text.setFont(new Font(36.0));

        GridPane.setRowIndex(borderPane, 3);
        borderPane.setPrefHeight(200.0);
        borderPane.setPrefWidth(200.0);

        BorderPane.setAlignment(login_btn, javafx.geometry.Pos.CENTER);
        login_btn.setMaxHeight(44.0);
        login_btn.setMaxWidth(315.0);
        login_btn.setMnemonicParsing(false);
        login_btn.setPrefHeight(51.0);
        login_btn.setPrefWidth(428.0);
        login_btn.setText("Login");
        login_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        login_btn.setFont(new Font(24.0));
        borderPane.setCenter(login_btn);

        GridPane.setRowIndex(borderPane0, 4);
        borderPane0.setPrefHeight(200.0);
        borderPane0.setPrefWidth(200.0);

        BorderPane.setAlignment(sign_btn, javafx.geometry.Pos.CENTER);
        sign_btn.setMnemonicParsing(false);
        sign_btn.setPrefHeight(51.0);
        sign_btn.setPrefWidth(118.0);
        sign_btn.setText("Sign Up");
        sign_btn.setFont(new Font(24.0));
        borderPane0.setCenter(sign_btn);

        GridPane.setRowIndex(borderPane1, 1);
        borderPane1.setPrefHeight(200.0);
        borderPane1.setPrefWidth(200.0);

        BorderPane.setAlignment(user_field, javafx.geometry.Pos.CENTER);
        user_field.setMaxHeight(44.0);
        user_field.setMaxWidth(315.0);
        user_field.setPrefHeight(45.0);
        user_field.setPrefWidth(600.0);
        user_field.setText("user_name");
        user_field.setFont(new Font(24.0));
        borderPane1.setCenter(user_field);

        GridPane.setRowIndex(borderPane2, 2);
        borderPane2.setPrefHeight(200.0);
        borderPane2.setPrefWidth(200.0);

        BorderPane.setAlignment(pass_field, javafx.geometry.Pos.CENTER);
        pass_field.setMaxHeight(44.0);
        pass_field.setMaxWidth(315.0);
        pass_field.setPrefHeight(44.0);
        pass_field.setPrefWidth(600.0);
        pass_field.setText("password");
        pass_field.setFont(new Font(24.0));
        borderPane2.setCenter(pass_field);

        getColumnConstraints().add(columnConstraints);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getChildren().add(login_text);
        getChildren().add(borderPane);
        getChildren().add(borderPane0);
        getChildren().add(borderPane1);
        getChildren().add(borderPane2);

    }
}
