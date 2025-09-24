package com.strivers.array.easy;

import util.ArrayUtil;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Union {
    private int[] union(int[] arr1, int arr2[]){
        int i=0,j=0;
        Set<Integer> temp = new LinkedHashSet<>();

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                temp.add(arr1[i]);
                i++;
            } else {
                temp.add(arr2[j]);
                j++;
            }
        }
        return temp.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    @Test
    public void tc1(){
        int[] arr1=new int[]{1,2,3,4,5,7};
        int[] arr2=new int[]{2,3,4,4,5,6,7,7};
        int[] temp = union(arr1, arr2);
        ArrayUtil.print(temp);
    }
}
