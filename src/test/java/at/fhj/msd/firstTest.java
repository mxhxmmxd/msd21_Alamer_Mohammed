package at.fhj.msd;

import at.fhj.ms.Calculator;
import org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class firstTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void addTest() {
        Assertions.assertEquals(8, calculator.add(3, 5.));
    }

    @Test
    public void addTest1() {
        double result = 5 + 3;
        Assertions.assertEquals(result, calculator.add(5, 3));

    }

    @Test
    public void minusTest(){
        Assertions.assertEquals(2, calculator.minus(5,3));
    }

    @Test
    public void minusTest1(){
        double result = 5-3;
        Assertions.assertEquals(result, calculator.minus(5,3));
    }

    @Test
    public void multiplyTest(){
        Assertions.assertEquals(15, calculator.multiply(5,3));
    }

    @Test
    public void multiplyTest1(){
        double result = 5*3;
        Assertions.assertEquals(result, calculator.multiply(5,3));
    }


    @Test
    public void divideTest(){
        Assertions.assertEquals(2, calculator.divide(10,5));
    }

    @Test
    public void divideTest1(){
        double result = 10/5;
        Assertions.assertEquals(result, calculator.divide(10,5));
    }

    @Test
    public void facultyTest(){
        double result = 120;
        Assertions.assertEquals(result, calculator.faculty(5));
    }

}
