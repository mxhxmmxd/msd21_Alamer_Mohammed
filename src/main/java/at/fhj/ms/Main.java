package at.fhj.ms;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    // Creating a logger
    private static Logger logger = LogManager.getLogger();


    public static void main(String[] args) {
        System.out.println(Calculator.add(32, 14));
        System.out.println(Calculator.multiply(32, 14));
        System.out.println(Calculator.minus(32, 14));
        System.out.println(Calculator.divide(32, 14));
        System.out.println(Calculator.faculty(5));


        logger.info("It is a info logger.");
        System.out.println();
        logger.error("It is an error logger.");

    }
}
