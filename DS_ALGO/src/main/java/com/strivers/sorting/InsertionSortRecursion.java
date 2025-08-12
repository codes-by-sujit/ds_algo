package com.strivers.sorting;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class InsertionSortRecursion {
    private void sort(int[] arr, int range){
        if(range==arr.length)
            return;
        for(int i=0;i<range;i++){
            if(arr[range]<arr[i]){
                int temp = arr[range];
                arr[range]=arr[i];
                arr[i]=temp;
            }
        }
        sort(arr,range+1);
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{4,7,2,65,1,9,3,0,8,32};
        sort(arr, 0);
        ArrayUtil.print(arr);
    }
}
