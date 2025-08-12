package com.strivers.array.easy;

import org.junit.jupiter.api.Test;

public class SecondLargestAndSmallest {

    private int secondLargest(int[] arr){

        int max2=-1;
        if(arr.length==1)
            return -1;
        int max1= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            } else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println(max1);
        return max2;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{4,9,15,10,5,13};
        System.out.println(secondLargest(arr));
    }
}
