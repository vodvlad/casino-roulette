module com.example.roulete {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.roulete to javafx.fxml;
    exports com.example.roulete;
}