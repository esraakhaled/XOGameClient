package xogameclient;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class SignUpBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane;
    protected final Text SignText_id;
    protected final BorderPane borderPane0;
    protected final AnchorPane anchorPane0;
    protected final TextField user_field;
    protected final BorderPane borderPane1;
    protected final AnchorPane anchorPane1;
    protected final TextField password_field;
    protected final BorderPane borderPane2;
    protected final AnchorPane anchorPane2;
    protected final Button signup_btn;
    protected final BorderPane borderPane3;
    protected final AnchorPane anchorPane3;
    protected final Text account_text;
    protected final BorderPane borderPane4;
    protected final AnchorPane anchorPane4;
    protected final Button login_btn;

    public SignUpBase() {

        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        SignText_id = new Text();
        borderPane0 = new BorderPane();
        anchorPane0 = new AnchorPane();
        user_field = new TextField();
        user_field.setPromptText("enter your user name");
        borderPane1 = new BorderPane();
        anchorPane1 = new AnchorPane();
        password_field = new TextField();
        password_field.setPromptText("enter your password");
        borderPane2 = new BorderPane();
        anchorPane2 = new AnchorPane();
        signup_btn = new Button();
        borderPane3 = new BorderPane();
        anchorPane3 = new AnchorPane();
        account_text = new Text();
        borderPane4 = new BorderPane();
        anchorPane4 = new AnchorPane();
        login_btn = new Button();

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

        rowConstraints1.setMaxHeight(65.0);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(64.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(53.0);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(50.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        borderPane.setPrefHeight(200.0);
        borderPane.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        SignText_id.setDisable(true);
        SignText_id.setLayoutX(227.0);
        SignText_id.setLayoutY(48.0);
        SignText_id.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        SignText_id.setStrokeWidth(0.0);
        SignText_id.setText("Sign Up");
        SignText_id.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        SignText_id.setWrappingWidth(145.13671875);
        SignText_id.setFont(new Font(24.0));
        borderPane.setCenter(anchorPane);

        GridPane.setRowIndex(borderPane0, 1);
        borderPane0.setPrefHeight(200.0);
        borderPane0.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        user_field.setLayoutX(160.0);
        user_field.setLayoutY(23.0);
        user_field.setPrefHeight(25.0);
        user_field.setPrefWidth(301.0);
        borderPane0.setCenter(anchorPane0);

        GridPane.setRowIndex(borderPane1, 2);
        borderPane1.setPrefHeight(200.0);
        borderPane1.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        password_field.setLayoutX(161.0);
        password_field.setLayoutY(20.0);
        password_field.setPrefHeight(25.0);
        password_field.setPrefWidth(300.0);
        borderPane1.setCenter(anchorPane1);

        GridPane.setRowIndex(borderPane2, 3);
        borderPane2.setPrefHeight(200.0);
        borderPane2.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane2, javafx.geometry.Pos.CENTER);
        anchorPane2.setPrefHeight(200.0);
        anchorPane2.setPrefWidth(200.0);

        signup_btn.setLayoutX(160.0);
        signup_btn.setLayoutY(14.0);
        signup_btn.setMnemonicParsing(false);
        signup_btn.setPrefHeight(25.0);
        signup_btn.setPrefWidth(301.0);
        signup_btn.setText("Sign Up");
        signup_btn.setFont(new Font(14.0));
        signup_btn.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.signupProfile(event);
                    }
        });
        borderPane2.setCenter(anchorPane2);

        GridPane.setRowIndex(borderPane3, 4);
        borderPane3.setPrefHeight(200.0);
        borderPane3.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane3, javafx.geometry.Pos.CENTER);
        anchorPane3.setPrefHeight(200.0);
        anchorPane3.setPrefWidth(200.0);

        account_text.setDisable(true);
        account_text.setLayoutX(193.0);
        account_text.setLayoutY(40.0);
        account_text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        account_text.setStrokeWidth(0.0);
        account_text.setText("You Already have an account?");
        account_text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        account_text.setWrappingWidth(244.13671875);
        account_text.setFont(new Font(14.0));
        borderPane3.setCenter(anchorPane3);

        GridPane.setRowIndex(borderPane4, 5);
        borderPane4.setPrefHeight(200.0);
        borderPane4.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane4, javafx.geometry.Pos.CENTER);
        anchorPane4.setPrefHeight(200.0);
        anchorPane4.setPrefWidth(200.0);

        login_btn.setLayoutX(258.0);
        login_btn.setLayoutY(23.0);
        login_btn.setMnemonicParsing(false);
        login_btn.setPrefHeight(25.0);
        login_btn.setPrefWidth(112.0);
        login_btn.setText("Login");
        // handle it  not delete it ya abdo
        /*
        login_btn.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Navigation nav = new Navigation();
                nav.loginButton(event);
                    }
        });
*/
        borderPane4.setCenter(anchorPane4);

        getColumnConstraints().add(columnConstraints);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        anchorPane.getChildren().add(SignText_id);
        getChildren().add(borderPane);
        anchorPane0.getChildren().add(user_field);
        getChildren().add(borderPane0);
        anchorPane1.getChildren().add(password_field);
        getChildren().add(borderPane1);
        anchorPane2.getChildren().add(signup_btn);
        getChildren().add(borderPane2);
        anchorPane3.getChildren().add(account_text);
        getChildren().add(borderPane3);
        anchorPane4.getChildren().add(login_btn);
        getChildren().add(borderPane4);

    }
}
