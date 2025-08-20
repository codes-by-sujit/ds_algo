package com.strivers.array.hard;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ThreeSumWithMap {
    public List<List<Integer>> threeSum(int[] nums) {
        LinkedHashSet<List<Integer>> ans = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            Map<Integer,Integer> mp = new HashMap<>();
            for(int j=i+1;j<nums.length;j++){
                int temp = -(nums[i]+nums[j]);
                if(mp.containsKey(temp)){
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(temp);
                    tempList.add(nums[i]);
                    tempList.add(nums[j]);
                    Collections.sort(tempList);
                    ans.add(tempList);
                }
                mp.put(nums[j],j);
            }
        }
        return ans.stream().toList();
    }

    @Test
    public void tc(){
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        System.out.println(this.threeSum(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{0,0,0};
        System.out.println(this.threeSum(arr));
    }
}
