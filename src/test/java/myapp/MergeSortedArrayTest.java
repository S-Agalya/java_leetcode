package myapp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MergeSortedArrayTest {
    @Test
    public void testMergeSortedArray(){
      MergeSortedArray mergeSort=new MergeSortedArray();
      int[] nums1={1,3,0,0};
      int[] nums2={2,4};
      int m=2;
      int n=2;
      int[] expected={1,2,3,4};

      Assertions.assertArrayEquals(expected, mergeSort.mergeSortedArray(nums1, m, nums2, n));
    }
}
