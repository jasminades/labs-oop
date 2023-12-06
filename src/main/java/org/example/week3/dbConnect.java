package org.example.week3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
    private static final String USERNAME = "your_mysql_username";
    private static final String PASSWORD = "your_mysql_password";

    private Connection connection = null;

    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<TaskItem> getAllTasks() {
        List<TaskItem> tasks = new ArrayList<>();
        String query = "SELECT * FROM tasks";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int taskId = resultSet.getInt("id");
                String taskDescription = resultSet.getString("task_description");
                String taskStatusStr = resultSet.getString("task_status");
                Status taskStatus = Status.valueOf(taskStatusStr);

                tasks.add(new TaskItem(taskId, taskDescription, taskStatus));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return tasks;
    }

    public TaskItem getTaskById(int taskId) {
        String query = "SELECT * FROM tasks WHERE id = ?";
        TaskItem task = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, taskId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String taskDescription = resultSet.getString("task_description");
                String taskStatusStr = resultSet.getString("task_status");
                Status taskStatus = Status.valueOf(taskStatusStr);

                task = new TaskItem(taskId, taskDescription, taskStatus);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return task;
    }
}
