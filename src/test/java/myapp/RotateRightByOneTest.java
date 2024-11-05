package myapp;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
public class RotateRightByOneTest {
    @Test
    public void testRotateRight(){
    RotateRightByOne rotation=new RotateRightByOne();
    int[] input={1,2,3,4,5,6};
    int[] expected={6,1,2,3,4,5};
    assertArrayEquals(expected,rotation.RotateRightbyOne(input));
    }
}
