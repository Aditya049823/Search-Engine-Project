module com.example.searchengine {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.searchengine to javafx.fxml;
    exports com.example.searchengine;
}