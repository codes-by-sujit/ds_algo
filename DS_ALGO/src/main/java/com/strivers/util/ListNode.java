package com.strivers.util;

import java.util.List;

public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }

      public ListNode getNext(){
          return this.next;
      }

      public void setNext(ListNode node){
          this.next=node;
      }
      public void setValue(int val){
          this.val=val;
      }
      public int getVal(){
          return this.val;
      }

      public static ListNode getList(int[] arr){
          ListNode head = new ListNode(arr[0]);
          ListNode first = head;
          for(int i=1;i<arr.length;i++){
              ListNode n= new ListNode(arr[i]);
              first.setNext(n);
              first=n;
          }
          return head;
      }

      public static void print(ListNode head){
          System.out.println("   ");
          ListNode n=head;
          while(n!=null){
              System.out.print(" "+n.getVal());
              n=n.getNext();
          }
      }
  }
