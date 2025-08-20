package com.strivers.revision.aug20;

import org.junit.jupiter.api.Test;

public class FindInSortedArray {
    private int search(int[] arr, int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target)
                return mid;
            if(arr[start]<=arr[mid]){
                if(arr[start]<=target && target<=arr[mid])
                    end=mid-1;
                else
                    start=mid+1;
            } else{
                if(arr[mid]<=target && target<=arr[end])
                    start=mid+1;
                else
                    end=mid-1;
            }
        }
        return -1;
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
