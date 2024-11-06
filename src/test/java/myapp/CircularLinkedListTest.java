package myapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircularLinkedListTest {
   

    @Test
    void testAddNode() {
        CircularLinkedList cList=new CircularLinkedList();
        cList.addNode(1);
        cList.addNode(2);
        cList.addNode(3);
        String result = cList.display();
        assertEquals("1 -> 2 -> 3", result, "Nodes should be added in sequence");
    }

    @Test
    void testInsertAtBeginning() {
        CircularLinkedList cList=new CircularLinkedList();
        cList.addNode(1);
        cList.addNode(2);
        cList.insertAtBeginning(0);
        String result = cList.display();
        assertEquals("0 -> 1 -> 2", result, "Node should be inserted at the beginning");
    }

    @Test
    void testInsertAtEnd() {
        CircularLinkedList cList=new CircularLinkedList();
        cList.addNode(1);
        cList.addNode(2);
        cList.insertAtEnd(3);
        String result = cList.display();
        assertEquals("1 -> 2 -> 3", result, "Node should be inserted at the end");
    }

    @Test
    void testDeleteAtBeginning() {
        CircularLinkedList cList=new CircularLinkedList();
        cList.addNode(1);
        cList.addNode(2);
        cList.addNode(3);
        cList.deleteAtBeginning();
        String result = cList.display();
        assertEquals("2 -> 3", result, "First node should be deleted");
    }

    @Test
    void testDeleteAtEnd() {
        CircularLinkedList cList=new CircularLinkedList();
        cList.addNode(1);
        cList.addNode(2);
        cList.addNode(3);
        cList.deleteAtEnd();
        String result = cList.display();
        assertEquals("1 -> 2", result, "Last node should be deleted");
    }

}
