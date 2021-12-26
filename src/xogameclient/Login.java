package xogameclient;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class Login extends GridPane {
    

    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane;
    protected final Text login_text;
    protected final BorderPane borderPane0;
    protected final AnchorPane anchorPane0;
    protected final TextField user_text;
    protected final BorderPane borderPane1;
    protected final AnchorPane anchorPane1;
    protected final TextField password_field;
    protected final BorderPane borderPane2;
    protected final AnchorPane anchorPane2;
    protected final Button login_btn;
    protected final BorderPane borderPane3;
    protected final AnchorPane anchorPane3;
    protected final Button sign_btn;

    public Login() {

        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        login_text = new Text();
        borderPane0 = new BorderPane();
        anchorPane0 = new AnchorPane();
        user_text = new TextField();
        borderPane1 = new BorderPane();
        anchorPane1 = new AnchorPane();
        password_field = new TextField();
        borderPane2 = new BorderPane();
        anchorPane2 = new AnchorPane();
        login_btn = new Button();
        borderPane3 = new BorderPane();
        anchorPane3 = new AnchorPane();
        sign_btn = new Button();

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

        borderPane.setPrefHeight(200.0);
        borderPane.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        login_text.setDisable(true);
        login_text.setLayoutX(240.0);
        login_text.setLayoutY(44.0);
        login_text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        login_text.setStrokeWidth(0.0);
        login_text.setText("Login");
        login_text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        login_text.setWrappingWidth(120.13671875);
        login_text.setFont(new Font(24.0));
        borderPane.setCenter(anchorPane);

        GridPane.setRowIndex(borderPane0, 1);
        borderPane0.setPrefHeight(200.0);
        borderPane0.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        user_text.setLayoutX(162.0);
        user_text.setLayoutY(28.0);
        user_text.setPrefHeight(25.0);
        user_text.setPrefWidth(292.0);
        user_text.setFont(new Font(14.0));
        borderPane0.setCenter(anchorPane0);

        GridPane.setRowIndex(borderPane1, 2);
        borderPane1.setPrefHeight(200.0);
        borderPane1.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        password_field.setLayoutX(161.0);
        password_field.setLayoutY(28.0);
        password_field.setPrefHeight(30.0);
        password_field.setPrefWidth(297.0);
        password_field.setFont(new Font(14.0));
        borderPane1.setCenter(anchorPane1);

        GridPane.setRowIndex(borderPane2, 3);
        borderPane2.setPrefHeight(200.0);
        borderPane2.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane2, javafx.geometry.Pos.CENTER);
        anchorPane2.setPrefHeight(200.0);
        anchorPane2.setPrefWidth(200.0);

        login_btn.setLayoutX(164.0);
        login_btn.setLayoutY(28.0);
        login_btn.setMnemonicParsing(false);
        //login_btn.setOnAction(this::login);
        login_btn.setPrefHeight(25.0);
        login_btn.setPrefWidth(297.0);
        login_btn.setText("Log In");
        login_btn.setFont(new Font(14.0));
        borderPane2.setCenter(anchorPane2);

        GridPane.setRowIndex(borderPane3, 4);
        borderPane3.setPrefHeight(200.0);
        borderPane3.setPrefWidth(200.0);

        BorderPane.setAlignment(anchorPane3, javafx.geometry.Pos.CENTER);
        anchorPane3.setPrefHeight(200.0);
        anchorPane3.setPrefWidth(200.0);

        sign_btn.setLayoutX(263.0);
        sign_btn.setLayoutY(28.0);
        sign_btn.setMnemonicParsing(false);
        //sign_btn.setOnAction(this::ignup);
        sign_btn.setPrefHeight(25.0);
        sign_btn.setPrefWidth(114.0);
        sign_btn.setText("Sign Up");
        borderPane3.setCenter(anchorPane3);

        getColumnConstraints().add(columnConstraints);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        anchorPane.getChildren().add(login_text);
        getChildren().add(borderPane);
        anchorPane0.getChildren().add(user_text);
        getChildren().add(borderPane0);
        anchorPane1.getChildren().add(password_field);
        getChildren().add(borderPane1);
        anchorPane2.getChildren().add(login_btn);
        getChildren().add(borderPane2);
        anchorPane3.getChildren().add(sign_btn);
        getChildren().add(borderPane3);

    }
     @FXML
    public void login(ActionEvent event) throws IOException{
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("playerProfile.Fxml"));
        //stage.setTitle("Log in");
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
     @FXML
    public void signUp(ActionEvent event) throws IOException{
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("sign_Up.Fxml"));
        //stage.setTitle("Log in");
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


   

}
