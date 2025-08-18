package com.strivers.binarysearch.arrays1d;

import org.junit.jupiter.api.Test;

public class SearchInsertPos {
    public int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length,mid=0;
        int ans=-1;
        while(start<=end){
            mid=(start+end)/2;
             if(mid>nums.length-1)
                 return mid;
            if(nums[mid]==target){
                ans=mid;
                break;
            } else if(nums[mid]>target){
                ans=mid;
                end=mid-1;
            } else{
                start=mid+1;
            }
        }
        return ans;
    }

    @Test
    public void tc(){
        int[] arr =new int[]{1,3,5,6};
        System.out.println(searchInsert(arr,5));
        System.out.println(searchInsert(arr,2));
        System.out.println(searchInsert(arr,7));
    }
}
