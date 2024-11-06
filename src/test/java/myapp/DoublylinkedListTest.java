package myapp;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DoublylinkedListTest {
     @Test
    public void testAddNode() {
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        String expectedOutput = "1 <-> 2 <-> 3";
        assertEquals(expectedOutput, dList.display());
    }
}
