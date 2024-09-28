package myapp;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PlusoneTest {

    @Test
    public void testPlusOne() {
        Plusone plusOne = new Plusone();
        int[] digits1 = {1, 2, 3};
        int[] expected1 = {1, 2, 4};
        assertArrayEquals(expected1, plusOne.plusOne(digits1));
    }
}

