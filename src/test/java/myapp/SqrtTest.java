package myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SqrtTest {

    @Test
    public void testSqrt() {
        Sqrt number = new Sqrt();
        assertEquals(2, number.mySqrt(4));
    }
}


