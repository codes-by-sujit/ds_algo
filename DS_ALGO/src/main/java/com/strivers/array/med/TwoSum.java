package com.strivers.array.med;


import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoSum {
    private int[] twoSum(int[] arr,int k){
        Arrays.sort(arr);
        int[] ans=new int[2];
        int i=0,j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==k){
                ans[0]=arr[i];
                ans[1]=arr[j];
                break;
            } else if (sum>k)
                j--;
            else
                i++;
        }
        return ans;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{2,11,7,15};
        ArrayUtil.print(twoSum(arr,9));
    }
}
