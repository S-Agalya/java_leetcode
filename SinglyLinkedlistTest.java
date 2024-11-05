package myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedlistTest {

    @Test
    public void testAddNode() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.display(); 
        // Should print: 1 2 3
    }

    @Test
    public void testSearchElementFound() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        assertTrue(list.searchElement(2));
    }

    @Test
    public void testSearchElementNotFound() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        assertFalse(list.searchElement(3));
    }

    @Test
    public void testDeleteAtBeginning() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.deleteAtBeginning();
        list.display(); 
        // Should print: 2
    }

    @Test
    public void testDeleteAtEnd() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.deleteAtEnd();
        list.display(); 
        // Should print: 1
    }
}
