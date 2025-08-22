package com.strivers.LinkedList;

import com.strivers.util.LinkListUtil;
import com.strivers.util.ListNode;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(-1);
        ListNode head=ans;
        while(list1!=null && list2!=null){
            if(list1.val== list2.val){
                ans.next=new ListNode(list1.val);
                ans=ans.next;
                ans.next=new ListNode(list2.val);
                ans=ans.next;
                list1=list1.next;
                list2=list2.next;
            } else if(list1.val<list2.val){
                ans.next=new ListNode(list1.val);
                ans=ans.next;
                list1=list1.next;
            } else{
                ans.next=new ListNode(list2.val);
                ans=ans.next;
                list2=list2.next;
            }
        }
        while(list1!=null){
            ans.next=new ListNode(list1.val);
            ans=ans.next;
            list1=list1.next;
        }
        while(list2!=null){
            ans.next=new ListNode(list2.val);
            ans=ans.next;
            list2=list2.next;
        }
        return head.next;
    }

    @Test
    public void tc(){
        ListNode l1 = LinkListUtil.getList(new int[]{1,2,4});
        ListNode l2 = LinkListUtil.getList(new int[]{1,3,4,5});
        LinkListUtil.print(l1);
        LinkListUtil.print(l2);
        ListNode m=this.mergeTwoLists(l1,l2);
        LinkListUtil.print(m);
    }

    @Test
    public void tc2(){
        ListNode l1 = LinkListUtil.getList(new int[]{1,2,4});
        ListNode l2 = LinkListUtil.getList(new int[]{1,3,4});
        LinkListUtil.print(l1);
        LinkListUtil.print(l2);
        ListNode m=this.mergeTwoLists(l1,l2);
        LinkListUtil.print(m);
    }

    @Test
    public void tc3(){
        ListNode l1 = LinkListUtil.getList(new int[]{1,2,4,7,9,9});
        ListNode l2 = LinkListUtil.getList(new int[]{1,3,4,5});
        LinkListUtil.print(l1);
        LinkListUtil.print(l2);
        ListNode m=this.mergeTwoLists(l1,l2);
        LinkListUtil.print(m);
    }

    @Test
    public void tc4(){
        ListNode l1 = LinkListUtil.getList(new int[]{2});
        ListNode l2 = LinkListUtil.getList(new int[]{1});
        LinkListUtil.print(l1);
        LinkListUtil.print(l2);
        ListNode m=this.mergeTwoLists(l1,l2);
        LinkListUtil.print(m);
    }
}
