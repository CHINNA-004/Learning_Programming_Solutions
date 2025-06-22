import java.util.Scanner;

public class ForecastDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial value: ");
        double initialValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (as decimal, e.g., 0.05 for 5%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double resultRecursive = ForecastUtil.calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("Future Value (Recursive): %.2f\n", resultRecursive);

        double resultOptimized = ForecastUtil.calculateFutureValueOptimized(initialValue, growthRate, years);
        System.out.printf("Future Value (Optimized): %.2f\n", resultOptimized);

        scanner.close();
    }
}
