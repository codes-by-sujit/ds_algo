package com.strivers.binarysearch.arrays1d;

import org.junit.jupiter.api.Test;

public class CeilAndFloor {

    private int ceil(int arr[], int x){
        int start=0,end=arr.length,mid=0,ans=-1;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]>=x){
                ans=arr[mid];
                end=mid-1;
            } else{
                start=mid+1;
            }
        }
        return ans;
    }

    private int floor(int arr[], int x){
        int start=0,end=arr.length-1,mid=0,ans=-1;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return ans;
    }

    @Test
    public void tc(){
        int[] nums = new int[]{3, 4, 4, 7, 8, 10};
        System.out.println(floor(nums,5)+"  "+ceil(nums,5));
    }
}
