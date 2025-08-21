package com.strivers.LinkedList;

import com.strivers.util.LinkListUtil;
import com.strivers.util.ListNode;
import com.strivers.util.LstNode;
import org.junit.jupiter.api.Test;

public class Add2Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode n=new ListNode(-1);
        int carry=0;

        while(l1!=null || l2!=null || carry ==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode ls = new ListNode(sum%10);
            n.next=ls;
            n=n.next;
            if(head==null)
                head=n;
        }
        return head;
    }

    @Test
    public void tc(){
        ListNode i = new ListNode(2);
        ListNode head=i;
        i.next=new ListNode(4);
        i=i.next;
        i.next=new ListNode(3);
        LinkListUtil.print(head);

        ListNode j = new ListNode(5);
        ListNode h2=j;
        j.next=new ListNode(6);
        j=j.next;
        j.next=new ListNode(4);

        LinkListUtil.print(h2);
        LinkListUtil.print(this.addTwoNumbers(head,h2));
    }
}
