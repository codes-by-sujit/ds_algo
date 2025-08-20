package com.strivers.revision.aug20;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class FindFirstAndLastOccr {
    private int[] find(int[] arr, int target){
        return new int[]{findFirst(arr,target),findLast(arr,target)};
    }

    private int findFirst(int[] arr, int target){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                ans=mid;
                end=mid-1;
            } else if(arr[mid]>target){
                end=mid-1;
            } else{
                start=mid+1;
            }
        }
        return ans;
    }

    private int findLast(int[] arr, int target){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                ans=mid;
                start=mid+1;
            } else if(arr[mid]>target){
                end=mid-1;
            } else{
                start=mid+1;
            }
        }
        return ans;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{5,7,7,8,8,10};
        ArrayUtil.print(this.find(arr,8));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{5,7,7,8,8,10};
        ArrayUtil.print(this.find(arr,9));
    }

    @Test
    public void tc3(){
        int[] arr = new int[]{5,7,7,8,8,10};
        ArrayUtil.print(this.find(arr,5));
    }
    @Test
    public void tc4(){
        int[] arr = new int[]{5};
        ArrayUtil.print(this.find(arr,5));
    }
}
