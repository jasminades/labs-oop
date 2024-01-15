package org.example.week12;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    public Button btnLogin;

    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    void login(ActionEvent event) throws IOException {
        if (authenticateUser()) {
            switchToStudentsScreen(event);
        } else {
            showError("Login Failed", "Incorrect username or password");
        }
    }

    private boolean authenticateUser() {
        String enteredUsername = "";
        String enteredPassword = "";

        // Authenticate user against your user list or database
        for (User user : ListController.users) {
            if (user.isValidLogin(enteredUsername, enteredPassword)) {
                return true;
            }
        }
        return false;
    }

    private void showError(String title, String message) {
        Locale.setDefault(Locale.ENGLISH);
        javafx.scene.control.Alert error = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
        error.setTitle(title);
        error.setHeaderText(message);
        error.show();
    }

    private void switchToStudentsScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("students.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
