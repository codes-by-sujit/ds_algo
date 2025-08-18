package com.strivers.binarysearch.arrays1d;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class LastOccurance {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums,target),findLast(nums,target)};
    }

    private int findFirst(int[] nums, int target){
        int res=-1;
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                res=mid;
                end=mid-1;
            } else if(target<nums[mid]){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return res;
    }

    private int findLast(int[] nums, int target){
        int res=-1;
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                res=mid;
                start=mid+1;
            } else if(target<nums[mid]){
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
        ArrayUtil.print(searchRange(arr, 13));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{3,4,13};
        ArrayUtil.print(searchRange(arr, 14));
    }
}
