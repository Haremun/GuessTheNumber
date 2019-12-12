package com.bieganski;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

@Test
public class BaseNumberTest {

    public void testEquality() {
        BaseNumber first = new BaseNumber(44);
        BaseNumber second = new BaseNumber(44);
        assertTrue(first.equals(second));
    }

    public void testComparison() {
        BaseNumber first = new BaseNumber(1);
        BaseNumber second = new BaseNumber(1);
        BaseNumber third = new BaseNumber(3);
        assertEquals(first.compareTo(second), 0);
        assertEquals(first.compareTo(third), -1);
        assertEquals(third.compareTo(first), 1);
    }

}
