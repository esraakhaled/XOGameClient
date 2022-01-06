package xogameclient;


import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class listItemBase extends AnchorPane {

    protected final Text userName;
    protected final Text scoreText;
    String userNameStr ,StringScoreStr;

    public String getUserNameStr() {
        return userNameStr;
    }

    public void setUserNameStr(String userNameStr) {
        this.userNameStr = userNameStr;
    }

    public String getStringScoreStr() {
        return StringScoreStr;
    }

    public void setStringScoreStr(String StringScoreStr) {
        this.StringScoreStr = StringScoreStr;
    }
    
    public listItemBase(String _userName , String _scoreText) {

        userName = new Text();
        scoreText = new Text();

        setId("AnchorPane");
        setPrefHeight(30.0);
        setPrefWidth(90.0);

        AnchorPane.setLeftAnchor(userName, 10.0);
        AnchorPane.setTopAnchor(userName, 13.0);
        userName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        userName.setStrokeWidth(0.0);
        userName.setText(_userName);

        AnchorPane.setLeftAnchor(scoreText, 90.0);
        AnchorPane.setRightAnchor(scoreText, 10.0);
        AnchorPane.setTopAnchor(scoreText, 13.0);
        scoreText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        scoreText.setStrokeWidth(0.0);
        scoreText.setText(_scoreText);

        getChildren().add(userName);
        getChildren().add(scoreText);

    }
}
