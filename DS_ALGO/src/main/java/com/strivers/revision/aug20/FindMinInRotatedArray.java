package com.strivers.revision.aug20;

import org.junit.jupiter.api.Test;

public class FindMinInRotatedArray {
    public int findMin(int[] nums) {
        int start=0, end=nums.length-1;
        int min = Integer.MAX_VALUE;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[start]<=nums[mid]){
                min=Math.min(min,nums[start]);
                start=mid+1;
            } else {
                min=Math.min(min,nums[mid]);
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
