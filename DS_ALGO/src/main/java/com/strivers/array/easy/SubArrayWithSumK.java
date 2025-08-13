package com.strivers.array.easy;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithSumK {

    private int maxLen(int[] arr,int k){
        Map<Integer,Integer> sumMap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                System.out.println("Sub array Found. From:0"+" to "+i);
                max=i+1;

            }
            if(sumMap.containsKey(sum-k)){
                int start = sumMap.get(sum-k)+1;
                int end = i;
                System.out.println("Sub array Found. From:"+start+" to "+end);
                max = Math.max(max,(end-start)+1);
            }
            sumMap.put(sum,i);
        }
        return max;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{2,3,5,1,9};
        System.out.println(maxLen(arr,10));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{1,2,-1,-4,8};
        System.out.println(maxLen(arr,3));
    }
}
