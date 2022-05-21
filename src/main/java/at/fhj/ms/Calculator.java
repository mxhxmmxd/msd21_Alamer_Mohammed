package at.fhj.ms;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    public static double add(double a, double b) {
        logger.debug(a + " + " + b);
        return a + b;
    }

    public static double minus(double a, double b) {
        logger.debug(a + " - " + b);
        return a - b;
    }

    public static double multiply(double a, double b) {
        logger.debug(a + " * " + b);
        return a * b;
    }

    public static double divide (double a, double b) throws ArithmeticException {
        logger.debug(a + " / " + b);
        if (a > b) {
            if (b == 0) {
                logger.error("Zero division");
                throw new ArithmeticException();
            }
            return a / b;

        } else {
            if (a == 0) {
                logger.error("Zero division");
                throw new ArithmeticException();

            }
            return b / a;
        }
    }

    public static int faculty (int a) {
        logger.debug(a);
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result = i * result;

        }
        return result;
    }
}
