package com.strivers.array.easy;

import org.junit.jupiter.api.Test;

public class CheckArraySort {
    private boolean check(int[] arr){
        if(arr.length==1)
            return true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i])
                return false;
        }
        return true;
    }

    @Test
    public void tc1(){
        int[] arr = new int[] {3,6,4,2};
        System.out.println(check(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[] {5,6,7,8};
        System.out.println(check(arr));
    }
}
