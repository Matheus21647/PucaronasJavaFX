module com.example.pucaronasjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pucaronasjavafx to javafx.fxml;
    exports com.example.pucaronasjavafx;
}