package com.telusko.JunitDemo.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitDemoTest {



    @BeforeEach
    void setUp() {
        System.out.println(" setUp() method ");
    }

    @Test
    void m1() {
        System.out.println("m1() method");
    }

    @Test
    void m2() {
        System.out.println("m2() method");
    }
    @AfterEach
    void tearDown() {
        System.out.println(" tearDown() method ");
    }

}