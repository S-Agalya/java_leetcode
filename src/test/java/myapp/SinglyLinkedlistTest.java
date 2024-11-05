package myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SinglyLinkedlistTest {

    @Test
    public void testAddNode() {
        SinglyLinkedlist sList = new SinglyLinkedlist();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        String expectedOutput = "1 -> 2 -> 3";
        assertEquals(expectedOutput, sList.display());
    }

    @Test
    public void testInsertAtBeginning() {
        SinglyLinkedlist sList = new SinglyLinkedlist();
        sList.addNode(1);
        sList.insertAtBeginning(0);
        String expectedOutput = "0 -> 1";
        assertEquals(expectedOutput, sList.display());
    }

    @Test
    public void testInsertAtEnd() {
        SinglyLinkedlist sList = new SinglyLinkedlist();
        sList.addNode(1);
        sList.insertAtEnd(2);
        String expectedOutput = "1 -> 2";
        assertEquals(expectedOutput, sList.display());
    }

    @Test
    public void testDeleteAtBeginning() {
        SinglyLinkedlist sList = new SinglyLinkedlist();
        sList.addNode(1);
        sList.addNode(2);
        sList.deleteAtBeginning();
        String expectedOutput = "2";
        assertEquals(expectedOutput, sList.display());
    }

    @Test
    public void testDeleteAtEnd() {
        SinglyLinkedlist sList = new SinglyLinkedlist();
        sList.addNode(1);
        sList.addNode(2);
        sList.deleteAtEnd();
        String expectedOutput = "1";
        assertEquals(expectedOutput, sList.display());
    }

    
}
