package com.strivers.binarysearch.arrays1d;

import org.junit.jupiter.api.Test;

public class ImplementUpperBound {
    private int getUpperBound(int[] arr, int x){
        int ans=-1;
        int start=0;
        int end = arr.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]>x){
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
        int[] nums = new int[]{3,5,8,9,15,19};
        System.out.println(getUpperBound(nums,9));
    }
}
