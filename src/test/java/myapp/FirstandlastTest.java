package myapp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FirstandlastTest {
    @Test
    public void testFirstandLast(){
        Firstandlast first_last= new Firstandlast();
        int[] digits={1,2,3,3,4};
        int target=3;
        int[] expected={2,3};
        Assertions.assertArrayEquals(expected, first_last.searchRange(digits, target) );
    }
}
