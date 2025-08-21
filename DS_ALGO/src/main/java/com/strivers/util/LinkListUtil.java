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
}
