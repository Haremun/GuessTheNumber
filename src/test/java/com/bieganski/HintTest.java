package com.bieganski;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class HintTest {

    public void testUserInsertLowerValue() {
        UserNumber userNumber = new UserNumber(50);
        RandomNumber randomNumber = new RandomNumber(userNumber.getValue() + 1);
        Hint hint = Hint.get(userNumber.compareTo(randomNumber));
        Assert.assertEquals(Hint.TOO_LOW, hint);
    }

    public void testUserInsertHigherValue() {
        UserNumber userNumber = new UserNumber(50);
        RandomNumber randomNumber = new RandomNumber(userNumber.getValue() - 1);
        Hint hint = Hint.get(userNumber.compareTo(randomNumber));
        Assert.assertEquals(Hint.TOO_HIGH, hint);
    }

    public void testUserInsertCorrectValue() {
        UserNumber userNumber = new UserNumber(50);
        RandomNumber randomNumber = new RandomNumber(userNumber.getValue());
        Hint hint = Hint.get(userNumber.compareTo(randomNumber));
        Assert.assertEquals(Hint.CORRECT, hint);
    }

}
