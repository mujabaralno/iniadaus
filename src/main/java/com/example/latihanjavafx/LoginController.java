package com.example.latihanjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import  javafx.stage.Stage;
import  javafx.event.ActionEvent;

public class LoginController {

    @FXML
    private Button cancelButton;

    public void setCancelButton(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }


}
