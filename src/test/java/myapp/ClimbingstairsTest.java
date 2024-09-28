package myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClimbingstairsTest {

    @Test
    public void testClimbstairs() {
        assertEquals(8, Climbingstairs.climbStairs(5)); 
        assertEquals(13, Climbingstairs.climbStairs(6)); 
    }
}
