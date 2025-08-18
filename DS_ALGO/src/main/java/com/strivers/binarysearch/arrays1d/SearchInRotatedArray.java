package com.strivers.binarysearch.arrays1d;

import org.junit.jupiter.api.Test;

public class SearchInRotatedArray {
    private int search(int[] nums, int target) {
        int pos = -1;
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                pos=mid;
                break;
            }
            //If Left part is sorted
            if(nums[start]<=nums[mid]){
                //if target exist in the sorted part ?
                if(target>=nums[start] && target<=nums[mid]){
                    end=mid-1; //shrink scope to left side
                } else{
                    start=mid+1;
                }
            } else { //If Right part is sorted
                if(target>=nums[mid] && target<=nums[end]){
                    start=mid+1;
                } else{
                    end=mid-1;
                }
            }
        }
        return pos;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{4,5,6,7,0,1,2,3};
        System.out.println(this.search(arr,0));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{4,5,6,7,0,1,2};
        System.out.println(this.search(arr,3));
    }

    @Test
    public void tc3(){
        int[] arr = new int[]{1};
        System.out.println(this.search(arr,0));
    }
}
