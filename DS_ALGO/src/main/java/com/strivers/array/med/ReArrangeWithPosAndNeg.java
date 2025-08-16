package com.strivers.array.med;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class ReArrangeWithPosAndNeg {

    private int[] rearrange(int[] arr){
        int i=0,j=1;
        int[] ans = new int[arr.length];
        for (int value : arr) {
            if (value > 0 && i < arr.length) {
                ans[i] = value;
                i = i + 2;
            } else if (value < 0 && j < arr.length) {
                ans[j] = value;
                j = j + 2;
            }
        }
        return ans;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{3,1,-2,-5,2,-4};
        ArrayUtil.print(rearrange(arr));
    }
}
