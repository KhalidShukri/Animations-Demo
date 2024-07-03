module com.example.animationdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.animationdemo to javafx.fxml;
    exports com.example.animationdemo;
}