package com.strivers.stack;

import org.junit.jupiter.api.Test;
import util.ArrayUtil;

import java.util.Stack;

public class NextSmallerElement {
    public int[] nextsmallerElements(int[] nums) {
        int[] temp=new int[nums.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()>=nums[i])
                stack.pop();
            temp[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(nums[i]);
        }
        return temp;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{1,2,3,4,3};
        ArrayUtil.print(this.nextsmallerElements(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{5,4,3,2,1};
        ArrayUtil.print(this.nextsmallerElements(arr));
    }
}
