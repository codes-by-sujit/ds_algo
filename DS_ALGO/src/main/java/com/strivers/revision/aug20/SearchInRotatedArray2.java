package com.strivers.revision.aug20;

import org.junit.jupiter.api.Test;

public class SearchInRotatedArray2 {
    private boolean search(int[] arr, int target){
        int start=0, end=arr.length-1;
        boolean isFound=false;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                isFound=true; break;
            }
            if(arr[start]==arr[end]){
                start=start+1;
                end=end-1;
            }
            if(arr[mid]<target){
                start=mid+1;
            } else{
                end=mid-1;
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
}
