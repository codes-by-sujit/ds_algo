package com.strivers.recursion;

import org.junit.jupiter.api.Test;

public class ReverseArray {
    private void reverseArray(int[] arr){
        reverse(arr,0,arr.length-1);
        print(arr);
    }

    private void reverse(int[] arr, int i, int j){
        if(i>=j)
            return;
        swap(arr,i++,j--);
        reverse(arr,i,j);
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private void print(int[] arr){
        System.out.println("");
        for(int i:arr){
            System.out.print(" "+i);
        }
        System.out.println("");
    }


    @Test
    public void tc(){
        int[] arr = new int[]{1,2,3,4,5,8,9,1};
        reverseArray(arr);
    }
}
