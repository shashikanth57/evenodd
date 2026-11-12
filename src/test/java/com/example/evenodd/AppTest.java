package com.example.evenodd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testEvenNumber() {
        assertEquals("Even", App.checkNumber(10));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", App.checkNumber(7));
    }

    @Test
    public void testZeroIsEven() {
        assertEquals("Even", App.checkNumber(0));
    }
}