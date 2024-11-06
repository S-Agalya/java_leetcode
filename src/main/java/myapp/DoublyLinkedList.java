package myapp;

public class DoublyLinkedList {
 class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    }
    
    public Node head=null;
    public Node tail=null;

    public void addNode(int data){
        Node newnode=new Node(data);
        if(head == null){
          head=newnode;
          tail=newnode;
        }else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }

   public String appendArrow(String result,Node current){
    if(result == null || result.isEmpty()){
        return current.data +"";
    }else{
        return result+ " <-> " +current.data;
    }
    }

    public String display(){
        String result="";
        Node current=head;
        if(head == null){
            System.out.println("Nothing to display");
            
        }
        System.out.println("doubly linked list elements");
        while(current != null){
            System.out.println(current.data+"");
            result=appendArrow(result, current);
            current=current.next;
           
        }
        System.out.println();
        return result;
        
    }
    public void insertAtBeginning(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }

    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("Nothing to delete");
            return;
        }
        head=head.next;
        if(head==null){
            tail=null;
        }else{
            head.prev=null;
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
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }

    public void searchElement(int data){
        Node current=head;
        int position=1;

        while(current != null){
            if(current.data == data){
                System.out.println("element"+data+"found at"+position);
                return;
            }
            current=current.next;
            position++;
        }
        System.out.println("element not found");

    }

    public static void main(String[] args){
        DoublyLinkedList dList=new DoublyLinkedList();
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.display();
        dList.insertAtBeginning(0);
        dList.display();

        dList.insertAtEnd(5);
        dList.display();

        dList.deleteAtBeginning();
        dList.display();

        dList.deleteAtEnd();
        dList.display();

        dList.searchElement(3);
    }
}
