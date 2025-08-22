package com.strivers.LinkedList;

import com.strivers.util.LinkListUtil;
import com.strivers.util.ListNode;
import org.junit.jupiter.api.Test;

public class ReverseLinkedList2 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode preNode=dummy;
        ListNode curr=head;
        for(int i=0;i<left-1;i++){
            preNode=preNode.next;
            curr=curr.next;
        }
        ListNode subs=curr;
        ListNode h=null;
        for(int i=0;i<=right-left;i++){
            ListNode n = curr.next;
            curr.next=h;
            h=curr;
            curr=n;
        }
        preNode.next=h;
        subs.next=curr;
        return dummy.next;
    }

    @Test
    public void tc1(){
        int[] arr=new int[]{1,2,3,4,5,6,7,8};
        ListNode head= LinkListUtil.getList(arr);
        LinkListUtil.print(head);
        ListNode rev=this.reverseBetween(head,3,6);
        LinkListUtil.print(rev);
    }

    @Test
    public void tc2(){
        int[] arr=new int[]{1,2,3,4,5};
        ListNode head= LinkListUtil.getList(arr);
        LinkListUtil.print(head);
        ListNode rev=this.reverseBetween(head,2,4);
        LinkListUtil.print(rev);
    }

    @Test
    public void tc3(){
        int[] arr=new int[]{1,2,3,4,5};
        ListNode head= LinkListUtil.getList(arr);
        LinkListUtil.print(head);
        ListNode rev=this.reverseBetween(head,2,2);
        LinkListUtil.print(rev);
    }

    @Test
    public void tc4(){
        int[] arr=new int[]{5};
        ListNode head= LinkListUtil.getList(arr);
        LinkListUtil.print(head);
        ListNode rev=this.reverseBetween(head,1,1);
        LinkListUtil.print(rev);
    }

    @Test
    public void tc5(){
        int[] arr=new int[]{1,2};
        ListNode head= LinkListUtil.getList(arr);
        LinkListUtil.print(head);
        ListNode rev=this.reverseBetween(head,3,3);
        LinkListUtil.print(rev);
    }

    @Test
    public void tc6(){
        int[] arr=new int[]{3,5};
        ListNode head= LinkListUtil.getList(arr);
        LinkListUtil.print(head);
        ListNode rev=this.reverseBetween(head,1,1);
        LinkListUtil.print(rev);
    }
}
