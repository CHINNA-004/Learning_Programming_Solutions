public class TestLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("Starting the application...");
        logger2.log("Application is running.");
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton verified).");
        } else {
            System.out.println("Different logger instances (Singleton failed).");
        }
    }
}