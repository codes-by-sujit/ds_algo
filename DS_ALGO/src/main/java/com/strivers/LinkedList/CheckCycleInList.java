package com.strivers.LinkedList;

import com.strivers.util.ListNode;
import org.junit.jupiter.api.Test;

public class CheckCycleInList {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        if(head==null || head.next==null)
            return false;
        ListNode fast=slow.next;
        while(slow!=null && fast!=null){
            if(slow==fast)
                return true;
            slow=slow.next;
            fast=fast.next;
            if(fast!=null)
                fast=fast.next;
        }
        return false;
    }



    @Test
    public void tc1(){
        ListNode n = new ListNode(3);
        ListNode head=n;
        ListNode joint;
        n.next=new ListNode(2);
        n=n.next;
        joint=n;
        n.next=new ListNode(0);
        n=n.next;
        n.next=new ListNode(-4);
        n=n.next;
        n.next=joint;

        ListNode temp=head;
        int count=0;

        while(temp!=null){
            if(count==15)
                break;
            System.out.print(" "+temp.val);
            temp=temp.next;
            count++;
        }
        System.out.println(this.hasCycle(head));
    }


//  class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) {
//          val = x;
//          next = null;
//      }
 //}


}
