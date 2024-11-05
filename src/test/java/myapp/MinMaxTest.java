package myapp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MinMaxTest {
    
     @Test
    public void testRes() {
        MinMax minMax = new MinMax();

        // Test case 1
        int[] arr1 = {3, 2, 6, 5, 7, 1};
        int[] result1 = minMax.res(arr1);
        assertArrayEquals(new int[]{1, 7}, result1);
    }
    @Test
    public void testBubbleSort() {
        MinMax minMax = new MinMax();

        int[] arr = {3, 2, 6, 5, 7, 1};
        minMax.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 5, 6, 7}, arr);
    }
}
