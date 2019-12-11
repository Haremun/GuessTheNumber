package com.bieganski;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class RangeTest {

    public void testUserInsertOutOfRangeValue() {
        Range range = new Range(0, 100);
        UserNumber userNumber = new UserNumber(150);
        Assert.assertFalse(range.isInRange(userNumber));
    }
    public void testUserInsertValueInRange() {
        Range range = new Range(0, 100);
        UserNumber userNumber = new UserNumber(80);
        Assert.assertTrue(range.isInRange(userNumber));
    }
}
