module com.example.app_devlopment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.app_devlopment to javafx.fxml;
    exports com.example.app_devlopment;
}