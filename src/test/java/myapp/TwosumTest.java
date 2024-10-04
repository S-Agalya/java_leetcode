package myapp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwosumTest {

    @Test
    public void Testtwosum() {
        Twosum sum = new Twosum();
        int[] expected = {1, 3};
        int[] arr = sum.twoSum(new int[]{1, 2, 4, 7, 3}, 9);
        assertArrayEquals(expected, arr);
    }
}

