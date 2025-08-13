package com.strivers.array.easy;

import org.junit.jupiter.api.Test;

public class MaxConsecutiveOne {
    private int maxCount(int[] arr){
        int max = Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                count=0;
            max = Math.max(count++,max);
        }
        return max;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{1,1,0,0,1,1,1,0,1,1,1,1,0,0,1,1,1};
        System.out.println(maxCount(arr));
    }
}
