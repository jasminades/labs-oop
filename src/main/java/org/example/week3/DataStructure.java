package org.example.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", Status.TO_DO),
                new TaskItem(2, "Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", Status.COMPLETED));
    }

    public List<TaskItem> getAllTasks() {
        return tasks;
    }

    public List<TaskItem> getByStatus(Status status) {
        List<TaskItem> filteredTasks = new ArrayList<>();
        for (TaskItem task : tasks) {
            if (task.getTaskStatus() == status) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    public List<TaskItem> getTasksByIdGreaterOrEqual(int id) {
        List<TaskItem> filteredTasks = new ArrayList<>();
        for (TaskItem task : tasks) {
            if (task.getTaskId() >= id) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    public void printTaskDescriptions() {
        tasks.forEach(task -> System.out.println(task.getTaskDescription()));
    }
}
