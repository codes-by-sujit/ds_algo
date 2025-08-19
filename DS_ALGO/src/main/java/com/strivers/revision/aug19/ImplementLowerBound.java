package com.strivers.revision.aug19;

import org.junit.jupiter.api.Test;

public class ImplementLowerBound {

    private int get(int[] arr,int target){
        int ans=-1;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<=arr[mid]){
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
        int[] nums = new int[]{-1,0,3,5,9,12};
        System.out.println(get(nums,4));
    }
    @Test
    public void tc2(){
        int[] nums = new int[]{3, 5, 8, 9,11,14,15, 19};
        System.out.println(get(nums,12));
    }
}
