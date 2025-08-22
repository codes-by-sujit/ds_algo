package com.strivers.LinkedList;

import com.strivers.util.LinkListUtil;
import com.strivers.util.ListNode;
import org.junit.jupiter.api.Test;

public class ReverseLinkedList {
    private ListNode reverse(ListNode node){
        ListNode head=null;
        ListNode curr=node;
        while(curr!=null){
            ListNode nxt=curr.next;
            curr.next=head;
            head=curr;
            curr=nxt;
        }
        return head;
    }

    @Test
    public void tc1(){
        int[] arr=new int[]{1,2,3,4,5};
        ListNode head= LinkListUtil.getList(arr);
        LinkListUtil.print(head);
        ListNode rev=this.reverse(head);
        LinkListUtil.print(rev);
    }
}
