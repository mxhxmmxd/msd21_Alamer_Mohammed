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

    public static int faculty (int a) {
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result = i * result;

        }
        return 0;
    }
}
