package myapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {

    @Test // Add this annotation
    public void testRemoveElement() {
        RemoveElement removedElement = new RemoveElement();
        int[] expected = {1, 2, 3, 4}; 
        int[] array = {1, 2, 3, 4, 5}; 
        int val = 5; 
        //int newLength = removedElement.removeElement(array, val);
        
        Assertions.assertEquals(expected.length, removedElement.removeElement(array, val));
    } 
}
