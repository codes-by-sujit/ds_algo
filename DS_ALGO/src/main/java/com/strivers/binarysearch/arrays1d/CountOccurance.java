package com.strivers.binarysearch.arrays1d;

import org.junit.jupiter.api.Test;

public class CountOccurance {
    private int count(int[] nums, int target){
        System.out.println("FIRST="+findFirst(nums,target));
        return (findLast(nums,target)-findFirst(nums,target))+1;
    }

    private int findFirst(int[] nums, int target){
        int start = 0;
        int end=nums.length-1;
        int res = -1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                res=mid;
                end=mid-1;
            } else if(nums[mid]>target){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return res;
    }

    private int findLast(int[] nums, int target){
        int start = 0;
        int end=nums.length-1;
        int res = -1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                res=mid;
                start=mid+1;
            } else if(nums[mid]>target){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return res;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{3,4,13,13,13,20,40};
        System.out.println(this.count(arr,13));
    }
}
