package org.example.week12;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("login.fxml"));
        Parent root = fxmlLoader.load();
        LoginController loginController = fxmlLoader.getController(); // Get the controller

        Scene scene = new Scene(root, 800, 500);
        stage.setTitle("Users");
        stage.setScene(scene);
        stage.show();

        // Set the service for login validation
        UserService userService = new UserService();
        loginController.setUserService(userService);
    }

    public static void main(String[] args) {
        launch();
    }
}
