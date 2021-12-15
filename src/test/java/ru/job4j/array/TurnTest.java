package ru.job4j.array;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};

        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {5, 3, 7, 9, 1};
        int[] result = Turn.back(input);
        int[] expected = new int[] {1, 9, 7, 3, 5};
        Assert.assertArrayEquals(expected, result);
    }
}