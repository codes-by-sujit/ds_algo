package com.strivers.binarysearch.arrays1d;

import org.junit.jupiter.api.Test;

public class SearchInRotatedArrayHavingDups {

    public boolean search(int[] nums, int target) {
        boolean isFound=false;
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid]==target) {
                isFound=true;
                break;
            }
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                start=start+1;
                end=end-1;
                continue;
            }
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<=nums[mid]){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
            } else{
                if(nums[mid]<=target && target<=nums[end]){
                    start=mid+1;
                } else{
                    end=mid-1;
                }
            }
        }
        return isFound;
    }

    @Test
    public void tc(){
        int[] arr= new int[]{2,5,6,0,0,1,2};
        System.out.println(this.search(arr,0));
        System.out.println(this.search(arr,3));
    }

    @Test
    public void tc2(){
        int[] arr= new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};

        System.out.println(this.search(arr,2));
    }

    private void print(int[] arr, int start, int end){
        System.out.println(" ");
        System.out.print("[");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        System.out.println(" ");
    }
}
