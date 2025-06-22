package Exercise4_EmployeeManagementSystem.Code;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee("1", "Alice", "Manager", 75000));
        manager.addEmployee(new Employee("2", "Bob", "Developer", 55000));
        manager.addEmployee(new Employee("3", "Charlie", "Designer", 50000));

        manager.displayEmployees();

        Employee found = manager.searchEmployee("2");
        System.out.println(found != null ? "Found: " + found : "Employee not found.");

        manager.deleteEmployee("2");
        manager.displayEmployees();

        manager.deleteEmployee("9");
    }
}
