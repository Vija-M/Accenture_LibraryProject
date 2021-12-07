package com.libraryproject.librarydesktopapp.CommonUtilities;

import com.libraryproject.librarydesktopapp.StartGUI;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowsActions {

    public static void changeWindow(String windowName, Button button) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartGUI.class.getResource(windowName));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) button.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
