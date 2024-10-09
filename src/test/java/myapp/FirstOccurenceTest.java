package myapp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FirstOccurenceTest {
    @Test
    public void testFirstOccurence(){
       FirstOccurence word=new FirstOccurence();
       String s="hiwelcome";
       String n="hiw";
       int expected=0;
       Assertions.assertEquals(expected, word.strStr(s, n));
    }
}
