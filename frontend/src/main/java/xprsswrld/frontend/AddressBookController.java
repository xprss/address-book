package xprsswrld.frontend;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddressBookController {
    @FXML
    private Label savedLabel;
    @FXML
    private TextField userFirstName;
    @FXML
    private TextField userLastName;
    @FXML
    private TextField userPhoneNumber;


    @FXML
    protected void onHelloButtonClick() {
        if(userFirstName.getText().trim().isEmpty()) {
            savedLabel.setText(String.format("Ma il nome almeno zio mettilo...", userFirstName.getText()));
            return;
        }

        if(userPhoneNumber.getText().trim().isEmpty()) {
            savedLabel.setText(String.format("Che fai a fare la rubrica se non metti il numero di telefono...?", userPhoneNumber.getText()));
            return;
        }

        savedLabel.setText(String.format("Olè, %s è ora nella tua rubrica.", userFirstName.getText()));
    }

}