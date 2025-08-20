package com.strivers.array.hard;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ThreeSumWithPointer {
    public List<List<Integer>> threeSum(int[] nums) {
        LinkedHashSet<List<Integer>> ans = new LinkedHashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            int k=nums.length-1;
            int j=i+1;
            while(j<k){
                int temp=nums[i]+nums[j]+nums[k];
                if(temp==0){
                    List<Integer> tempList= new ArrayList<>();
                    tempList.add(nums[i]);tempList.add(nums[j]);tempList.add(nums[k]);
                    Collections.sort(tempList);
                    ans.add(tempList);
                    j++;k--;
                } else if(temp<0){
                    j++;
                } else{
                    k--;
                }
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
