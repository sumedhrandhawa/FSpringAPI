package com.learn.fspringapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RandomTest {
    @Test
    void testIsOnePlusOneIsTwo() {
        int i = 1 + 1; // Arrange + Act

        // Assert -> Check against the expected value;
        assert i == 2;

//        assert 2 == 3;

        assertEquals(7, i, "1 + 1 should be equal to 2");

//        assertTimeout();

    }
}
