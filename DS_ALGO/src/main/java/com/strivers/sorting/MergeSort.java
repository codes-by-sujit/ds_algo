package com.strivers.sorting;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class MergeSort {
    private void sort(int[] arr,int left, int right){
        if(left>=right)
            return;
        int mid = (right+left)/2;
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr, left, mid,right);
    }
    private void merge(int[] arr, int left, int mid, int right){
         int[] temp = new int[right - left + 1];
         int i=left;
         int j=mid+1;
         int k=0;
         while(i<=mid && j<=right){
             if(arr[i]<=arr[j]){
                 temp[k++]=arr[i++];
             } else {
                 temp[k++]=arr[j++];
             }
         }
         while(i<=mid)
             temp[k++]=arr[i++];

         while(j<=right)
             temp[k++]=arr[j++];
        for(int x=0;x<temp.length;x++)
            arr[left+x]=temp[x];
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{4,7,2,65,1,9,3,0,8,32};
        sort(arr,0,arr.length-1);
        ArrayUtil.print(arr);
    }
}
