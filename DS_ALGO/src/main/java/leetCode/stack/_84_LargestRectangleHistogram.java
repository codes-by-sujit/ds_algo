package leetCode.stack;

import java.util.Stack;

public class _84_LargestRectangleHistogram {
    public int largestRectangleArea(int[] heights) {
        int[] psn = this.prevSmallNumbers(heights);
        int[] nsn=this.nextSmallNumbers(heights);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            max = Math.max(((nsn[i]-psn[i])-1)*heights[i], max);
        }
        return max;
    }

    private int[] prevSmallNumbers(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i])
                stack.pop();
            res[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return res;
    }

    private int[] nextSmallNumbers(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
                stack.pop();
            res[i]=stack.isEmpty()?arr.length:stack.peek();
            stack.push(i);
        }
        return res;
    }
}
