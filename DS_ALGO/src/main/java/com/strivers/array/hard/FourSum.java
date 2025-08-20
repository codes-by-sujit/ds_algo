package com.strivers.array.hard;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1, l=nums.length-1;
                while(k<l){
                    long sum= Integer.valueOf(nums[i]).longValue()
                            +Integer.valueOf(nums[j]).longValue()
                            +Integer.valueOf(nums[k]).longValue()
                            +Integer.valueOf(nums[l]).longValue();
                    if(sum==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    } else if(sum<target){
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return ans;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{1,0,-1,0,-2,2};
        System.out.println(this.fourSum(arr,0));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{1000000000,1000000000,1000000000,1000000000};

        long temp= Integer.valueOf(arr[0]).longValue()*4;
        //System.out.println(temp);
        System.out.println(this.fourSum(arr,-294967296));
    }

}
