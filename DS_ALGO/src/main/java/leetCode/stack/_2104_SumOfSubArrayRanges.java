package leetCode.stack;

import org.junit.jupiter.api.Test;
import util.ArrayUtil;

import java.util.Stack;

public class _2104_SumOfSubArrayRanges {
    public long subArrayRanges(int[] nums) {

        int[] nse=nextSmallerElements(nums);
        int[] pse=prevSmallerElements(nums);
        int[] nge=nextGreaterElements(nums);
        int[] pge=prevGreaterElements(nums);

        long sumOfMins=0;
        long sumOfMax=0;
        //int mod=1000000007;

        for(int i=0;i<nums.length;i++){
            sumOfMins += (long)(i-pse[i])*(nse[i]-i)*nums[i];
            sumOfMax  += (long)(i-pge[i])*(nge[i]-i)*nums[i];
        }
        return sumOfMax-sumOfMins;
    }

    /**
     * Returns the index of the next smaller number compared to the current number
     * if next smaller is not found(the number is smallest or the right most) then returns sizeofnums
     * @param nums
     * @return
     */
    private int[] nextSmallerElements(int[] nums){
        //Result array to store the index of the next smaller element
        int[] res=new int[nums.length];
        //Stack to keep track the smaller number
        Stack<Integer> stack = new Stack<>();
        //parse the numbers from right to left
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]>=nums[i])
                stack.pop();
            res[i]=stack.isEmpty()?nums.length:stack.peek();
            stack.push(i);
        }
        return res;
    }

    /**
     * Returns the index of the previous smaller number compared to the current number
     * if previous smaller is not found(the number is smallest or the left most) then returns -1
     * @param nums
     * @return
     */
    private int[] prevSmallerElements(int[] nums){
        int[] res=new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]>nums[i])
                stack.pop();
            res[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return res;
    }

    private int[] nextGreaterElements(int[] nums){
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i])
                stack.pop();
            res[i]=stack.isEmpty()?nums.length:stack.peek();
            stack.push(i);
        }
        return res;
    }

    private int[] prevGreaterElements(int[] nums){
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i])
                stack.pop();
            res[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return res;
    }

    @Test
    public void t1(){
        int[] arr = new int[]{1,3,3};
        //ArrayUtil.print(this.nextSmallerElements(arr));
        System.out.println(this.subArrayRanges(arr));
    }
    @Test
    public void t2(){
        int[] arr = new int[]{4,-2,-3,4,1};
        //ArrayUtil.print(this.nextSmallerElements(arr));
        System.out.println(this.subArrayRanges(arr));
    }
}
