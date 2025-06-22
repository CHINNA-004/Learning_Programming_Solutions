public class ForecastUtil {

    public static double calculateFutureValue(double value, double growthRate, int years) {
        if (years == 0) {
            return value; 
        }
        return calculateFutureValue(value * (1 + growthRate), growthRate, years - 1);
    }

    public static double calculateFutureValueOptimized(double value, double growthRate, int years) {
        return value * Math.pow(1 + growthRate, years);
    }
}
