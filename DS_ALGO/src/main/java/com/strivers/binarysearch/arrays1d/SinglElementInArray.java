package com.strivers.binarysearch.arrays1d;

import org.junit.jupiter.api.Test;

public class SinglElementInArray {
    public int singleNonDuplicate(int[] nums) {
        int pos=-1;
        int start=0;
        int end=nums.length-1;
        int mid=0;
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[end]!=nums[end-1]) return nums[end];
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])
                return nums[mid];
            //check in left part
            if((mid%2==0 && nums[mid]==nums[mid+1]) ||
                    (mid%2!=0 && nums[mid]==nums[mid-1])){
                start=mid+1; //because we are already in left half so we will remove left half
            } else{
                end=mid-1;
            }
        }
        return pos;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{1,1,2,3,3,4,4,8,8};
        System.out.println(this.singleNonDuplicate(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{3,3,7,7,10,11,11};
        System.out.println(this.singleNonDuplicate(arr));
    }
}
