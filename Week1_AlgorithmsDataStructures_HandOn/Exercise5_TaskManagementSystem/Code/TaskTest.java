package Exercise5_TaskManagementSystem.Code;

public class TaskTest {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("T1", "Design UI", "Pending"));
        manager.addTask(new Task("T2", "Develop Backend", "In Progress"));
        manager.addTask(new Task("T3", "Testing", "Not Started"));

        manager.displayTasks();

        Task found = manager.searchTask("T2");
        System.out.println(found != null ? "Found: " + found : "Task not found.");

        manager.deleteTask("T2");
        manager.displayTasks();

        manager.deleteTask("T9");
    }
}

