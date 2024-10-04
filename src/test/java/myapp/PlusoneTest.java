package myapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlusoneTest{

    @Test
    public void testPlusOne(){
        Plusone plusOne = new Plusone();
        int[] digits1={1,2,3};
        int[] expected1={1,2,4};
        Assertions.assertArrayEquals(expected1 , plusOne.plusOne(digits1));


    }
}