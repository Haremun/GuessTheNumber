package com.bieganski;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

@Test
public class TriesTest {

    public void testNumberOfTriesCalculation() {
        Range range = new Range(1, 100);
        Tries tries = new Tries(5);
        assertEquals(tries.calculateUserTries(range.getLength()), 5);
    }

}
