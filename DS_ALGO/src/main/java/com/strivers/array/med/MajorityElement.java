package com.strivers.array.med;

import org.junit.jupiter.api.Test;

public class MajorityElement {
    private int majorityElement(int[] arr){
        int element=0;
        int count=0;
        for (int j : arr) {
            if (count == 0) {
                element = j;
                count = 1;
            } else if (j != element) {
                count--;
            } else {
                count++;
            }
        }
        return element;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{1,1,2,3,2,1,4,2,1,1,2};
        System.out.println(majorityElement(arr));
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{1,2,2,2,4,6,2,2,5,2,9,1};
        System.out.println(majorityElement(arr));
    }
}
