package com.strivers.array.med;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSeq {
    private int longestConsecutive(int[] arr) {
        Map<Integer,Integer> mp=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i:arr)
            mp.put(i,i);
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            int j=0;
            int count=0;
            while(mp.get(e.getKey()+j)!=null){
                count++;
                j++;
            }
            max=Math.max(max,count);
        }
        return max;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{3,8,5,7,6};
        System.out.println(longestConsecutive(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{100, 200,5,30,31,32,33,34,35,36,1, 3, 2, 4};
        System.out.println(longestConsecutive(arr));
    }
}
