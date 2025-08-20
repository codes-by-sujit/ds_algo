package com.strivers.revision.aug20;

import org.junit.jupiter.api.Test;

public class SearchSingleElement {

    private int search(int[] arr){
        int start=0,end=arr.length-1;
        if(arr.length==1) return 0;
        if(arr[0]!=arr[1]) return 0;
        if(arr[end]!=arr[end-1]) return end;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return mid;
            }
            if(mid%2==0){
                if(arr[mid]==arr[mid+1])  //mid is in left side. Left part all are in couples. goto right
                    start=mid+1;
                else
                    end=mid-1;
            } else{
              if(arr[mid]==arr[mid-1])
                  start=mid+1;
              else
                  end=mid-1;
            }
        }
        return -1;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{1,1,2,3,3,4,4,8,8};
        System.out.println(this.search(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{3,3,7,7,10,11,11};
        System.out.println(this.search(arr));
    }
}
