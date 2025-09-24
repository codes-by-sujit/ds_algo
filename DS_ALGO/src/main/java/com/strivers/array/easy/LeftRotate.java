package com.strivers.array.easy;

import util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class LeftRotate {

    private void rotate(int[] arr, int k){
        int n=arr.length-1;

        reverse(arr,0,k-1);
        reverse(arr, k,n);
        reverse(arr,0,n);
    }

    private void reverse(int[] arr, int start,int end){
        for(int i=start, j=end; i<=j;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{1,2,3,4,5};
        rotate(arr,2);
        ArrayUtil.print(arr);
    }
}
