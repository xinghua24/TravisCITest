package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

    @Test
    public void testFabonacci() {
        assertEquals(1, new App().fibonacci(2));
        assertEquals(2, new App().fibonacci(3));
        assertEquals(3, new App().fibonacci(4));
        assertEquals(5, new App().fibonacci(5));
    }

}
