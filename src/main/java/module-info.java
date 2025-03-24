module com.example.formulariocontato {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.formulariocontato to javafx.fxml;
    exports com.example.formulariocontato;
    exports com.example.formulariocontato.models;
    opens com.example.formulariocontato.models to javafx.fxml;
}