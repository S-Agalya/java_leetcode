package myapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
class Mergesortedlists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2 ){
       ListNode temp_node=new ListNode(0);
       ListNode current_node= temp_node;
       while(list1 != null && list2 != null){
        if(list1.val <= list2.val){
            current_node.next=list1;
            list1=list1.next;
        }else{
            current_node.next=list2;
            list2=list2.next;
        }
        current_node=current_node.next;
       }
       if(list1 != null){
        current_node.next=list1;
       }
       if(list2 != null){
        current_node.next=list2;
       }
       return temp_node.next;

    }
    
}