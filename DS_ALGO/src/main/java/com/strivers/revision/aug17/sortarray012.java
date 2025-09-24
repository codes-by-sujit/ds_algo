package com.strivers.revision.aug17;

import util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class sortarray012 {

    private void sort(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            } else if(arr[mid]==1){
                mid++;
            } else{
                swap(arr,mid,high);
                high--;
            }
        }
    }

    private void swap(int[] arr, int i, int j){
        int t= arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{2,0,1};
        sort(arr);
        ArrayUtil.print(arr);
    }
}
