package com.strivers.array.hard;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majorityElementn_3times {
    private List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int v1=Integer.MIN_VALUE;
        int v2=Integer.MIN_VALUE;
        for (int num : nums) {
            if (count1 == 0 && v2!=num) {
                v1 = num;
                count1 = 1;
            }else if(count2==0 && v1!=num){
                v2=num;
                count2=1;
            }else if (v1 == num) {
                count1++;
            } else if (v2 == num) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        int maj=nums.length/3;
        int c1=0,c2=0;
        for(int num:nums){
            if(num==v1) c1++;
            if(num==v2) c2++;
        }
        if(c1>maj) ans.add(v1);
        if(c2>maj) ans.add(v2);
        return ans;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{3,2,3};
        System.out.println(majorityElement(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{1};
        System.out.println(majorityElement(arr));
    }

    @Test
    public void tc3(){
        int[] arr = new int[]{1,2};
        System.out.println(majorityElement(arr));
    }
}
