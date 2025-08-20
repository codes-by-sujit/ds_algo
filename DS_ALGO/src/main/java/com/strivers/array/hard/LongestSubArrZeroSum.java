package com.strivers.array.hard;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrZeroSum {

    private int get(int[] arr){
        int max=Integer.MIN_VALUE;
        long sum=0;
        Map<Long, Integer> prefixSum=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=Integer.valueOf(arr[i]).longValue();
            if(sum==0){
                max=i+1;
            }
            if(prefixSum.containsKey(sum)){
                int length=i-prefixSum.get(sum);
                System.out.println("Between "+prefixSum.get(sum)+" to "+i);
                max=Math.max(max,length);
            } else {
                prefixSum.put(sum,i);
            }
        }

        return max;
    }

    @Test
    public void test(){
        int[] arr = new int[]{9, -3, 3, -1, 6, -5};
        System.out.println(this.get(arr));
    }

    @Test
    public void test2(){
        int[] arr = new int[]{6, -2, 2, -8, 1, 7, 4, -10};
        System.out.println(this.get(arr));
    }
}
