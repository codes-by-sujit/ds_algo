package com.strivers.array.hard;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithXor {
    private int get(int[] arr, int k){
        int count = 0;
        int xr = 0;
        Map<Integer,Integer> xorMap = new HashMap<>();
        xorMap.put(xr,1);
        for(int i=0;i<arr.length;i++){
            xr = xr ^ arr[i];
            int x = xr ^ k;
            if(xorMap.containsKey(x)){
                count+=xorMap.get(x);
            }
            xorMap.put(xr,xorMap.getOrDefault(xr,0)+1);
            System.out.println(xorMap);
        }
        System.out.println(count);
        return count;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{4,2,2,6,4};
        this.get(arr,6);
    }
    @Test
    public void tc2(){
        int[] arr = new int[]{5, 6, 7, 8, 9};
        this.get(arr,5);
    }
}
