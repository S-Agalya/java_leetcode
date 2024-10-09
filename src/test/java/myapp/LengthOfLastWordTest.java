package myapp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LengthOfLastWordTest {
    @Test
    public void testLengthOfLastWord(){
        LengthOfLastWord wordlength=new LengthOfLastWord();
        String s="Hello world";
        int expected=5;
        Assertions.assertEquals(expected, wordlength.lengthOfLastWord(s));
    }
}
