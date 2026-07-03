package com.cognizant.exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculatorAAATest {

    private CalculatorAAA calculator;

    @BeforeEach
    void setUp() {
        System.out.println("Creating Calculator Object...");
        calculator = new CalculatorAAA();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test Completed.");
    }

    @Test
    void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    void testSubtraction() {

        // Arrange
        int a = 30;
        int b = 10;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(20, result);
    }
}