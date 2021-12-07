package com.libraryproject.librarydesktopapp;

import com.libraryproject.librarydesktopapp.CommonUtilities.WindowsActions;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginWindow {
    @FXML
    public TextField loginF;
    @FXML
    public PasswordField passwordF;
    @FXML
    public Button loginB;
    @FXML
    public Button signupB;


    public void validateAndLoadLibrarySystem(ActionEvent actionEvent) throws IOException {
        WindowsActions.changeWindow("main-library-window.fxml", loginB);
    }

    public void openSignupForm(ActionEvent actionEvent) throws IOException {
        WindowsActions.changeWindow("signup-window.fxml", loginB);
    }


}
