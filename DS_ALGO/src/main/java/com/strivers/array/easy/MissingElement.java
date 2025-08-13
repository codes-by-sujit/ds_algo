package com.strivers.array.easy;

import org.junit.jupiter.api.Test;

public class MissingElement {

    private int missingElement(int[] arr){
        int i=1,j=0;
        while(j<arr.length){
            if((arr[j]^i) !=0)
                return i;
            i++;j++;
        }
        return -1;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{1,2,3,5};
        System.out.println(missingElement(arr));
    }
}
