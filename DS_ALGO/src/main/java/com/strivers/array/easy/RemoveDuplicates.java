package com.strivers.array.easy;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1)
            return 1;
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                if(i!=j)
                    swap(nums,i,j);
            }
            j++;
        }
        ArrayUtil.print(nums);
        return i+1;
    }

    private void swap(int[] nums, int i, int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{1,1,1,2,2,3,3,3,4,4,7};
        int k = removeDuplicates(arr);
        System.out.println(k);
    }
    @Test
    public void tc2(){
        int[] arr = new int[]{1};
        int k = removeDuplicates(arr);
        System.out.println(k);
    }
}
