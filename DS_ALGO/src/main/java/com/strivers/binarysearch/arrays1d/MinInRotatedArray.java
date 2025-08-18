package com.strivers.binarysearch.arrays1d;

import org.junit.jupiter.api.Test;

public class MinInRotatedArray {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int start=0,end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[start]<=nums[mid]){ //Left is sorted
                min=Math.min(nums[start],min);
                start=mid+1;
            } else { //Right side is sorted
                min=Math.min(nums[mid],min);
                end=mid-1;
            }
        }
        return min;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{4,5,6,7,0,1,2};
        System.out.println(this.findMin(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{3,4,5,1,2};
        System.out.println(this.findMin(arr));
    }
}
