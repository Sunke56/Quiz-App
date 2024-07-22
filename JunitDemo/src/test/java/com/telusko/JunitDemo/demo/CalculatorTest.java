package com.telusko.JunitDemo.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
         calculator =new Calculator();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void add_Positive_Number_Scenario() {

        int res = calculator.add(10,20);
        assertEquals(30,res);
    }


    @Test
    void add_Negative_Number_Scenario() {

        int res = calculator.add(-10,-20);
        assertEquals(-10,res);
    }


    @Test
    void add_Positive_Negative_Number_Scenario() {

        int res = calculator.add(-10,20);
        assertEquals(10,res);
    }

    @Test
    void sub_Positive_Number_Scenario() {

        int res = calculator.sub(10,20);
        assertEquals(20,res);
    }


    @Test
    void sub_Negative_Number_Scenario() {

        int res = calculator.sub(-10,-20);
        assertEquals(10,res);
    }

    @Test
    void sub_Positive_Negative_Number_Scenario() {

        int res = calculator.sub(30,-20);
        assertEquals(50,res);
    }

    @Test
    void mul_Positive_Number_Scenario() {

        int res = calculator.mul(10,20);
        assertEquals(200,res);
    }


    @Test
    void mul_Negative_Number_Scenario() {

        int res = calculator.mul(-10,-20);
        assertEquals(200,res);
    }

    @Test
    void mul_Positive_Negative_Number_Scenario() {

        int res = calculator.mul(30,-20);
        assertEquals(-600,res);
    }


}