package com.example.comp181_javafxwithscenebuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;


    private Stage window;
    private Scene scene;
    private Parent root;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void goToNewScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("new-screen-view.fxml"));

        window = (Stage) ( (Node) event.getSource()).getScene().getWindow();

        scene = new Scene(root);

        window.setScene(scene);

        window.show();

    }

    @FXML
    protected void goToHelloScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        window = (Stage) ( (Node) event.getSource()).getScene().getWindow();

        scene = new Scene(root);

        window.setScene(scene);

        window.show();
    }

}