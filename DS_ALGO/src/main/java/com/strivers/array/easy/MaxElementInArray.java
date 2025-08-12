package com.strivers.array.easy;

import org.junit.jupiter.api.Test;

public class MaxElementInArray {
    private int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        return max;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{4,7,2,65,1,9,3,0,8,32};
        System.out.println(findMax(arr));
    }
}
