package org.example.week3;

public enum Status {
    TO_DO, IN_PROGRESS, COMPLETED, CANCELLED
}

public class TaskItem {
    private int taskId;
    private String taskDescription;
    private Status taskStatus;

    public TaskItem(int taskId, String taskDescription, Status taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    // Add getter methods and any other necessary methods
}
