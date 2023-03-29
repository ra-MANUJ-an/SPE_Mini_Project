import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();


    @Test
    public void squarerootTruePositive(){
        assertEquals("sqaure-True Positive", 2, calculator.squareroot(4), DELTA);
        assertEquals("sqaure-True Positive", 1, calculator.squareroot(1), DELTA);
    }

    @Test
    public void squarerootFalsePositive(){
        assertNotEquals("square-False Positive", 10, calculator.squareroot(4), DELTA);
        assertNotEquals("square-False Positive", 20, calculator.squareroot(5), DELTA);

    }

    @Test
    public void factorialTruePositive(){
        assertEquals("factorial -True Positive", 6, calculator.factorial(3), DELTA);
        assertEquals("factorial -True Positive", 2, calculator.factorial(2), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("factorial -False Positive", 20, calculator.factorial(5), DELTA);
        assertNotEquals("factorial -False Positive", 70, calculator.factorial(2), DELTA);
    }

    @Test
    public void lnxTruePositive(){
        assertEquals("lnx of number-True Positive", 0, calculator.lnx(1), DELTA);
        assertEquals("lnx of number-True Positive", 0, calculator.lnx(1), DELTA);
    }

    @Test
    public void lnxFalsePositive(){
        assertNotEquals("lnx  number-False Positive", 2, calculator.lnx(5), DELTA);
        assertNotEquals("lnx number-False Positive", -1, calculator.lnx(3), DELTA);
    }


    @Test
    public void powerTruePositive(){
        assertEquals("power-True Positive", 8, calculator.power(2,3), DELTA);
        assertEquals("power-True Positive", 16, calculator.power(2,4), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("power-False Positive", 12, calculator.power(2,6), DELTA);
        assertNotEquals("power-False Positive", 3, calculator.power(3,4), DELTA);

    }






}
