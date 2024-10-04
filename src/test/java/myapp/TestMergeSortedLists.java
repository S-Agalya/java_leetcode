package myapp;

public class TestMergeSortedLists {
    public static void main(String[] args) {
        // Creating first sorted list: list1 = 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Creating second sorted list: list2 = 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Creating an instance of Mergesortedlists class
        Mergesortedlists merger = new Mergesortedlists();

        // Merging the two sorted lists
        ListNode mergedList = merger.mergeTwoLists(list1, list2);

        // Printing the merged list
        printList(mergedList);
    }

    // Helper method to print the list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
