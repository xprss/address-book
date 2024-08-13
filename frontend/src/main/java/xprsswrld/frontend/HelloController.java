package xprsswrld.frontend;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label savedLabel;

    @FXML
    protected void onHelloButtonClick() {
        savedLabel.setText("Contatto salvato nella tua rubrica!");
    }

}