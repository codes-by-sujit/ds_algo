package com.strivers.array.med;

import util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class NextPermutation {

    private void findPermutation(int[] arr){

        //Finding the threshold index
        int j=arr.length-2;
        int th = -1;
        while(j>=0){
            if(arr[j]<arr[j+1]){
                th = j;
                break;
            }
            j--;
        }
        if(th==-1){
            reverse(arr,0,arr.length-1);
            return;
        }
        //Finding the next big element from th
        for(j=arr.length-1;j>th;j--){
            if(arr[j]>arr[th]){
                break;
            }
        }
        swap(arr,j,th);
        reverse(arr, th+1, arr.length-1);
    }

    private void swap(int[] arr, int i, int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    private void reverse(int[] arr, int start, int end){
        int i=start;
        int j=end;
        while(i<j){
            swap(arr,i,j);
            i++;j--;
        }
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{2,1,5,4,3,0};
        findPermutation(arr);
        ArrayUtil.print(arr);
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{3,2,1};
        findPermutation(arr);
        ArrayUtil.print(arr);
    }
}
