package com.nomChoisi.calculator.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        calculator calculator = new calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result, "Addition test failed");
    }

    @Test
    public void testDivide() {
        calculator calculator = new calculator();
        int result = calculator.divide(10, 2);
        assertEquals(5, result, "Division test failed");
    }

    @Test
    public void testDivideByZero() {
        calculator calculator = new calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
