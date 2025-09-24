package com.strivers.array.med;

import util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class sortArrayWith012 {
    private void sort(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid<high){
            if(arr[mid]==0){
                swap(arr, low, mid);
                low++;
                mid++;
            } else if(arr[mid]==1){
                mid++;
            } else {
                swap(arr,high,mid);
                high--;
            }
        }
    }

    private void swap(int[] arr, int i, int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{0,0,1,2,2,1,0,1};
        sort(arr);
        ArrayUtil.print(arr);
    }
}
