package com.strivers.LinkedList;

import com.strivers.util.LinkListUtil;
import com.strivers.util.ListNode;
import org.junit.jupiter.api.Test;

public class RemoventhNodeFromLinkList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null)
            return head.next;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode node = slow.next;
        slow.next=node.next;
        return head;
    }

    @Test
    public void tc(){
        int[] arr=new int[]{1,2,3,4,5};
        ListNode head= LinkListUtil.getList(arr);
        LinkListUtil.print(head);
        ListNode res = this.removeNthFromEnd(head,2);
        LinkListUtil.print(res);
    }

    @Test
    public void tc2(){
        int[] arr=new int[]{1,2,3,4,5,6,7,8};
        ListNode head= LinkListUtil.getList(arr);
        LinkListUtil.print(head);
        ListNode res = this.removeNthFromEnd(head,3);
        LinkListUtil.print(res);
    }

    @Test
    public void tc3(){
        int[] arr=new int[]{1,2,3,4,5,6,7,8};
        ListNode head= LinkListUtil.getList(arr);
        LinkListUtil.print(head);
        ListNode res = this.removeNthFromEnd(head,1);
        LinkListUtil.print(res);
    }
    @Test
    public void tc4(){
        int[] arr=new int[]{1,2,3,4,5,6,7,8};
        ListNode head= LinkListUtil.getList(arr);
        LinkListUtil.print(head);
        ListNode res = this.removeNthFromEnd(head,8);
        LinkListUtil.print(res);
    }
}
