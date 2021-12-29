package xogameclient;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public  class winningVedioBase extends AnchorPane {

    protected final ImageView imageView;

    public winningVedioBase() {

        imageView = new ImageView();

        setId("AnchorPane");
        setMaxHeight(300.0);
        setMaxWidth(300.0);
        setMinHeight(200.0);
        setMinWidth(200.0);
        setPrefHeight(227.0);
        setPrefWidth(300.0);

        AnchorPane.setBottomAnchor(imageView, 28.0);
        AnchorPane.setLeftAnchor(imageView, 0.0);
        AnchorPane.setRightAnchor(imageView, 0.0);
        AnchorPane.setTopAnchor(imageView, 0.0);
        imageView.setFitHeight(272.0);
        imageView.setFitWidth(300.0);
        imageView.setLayoutX(-2.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("win-victory.gif").toExternalForm()));

        getChildren().add(imageView);

    }
}
