public class Main {
    public static void main(String[] args) {

        DbConnect dbConnect = new DbConnect();

        // Fetch all tasks from the database
        List<TaskItem> tasksFromDb = dbConnect.getAllTasksFromDb();
        System.out.println("All Tasks from Database:");
        tasksFromDb.forEach(task -> System.out.println(task.getTaskDescription()));


        int taskIdToFetch = 2;
        TaskItem taskFromDb = dbConnect.getTaskByIdFromDb(taskIdToFetch);
        System.out.println("\nTask with ID " + taskIdToFetch + " from Database:");
        if (taskFromDb != null) {
            System.out.println(taskFromDb.getTaskDescription());
        } else {
            System.out.println("Task not found");
        }
    }
}
