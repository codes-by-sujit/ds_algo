package com.strivers.sorting;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class QuickSort {

    private void sort(int[] arr, int left, int right){
        if(left>=right)
            return;
        int p=findPartition(arr,left,right);
        sort(arr,left,p-1);
        sort(arr,p+1,right);
    }

    private int findPartition(int[] arr, int left, int right){
        int pivot = arr[left];
        int i=left;
        int j=right;
        while(i<j){
            while(arr[i]<=pivot && i<right)
                i++;
            while(arr[j]>=pivot && j>left)
                j--;
            if(i<j)
                swap(arr,i,j);
        }
        swap(arr,left,j);
        return j;
    }

    private void swap(int[] arr, int i, int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{4,7,2,65,1,9,3,0,8,32};
        sort(arr, 0,9);
        ArrayUtil.print(arr);
    }
}
