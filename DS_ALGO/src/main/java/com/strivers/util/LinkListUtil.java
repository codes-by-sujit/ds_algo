package com.strivers.util;

public class LinkListUtil {
    public static void print(ListNode head){
        System.out.println("   ");
        ListNode n=head;
        while(n!=null){
            System.out.print(" "+n.val);
            n=n.next;
        }
    }

    public static ListNode getList(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode first = head;
        for(int i=1;i<arr.length;i++){
            ListNode n= new ListNode(arr[i]);
            first.next=n;
            first=n;
        }
        return head;
    }
}
