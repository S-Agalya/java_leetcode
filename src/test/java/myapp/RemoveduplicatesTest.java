package myapp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveduplicatesTest {
    @Test
    public void testRemoveDuplicates(){
        Removeduplicates remove_dup= new Removeduplicates();
        int[] digits={1,2,2,3};
        int[] expected={1,2,3};
        Assertions.assertEquals(expected.length, remove_dup.removeDuplicates(digits));
    }
}
