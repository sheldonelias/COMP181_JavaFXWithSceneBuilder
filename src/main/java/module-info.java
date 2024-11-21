module com.example.comp181_javafxwithscenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp181_javafxwithscenebuilder to javafx.fxml;
    exports com.example.comp181_javafxwithscenebuilder;
}