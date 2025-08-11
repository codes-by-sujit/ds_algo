package com.strivers.sorting;

import org.junit.jupiter.api.Test;

public class BubbleSort {

    private void sort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
         for(int j=0;j<i;j++){
             if(arr[j]>arr[j+1]){
                 int temp = arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
         }
        }
        print(arr);
    }

    private void print(int[] arr){
        System.out.println("- - - - - - - - - ");
        for(int i : arr){
            System.out.print(" "+i);
        }
        System.out.println("\n - - - - - - - - - ");
    }

    @Test
    public void tc(){
        int[] arr = new int[]{4,7,2,65,1,9,3,0,8,32};
        sort(arr);
    }
    @Test
    public void tc2(){
        int[] arr = new int[]{4,1};
        sort(arr);
    }
}
