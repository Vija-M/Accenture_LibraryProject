module com.libraryproject.librarydesktopapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.libraryproject.librarydesktopapp to javafx.fxml;
    exports com.libraryproject.librarydesktopapp;
}