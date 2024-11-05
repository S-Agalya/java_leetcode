package myapp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ArrayRotationTest {
    @Test
    public void testArrayRotation(){
    ArrayRoation Roation=new ArrayRoation();
    int[] arr={1,2,3,4,5,6};
    int k=2;
    int[] expected={5,6,1,2,3,4};

    assertArrayEquals(expected,Roation.arrayRotation(arr, k));
    }
}
