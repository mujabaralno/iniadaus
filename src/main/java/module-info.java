module com.example.latihanjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires  java.sql;



    opens com.example.latihanjavafx to javafx.fxml;
    exports com.example.latihanjavafx;
}