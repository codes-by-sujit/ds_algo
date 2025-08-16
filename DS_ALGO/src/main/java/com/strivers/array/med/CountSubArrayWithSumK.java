package com.strivers.array.med;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithSumK {

    public int subarraySum(int[] arr, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int prefixSum=0;
        int count=0;
        mp.put(0,1);
        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];
            count += mp.getOrDefault(prefixSum-k,0);
            mp.put(prefixSum,mp.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{1,2,5,8,3,4};
        System.out.println(subarraySum(arr,7));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{1,-1,0};
        System.out.println(subarraySum(arr,0));
    }
}
