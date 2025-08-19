package com.strivers.revision.aug19;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class majorityElementN_3times {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n1=Integer.MIN_VALUE;
        int n2 = Integer.MIN_VALUE;
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(c1==0 && nums[i]!=n2){
                n1=nums[i];
                c1++;
            } else if(c2==0 && nums[i]!=n1){
                n2=nums[i];
                c2++;
            } else if(n1==nums[i]){
                c1++;
            } else if(n2==nums[i]){
                c2++;
            } else{
                c1--;
                c2--;
            }
        }

        c1=0;c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n1) c1++;
            if(nums[i]==n2) c2++;
        }
        if(c1>nums.length/3) ans.add(n1);
        if(c2>nums.length/3) ans.add(n2);
        return ans;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{1,2,2,3,2};
        System.out.println(this.majorityElement(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{1};
        System.out.println(this.majorityElement(arr));
    }

    @Test
    public void tc3(){
        int[] arr = new int[]{1,2};
        System.out.println(this.majorityElement(arr));
    }

    @Test
    public void tc4(){
        int[] arr = new int[]{1,2,2,3,3,2,3};
        System.out.println(this.majorityElement(arr));
    }
}
