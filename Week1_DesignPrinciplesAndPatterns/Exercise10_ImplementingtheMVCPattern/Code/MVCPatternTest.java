package Exercise10_ImplementingtheMVCPattern.Code;

public class MVCPatternTest {
    public static void main(String[] args) {
        Student student = new Student("Alice", "100", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Alice Johnson");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}

