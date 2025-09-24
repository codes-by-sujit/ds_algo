package com.strivers.array.easy;

import util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class MoveZeros {
    private void move(int[] arr){
        if(arr.length==1)
            return;
        int i=0,j=1;
        while(j<arr.length){
            if(arr[j]!=0){
                i++;
                swap(arr,i,j);
            }
            j++;
        }
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{1,0,0,0,2,0,3,0,0,4,5};
        move(arr);
        ArrayUtil.print(arr);
    }
}
