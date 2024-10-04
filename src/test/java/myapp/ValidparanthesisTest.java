package myapp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ValidparanthesisTest {
    @Test
    public void testValidparanthesis(){
        Validparanthesis validity=new Validparanthesis();
       String intput="{}";
        
        Assertions.assertTrue(validity.isValid(intput));
        

    }
}
