package at.fhj.ms;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (a > b) {
            return a / b;
        } else {
            return b / a;
        }
    }
}
