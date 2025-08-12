package com.strivers.sorting;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class BubbleSortIteration {

    private void sort(int[] arr, int range){
        if(range==1)
            return;
        boolean isSwapped=false;
        for(int j=1;j<range;j++){
            if(arr[j-1]>arr[j]){
                isSwapped=true;
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
        if(!isSwapped)
            return;
        sort(arr, range-1);
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{4,7,2,65,1,9,3,0,8,32};
        sort(arr, 10);
        ArrayUtil.print(arr);
    }
}
