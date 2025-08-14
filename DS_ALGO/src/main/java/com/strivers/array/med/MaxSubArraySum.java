package com.strivers.array.med;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class MaxSubArraySum {

    private int[] getSubArray(int[] arr){
        int start=0, end=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(sum==0){
                start=i;end=i;
            }
            sum+=arr[i];
            if(sum<0){
                sum=0;
            } else{
                if(sum>max){
                    end=i;
                    max=sum;
                }
            }
        }
        int[] temp= new int[]{start,end,max};
        return temp;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        ArrayUtil.print(getSubArray(arr));
    }
}
