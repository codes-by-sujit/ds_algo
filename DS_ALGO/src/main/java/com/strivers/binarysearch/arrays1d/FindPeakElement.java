package com.strivers.binarysearch.arrays1d;

import org.junit.jupiter.api.Test;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        int n=nums.length-1;
        if(nums[n]>nums[n-1]) return n;
        if(nums[0]>nums[1]) return 0;

        int start=1;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]>nums[mid-1]){
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return -1;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{1,2,1,3,5,6,4};
        System.out.println(this.findPeakElement(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{1,2,3,1};
        System.out.println(this.findPeakElement(arr));
    }
}
