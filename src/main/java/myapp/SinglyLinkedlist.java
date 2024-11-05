// package myapp;

// public class SinglyLinkedlist {

//     private Node head;
//     private Node tail;

//     private class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void addNode(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//         } else {
//             tail.next = newNode;
//             tail = newNode;
//         }
//     }

//     public void display() {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println();
//     }

//     public boolean searchElement(int data) {
//         Node current = head;
//         while (current != null) {
//             if (current.data == data) {
//                 return true;
//             }
//             current = current.next;
//         }
//         return false;
//     }

//     public void deleteAtBeginning() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         head = head.next;
//         if (head == null) {
//             tail = null;
//         }
//     }

//     public void deleteAtEnd() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         if (head == tail) {
//             head = null;
//             tail = null;
//             return;
//         }
//         Node current = head;
//         while (current.next != tail) {
//             current = current.next;
//         }
//         current.next = null;
//         tail = current;
//     }
// }

package myapp;

class SinglyLinkedlist {

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    //adding elements
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    String appendWithArrow(String result, Node current) {
        if (null == result || result.isEmpty()) return current.data + "";
        else return result + " -> " + current.data;
    }

    //display elements

    public String display() {
        String result = "";
        Node current = head;
        if (head == null) {
            System.out.println("Nothing to display as list is empty");
            return result;
        }
        System.out.println("Singly list elements");
        while (current != null) {
            System.out.print(current.data);
            result = appendWithArrow(result, current);
            current = current.next;
        }
        System.out.println();
        return result;
    }

    //insertAtBeginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //insertAtEnd
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    //deleteAtBeginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("Nothing is to delete as list is empty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    //deleteAtEnd
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("list is empty nothing to delete");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    //Searchelement
    public void Searchelement(int data) {
        Node current = head;
        int position = 1; // starting position
        while (current != null) {
            if (current.data == data) {
                System.out.println(
                    "element " + data + "found at position " + position
                );
                return;
            }
            current = current.next;
            position++;
        }
        System.out.println("Number not found");
    }

    public static void main(String[] args) {
        SinglyLinkedlist sList = new SinglyLinkedlist();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);
        sList.display();

        sList.insertAtBeginning(0);
        sList.display();

        sList.insertAtEnd(7);
        sList.display();

        sList.deleteAtBeginning();
        sList.display();

        sList.deleteAtEnd();
        sList.display();

        sList.Searchelement(6);
        sList.display();
    }
}
