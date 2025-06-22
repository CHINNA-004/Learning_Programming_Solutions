package Exercise5_TaskManagementSystem.Code;

public class TaskManager {
    private Task head;

    public void addTask(Task task) {
        if (head == null) {
            head = task;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = task;
        }
        System.out.println("Task added: " + task);
    }

    public Task searchTask(String taskId) {
        Task current = head;
        while (current != null) {
            if (current.taskId.equals(taskId)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Task List:");
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
        System.out.println(" ");
    }

    public void deleteTask(String taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.taskId.equals(taskId)) {
            head = head.next;
            System.out.println("Task with ID " + taskId + " deleted.");
            return;
        }

        Task current = head;
        while (current.next != null && !current.next.taskId.equals(taskId)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Task with ID " + taskId + " deleted.");
        } else {
            System.out.println("Task with ID " + taskId + " not found.");
        }
    }
}
