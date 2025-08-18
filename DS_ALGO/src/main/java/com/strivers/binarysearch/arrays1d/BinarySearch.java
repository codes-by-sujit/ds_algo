package com.strivers.binarysearch.arrays1d;

import org.junit.jupiter.api.Test;

public class BinarySearch {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length-1,target);
    }

    private int search(int[] nums, int start, int end, int target){
        int mid=(start+end)/2;
        if(nums[mid]==target)
            return mid;
        if(start>end)
            return -1;
        if(target<nums[mid])
            return search(nums,start,mid-1,target);
        else
            return search(nums,mid+1,end,target);
    }

    @Test
    public void tc(){
        int[] nums = new int[]{-1,0,3,5,9,12};
        System.out.println(search(nums,9));
    }

    @Test
    public void tc2(){
        int[] nums = new int[]{-1,0,3,5,9,12};
        System.out.println(search(nums,2));
        System.out.println(search(nums,0));
    }
}
