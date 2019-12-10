package com.bieganski;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class AppTest {

    @Parameters({"minValue", "maxValue"})
    public void testRandomNumberInRange(int minValue, int maxValue) {
        Range range = new Range(minValue, maxValue);
        RandomNumber number = range.getRandomNumber();
        Assert.assertTrue(number.getValue() <= 100 && number.getValue() > 0);
    }

    public void testUserInsertLowerValue() {
        UI Ui = new UI();
        UserNumber userNumber = Ui.getUserInput();
        RandomNumber randomNumber = new RandomNumber(userNumber.getValue() + 1);
        Hint hint = Hint.get(userNumber.compareTo(randomNumber));
        Assert.assertEquals(Hint.TOO_LOW, hint);
    }

    public void testUserInsertHigherValue() {
        UI Ui = new UI();
        UserNumber userNumber = Ui.getUserInput();
        RandomNumber randomNumber = new RandomNumber(userNumber.getValue() - 1);
        Hint hint = Hint.get(userNumber.compareTo(randomNumber));
        Assert.assertEquals(Hint.TOO_HIGH, hint);
    }

    public void testUserInsertCorrectValue() {
        UI Ui = new UI();
        UserNumber userNumber = Ui.getUserInput();
        RandomNumber randomNumber = new RandomNumber(userNumber.getValue());
        Hint hint = Hint.get(userNumber.compareTo(randomNumber));
        Assert.assertEquals(Hint.CORRECT, hint);
    }
}
