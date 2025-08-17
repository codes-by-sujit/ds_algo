package com.strivers.revision.aug16;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

public class MergeSort {

    private void mergeSort(int[] arr){
        int left = 0;
        int right= arr.length-1;
        dividensort(arr,left,right);
    }
    private void dividensort(int[] arr, int left,int right){
        if(left>=right)
            return;
        int mid=(right+left)/2;
        dividensort(arr,left,mid);
        dividensort(arr,mid+1,right);
        sort(arr,left,mid,right);
    }

    private void sort(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i=left,j=mid+1;
        int k=0;
        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i];
                i++;
            } else{
                temp[k++]=arr[j];
                j++;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i];
            i++;
        }
        while(j<=right){
            temp[k++]=arr[j];
            j++;
        }
        for(i=0;i<temp.length;i++){
            arr[left+i]=temp[i];
        }
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{4,2,5,1,3,9,0};
        mergeSort(arr);
        ArrayUtil.print(arr);
    }
}
