package org.example.week12;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class ListController implements Initializable {
    @FXML
    public TextField txtId;
    @FXML
    public TextField txtName;
    @FXML
    public TextField txtSurname;
    @FXML
    public TextField txtYear;
    @FXML
    public TextField txtCycle;
    @FXML
    public TableView<Student> tblStudents;
    @FXML
    public TableColumn<Student, Integer> colId;
    @FXML
    public TableColumn<Student, String> colName;
    @FXML
    public TableColumn<Student, String> colSurname;
    @FXML
    public TableColumn<Student, String> colCycle;
    @FXML
    public TableColumn<Student, String> colYear;
    @FXML
    public Button btnSaveStudent;

    @FXML
    public TableView<User> tblUsers;
    @FXML
    public TableColumn<User, String> colUsername;
    @FXML
    public TableColumn<User, String> colPassword;
    @FXML
    public Button btnSaveUser;

    private ObservableList<Student> students = FXCollections.observableArrayList();
    private ObservableList<User> users = FXCollections.observableArrayList();
    private int studentSelectedIndex;
    private int userSelectedIndex;

    static void showError(String title, String message) {
        Locale.setDefault(Locale.ENGLISH);
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle(title);
        error.setHeaderText(message);
        error.show();
    }

    @FXML
    void getStudent(MouseEvent event) {
        studentSelectedIndex = tblStudents.getSelectionModel().getSelectedIndex();
        if (studentSelectedIndex <= -1) return;

        Student selectedStudent = tblStudents.getSelectionModel().getSelectedItem();
        txtId.setText(String.valueOf(selectedStudent.getId()));
        txtName.setText(selectedStudent.getName());
        txtSurname.setText(selectedStudent.getSurname());
        txtYear.setText(selectedStudent.getYear());
        txtCycle.setText(selectedStudent.getCycle());
    }

    @FXML
    void saveStudent() {
        Student tempStudent = null;
        if (tblStudents.getSelectionModel() != null) {
            studentSelectedIndex = tblStudents.getSelectionModel().getSelectedIndex();
            if (colId.getCellData(studentSelectedIndex) != null) {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getId() == colId.getCellData(studentSelectedIndex)) {
                        tempStudent = new Student(Integer.valueOf(txtId.getText()), txtName.getText(), txtSurname.getText(), txtYear.getText(), txtCycle.getText());
                        students.set(i, tempStudent);
                    }
                }
                tblStudents.refresh();
            } else {
                try {
                    if (txtId.getText().equals("") || txtName.getText().equals("") || txtSurname.getText().equals("") || txtYear.getText().equals("") || txtCycle.getText().equals("")) {
                        showError("Invalid attribute", "You have to populate all fields");
                    } else {
                        students.add(new Student(Integer.valueOf(txtId.getText()), txtName.getText(), txtSurname.getText(), txtYear.getText(), txtCycle.getText()));
                    }
                } catch (NumberFormatException e) {
                    showError("Invalid attribute", "You have to populate all fields");
                }
            }
        }
    }

    @FXML
    void getUser(MouseEvent event) {
        userSelectedIndex = tblUsers.getSelectionModel().getSelectedIndex();
        if (userSelectedIndex <= -1) return;

        User selectedUser = tblUsers.getSelectionModel().getSelectedItem();
        txtId.setText(selectedUser.getUsername());
        txtName.setText(selectedUser.getUsername());
    }

    @FXML
    void saveUser() {
        String newUsername = txtId.getText();
        String newPassword = txtName.getText();

        if (isDuplicateUsername(newUsername)) {
            showError("Duplicate Username", "User with this username already exists");
        } else {
            users.add(new User(newUsername, newPassword));
            tblUsers.refresh();
        }
    }

    private boolean isDuplicateUsername(String username) {
        return users.stream().anyMatch(user -> user.getUsername().equals(username));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeTable();
    }

    public void initializeTable() {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colSurname.setCellValueFactory(new PropertyValueFactory<>("surname"));
        colYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        colCycle.setCellValueFactory(new PropertyValueFactory<>("cycle"));
        tblStudents.setItems(students);

        colUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
        colPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        tblUsers.setItems(users);
    }

    private boolean isDuplicateStudentId(int studentId) {
        return students.stream().anyMatch(student -> student.getId() == studentId);
    }
}
