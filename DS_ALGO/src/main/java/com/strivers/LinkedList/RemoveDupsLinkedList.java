package com.strivers.LinkedList;

import com.strivers.util.LinkListUtil;
import com.strivers.util.ListNode;
import org.junit.jupiter.api.Test;

public class RemoveDupsLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre = dummy;
        ListNode curr=head;
        while(curr!=null){
            //if the next values are same
            if(curr.next!=null && curr.val==curr.next.val){
                while(curr.next!=null && curr.val==curr.next.val){
                    curr=curr.next;
                }
                pre.next=curr.next;
            } else {
                pre = pre.next;
            }
            curr=curr.next;
        }
        return dummy.next;
    }

    @Test
    public void tc1(){
        int[] arr=new int[]{1,2,2,3,4,4,5};
        ListNode head= LinkListUtil.getList(arr);
        LinkListUtil.print(head);
        ListNode rev=this.deleteDuplicates(head);
        LinkListUtil.print(rev);
    }
}
