/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Sonu Aryan
 */
public class LoginViewController implements Initializable {
    public static Stage parentStage;
    double x,y;
    @FXML
    private void moveWindow(MouseEvent event){
        parentStage.setX(event.getScreenX()-x);
        parentStage.setY(event.getScreenY()-y);
    }
    @FXML
    private void setCursorToMove(MouseEvent event){
        Pane source=(Pane) event.getSource();
        source.setCursor(Cursor.MOVE);
        this.x=event.getX();
        this.y=event.getY();
    }
    @FXML
    private void setCursorToNormal(MouseEvent event){
        Pane source=(Pane) event.getSource();
        source.setCursor(Cursor.DEFAULT);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
