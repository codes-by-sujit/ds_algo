package com.strivers.revision.aug20;

import org.junit.jupiter.api.Test;

public class FindPeakElement {
    private int findPeakElement(int[] arr){
        int n=arr.length-1;
        int start=0,end=n;
        if(arr.length==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n]>arr[n-1]) return n;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
            else if(arr[mid]>arr[mid-1])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{1,2,1,3,5,6,4};
        System.out.println(this.findPeakElement(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{1,2,3,1};
        System.out.println(this.findPeakElement(arr));
    }

    @Test
    public void tc3(){
        int[] arr = new int[]{1,2,1,3,5,6,7};
        System.out.println(this.findPeakElement(arr));
    }
}
