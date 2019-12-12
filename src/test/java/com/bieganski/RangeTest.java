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
    public void testMinIsBiggerThanMax(){
        Range range = new Range(80, 20);
        Assert.assertEquals(range.toString(), "minValue=20, maxValue=80");
    }

    public void testRangeLength() {
        Range range1 = new Range(1, 100);
        Range range2 = new Range(-50, -1);
        Assert.assertEquals(range1.getLength(), 100);
        Assert.assertEquals(range2.getLength(), 50);
    }

    public void testRandomNumberInRange() {
        Range range = new Range(0, 100);
        RandomNumber number = range.getRandomNumber();
        Assert.assertTrue(range.isInRange(number));
    }

}
