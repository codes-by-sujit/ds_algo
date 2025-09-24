package leetCode.stack;

import org.junit.jupiter.api.Test;
import util.ArrayUtil;

import java.util.Stack;

public class _503_nxtgreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        //Temp array to hold the greater elements
        int[] temp=new int[n];


        //Stack to hold the greater elements
        Stack<Integer> stack=new Stack<>();

        //parse from 2n to 0
        for(int i=2*n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i%n]>=stack.peek())
                stack.pop();
            if(i<n)
                temp[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(nums[i%n]);
        }
        return temp;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{1,2,3,4,3};
        ArrayUtil.print(this.nextGreaterElements(arr));
    }
    @Test
    public void tc2(){
        int[] arr = new int[]{5,4,3,2,1};
        ArrayUtil.print(this.nextGreaterElements(arr));
    }

}
