package com.strivers.sorting;

import org.junit.jupiter.api.Test;

public class SelectionSort {

    private void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]) {
                    min = arr[j];
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                //System.out.println("i: "+i+"  j:"+j+"  MIN="+min);

            }
        }
    }

    private void print(int[] a){
        System.out.println(" ");
        for(int i:a){
            System.out.print(" "+i);
        }
        System.out.println(" ");
    }

    @Test
    public void tc(){
        int[] arr = new int[]{3,6,1,5,9,2,1,8,7};
        selectionSort(arr);
        print(arr);
    }
}
