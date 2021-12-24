package xogameclient;

import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class RegisterBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final Text sign_id;
    protected final BorderPane borderPane;
    protected final Button sign_btn;
    protected final BorderPane borderPane0;
    protected final Button login_btn;
    protected final BorderPane borderPane1;
    protected final Text account_text;
    protected final BorderPane borderPane2;
    protected final TextField user_field;
    protected final BorderPane borderPane3;
    protected final TextField user_field0;

    public RegisterBase() {

        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        sign_id = new Text();
        borderPane = new BorderPane();
        sign_btn = new Button();
        borderPane0 = new BorderPane();
        login_btn = new Button();
        borderPane1 = new BorderPane();
        account_text = new Text();
        borderPane2 = new BorderPane();
        user_field = new TextField();
        borderPane3 = new BorderPane();
        user_field0 = new TextField();

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

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(sign_id, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(sign_id, javafx.geometry.VPos.CENTER);
        sign_id.setDisable(true);
        sign_id.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        sign_id.setStrokeWidth(0.0);
        sign_id.setText("Sign Up");
        sign_id.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        sign_id.setTextOrigin(javafx.geometry.VPos.CENTER);
        sign_id.setWrappingWidth(166.029296875);
        sign_id.setFont(new Font(36.0));

        GridPane.setRowIndex(borderPane, 3);
        borderPane.setPrefHeight(200.0);
        borderPane.setPrefWidth(200.0);

        BorderPane.setAlignment(sign_btn, javafx.geometry.Pos.CENTER);
        sign_btn.setMnemonicParsing(false);
        sign_btn.setPrefHeight(44.0);
        sign_btn.setPrefWidth(315.0);
        sign_btn.setText("Sign UP");
        sign_btn.setFont(new Font(24.0));
        borderPane.setCenter(sign_btn);

        GridPane.setRowIndex(borderPane0, 5);
        borderPane0.setPrefHeight(200.0);
        borderPane0.setPrefWidth(200.0);

        BorderPane.setAlignment(login_btn, javafx.geometry.Pos.CENTER);
        login_btn.setMnemonicParsing(false);
        login_btn.setPrefHeight(51.0);
        login_btn.setPrefWidth(111.0);
        login_btn.setText("Login ");
        login_btn.setFont(new Font(24.0));
        borderPane0.setCenter(login_btn);

        GridPane.setRowIndex(borderPane1, 4);
        borderPane1.setPrefHeight(200.0);
        borderPane1.setPrefWidth(200.0);

        BorderPane.setAlignment(account_text, javafx.geometry.Pos.CENTER);
        account_text.setDisable(true);
        account_text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        account_text.setStrokeWidth(0.0);
        account_text.setText("You Already have an account?");
        account_text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        account_text.setWrappingWidth(321.13671875);
        account_text.setFont(new Font(24.0));
        borderPane1.setCenter(account_text);

        GridPane.setRowIndex(borderPane2, 1);
        borderPane2.setPrefHeight(200.0);
        borderPane2.setPrefWidth(200.0);

        BorderPane.setAlignment(user_field, javafx.geometry.Pos.CENTER);
        user_field.setMaxHeight(USE_PREF_SIZE);
        user_field.setMaxWidth(310.0);
        user_field.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        user_field.setPrefHeight(44.0);
        user_field.setPrefWidth(310.0);
        user_field.setText("user_name");
        user_field.setCursor(Cursor.N_RESIZE);
        user_field.setFont(new Font(24.0));
        borderPane2.setCenter(user_field);

        GridPane.setRowIndex(borderPane3, 2);
        borderPane3.setPrefHeight(200.0);
        borderPane3.setPrefWidth(200.0);

        BorderPane.setAlignment(user_field0, javafx.geometry.Pos.CENTER);
        user_field0.setMaxHeight(44.0);
        user_field0.setMaxWidth(315.0);
        user_field0.setPrefHeight(42.0);
        user_field0.setPrefWidth(600.0);
        user_field0.setText("password");
        user_field0.setFont(new Font(24.0));
        borderPane3.setCenter(user_field0);

        getColumnConstraints().add(columnConstraints);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        getChildren().add(sign_id);
        getChildren().add(borderPane);
        getChildren().add(borderPane0);
        getChildren().add(borderPane1);
        getChildren().add(borderPane2);
        getChildren().add(borderPane3);

    }
}
