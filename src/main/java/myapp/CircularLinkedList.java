package myapp;

public class CircularLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
          this.data=data;
          this.next=null;
        }
       
    }
    public Node head=null;
    public Node tail=null;

    public void addNode(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            tail.next=head;
        }else{
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
        }

    }

    public String appendArrow(String result,Node current){
        if(result == null || result.isEmpty()){
            return current.data+"";
        }else{
            return result + " -> " +current.data;
        }
    }

    public String display(){
        String result="";
        Node current=head;
        if(head==null){
            System.out.println("nothing to display");
            return result;
        }
        System.out.println("Circular linked list");
        do {
            System.out.print(current.data + " ");
            result = appendArrow(result, current);
            current = current.next;
        } while (current != head);  // Stop once we cycle back to head
        System.out.println();
        
        return result;
    }

    public void insertAtBeginning(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            tail.next=head;
        }else{
            newnode.next=head;
            head=newnode;
            tail.next=head;
        }
    }

    public void insertAtEnd(int data){
        Node newnode=new Node(data);
        if(head == null){
            head=newnode;
            tail=newnode;
            tail.next=head;
        }else{
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
        }
    }

    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("Nothing to delete");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
        tail.next=head;
        }
       
    }
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("Nothing to delete");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }else{
            Node current=head;
            while(current.next != tail){
                current=current.next;
            }
            current.next=head;
            tail=current;
        }
       
    }
    public void SearchElement(int data) {
        Node current = head;
        int position = 1; 
        if(head==null){
            System.out.println("Element not found ");
            return;
        }
        do {
            if (current.data == data) {
                System.out.println("Element " + data + " found at position " + position);
                return;
            }
            current = current.next;
            position++;
        } while (current != head);
        System.out.println("Number not found");
    }

    public static void main(String[] args){
        CircularLinkedList cList=new CircularLinkedList();
        cList.addNode(1);
        cList.addNode(2);
        cList.addNode(3);
        cList.addNode(4);
        cList.display();
        cList.insertAtBeginning(0);
        cList.display();

        cList.insertAtEnd(5);
        cList.display();

        cList.deleteAtBeginning();
        cList.display();

        cList.deleteAtEnd();
        cList.display();

        cList.SearchElement(3);
    }
}
