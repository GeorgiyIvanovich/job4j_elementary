package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CheckPrimeNumberTest {
    @Test
    public void when9() {
        int number = 9;
        
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }
}