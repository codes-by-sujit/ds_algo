package com.strivers.util;

public class LstNode {
      int val;
      LstNode next;
      LstNode(int x) {
          val = x;
          next = null;
      }

      public LstNode getNext(){
          return this.next;
      }

      public void setNext(LstNode node){
          this.next=node;
      }
      public void setValue(int val){
          this.val=val;
      }
      public int getVal(){
          return this.val;
      }

      public static LstNode getList(int[] arr){
          LstNode head = new LstNode(arr[0]);
          LstNode first = head;
          for(int i=1;i<arr.length;i++){
              LstNode n= new LstNode(arr[i]);
              first.setNext(n);
              first=n;
          }
          return head;
      }

      public static void print(LstNode head){
          System.out.println("   ");
          LstNode n=head;
          while(n!=null){
              System.out.print(" "+n.getVal());
              n=n.getNext();
          }
      }
  }
