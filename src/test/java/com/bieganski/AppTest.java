package com.bieganski;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class AppTest 
{
    @Parameters({"minValue", "maxValue"})
    public void testRandomNumberInRange(int minValue, int maxValue){
        Range range = new Range(minValue, maxValue);
        RandomNumber number = range.getRandomNumber();
        Assert.assertTrue(number.getValue() <= 100 && number.getValue() > 0);
    }
}
