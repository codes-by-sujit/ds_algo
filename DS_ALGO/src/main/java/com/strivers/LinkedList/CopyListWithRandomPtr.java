package com.strivers.LinkedList;

import com.strivers.util.Node;
import org.junit.jupiter.api.Test;

public class CopyListWithRandomPtr {
    public Node copyRandomList(Node head) {
        Node n=head;
        Node ans=null;
        //Insert the temp node in between
        insertTempInBetween(n);
        System.out.println("After Inserting temp:-");
        this.print(n);
        //copy the pointer
        copyRandomPointer(n);
        System.out.println("After Copy:-");
        this.print(n);
        //reset back the original array
        ans=reset(head);
        System.out.println("After reset");
        this.print(head);
        this.print(ans);
        return ans;
    }

    private void insertTempInBetween(Node head){
        Node n=head;
        while(n!=null){
            Node nextElement=n.next;
            Node temp = new Node(n.val);
            temp.next=nextElement;
            n.next=temp;
            n=nextElement;
        }
    }

    private void copyRandomPointer(Node head){
        Node n=head;
        while(n!=null){
            Node temp=n.next;
            temp.random=n.random==null? null:n.random.next;
            n=temp.next;
        }
    }

    private Node reset(Node head){
        Node n=head;
        Node res=null;
        while(n!=null){
            Node temp = n.next;
            Node nextElement = temp.next;
            n.next=temp.next;
            if(nextElement!=null)
                temp.next=nextElement.next;
            n=nextElement;
            if(res==null)
                res=temp;
        }
        return res;
    }


    private void print(Node head){
        Node n = head;
        System.out.println("");
        while (n != null) {
            int random = n.random==null?-1:n.random.val;
            int next=n.next==null?-1:n.next.val;
            System.out.print("["+n.val+"|"+next+"|"+random+"]");
            n=n.next;
        }
        System.out.println("");
    }

    @Test
    public void tc1(){
        Node n= new Node(7);
        Node head=n;
        n.next=new Node(13);
        n.next.next=new Node(11);
        n.next.next.next=new Node(10);
        n.next.next.next.next=new Node(1);

        n.random=null;
        n.next.random=n;
        n.next.next.random=n.next.next.next.next;
        n.next.next.next.random=n.next.next;
        n.next.next.next.next.random=n;
        System.out.println("Original Link List");
        this.print(head);
        this.copyRandomList(head);
    }
}
