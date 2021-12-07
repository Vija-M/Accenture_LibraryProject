package com.libraryproject.librarydesktopapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginWindow {
    @FXML
    public TextField loginF;
    @FXML
    public PasswordField passwordF;


    public void validateAndLoadLibrarySystem(ActionEvent actionEvent) throws IOException {
        changeWindow("main-library-window.fxml");
    }

    public void openSignupForm(ActionEvent actionEvent) throws IOException {
        changeWindow("signup-window.fxml");
    }

    private void changeWindow(String windowName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartGUI.class.getResource("signup-window.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) loginF.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
