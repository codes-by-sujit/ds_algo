package com.strivers.sorting;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class InsertionSort {
    private void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        ArrayUtil.print(arr);
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{4,7,2,65,1,9,3,0,8,32};
        sort(arr);
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{4};
        sort(arr);
    }
}
