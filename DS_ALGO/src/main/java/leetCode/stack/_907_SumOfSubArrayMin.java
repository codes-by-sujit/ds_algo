package leetCode.stack;

import org.junit.jupiter.api.Test;
import util.ArrayUtil;

import java.util.Stack;

public class _907_SumOfSubArrayMin {
    public int sumSubarrayMins(int[] arr) {
        //store next small nums
        int[] nse=new int[arr.length];

        //store previous small nums
        int[] pse=new int[arr.length];

        //Stack to keep greater elements
        Stack<Integer> stack = new Stack<>();

        long sum=0;
        int mod=1000000007;

        //Calculate the previous smaller element
        // iterate from left to right
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
                stack.pop();
            pse[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        //Clean up the stack for further usage
        stack.clear();
        //calculate the next small element
        //Iterate from right to left
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i])
                stack.pop();
            nse[i]=stack.empty()?arr.length:stack.peek();
            stack.push(i);
        }
        // (i-pse[i]*nse[i]-i)*arr[i]
        for(int i=0;i<arr.length;i++){
            long prevsmall=i-pse[i];
            long nextsmall=nse[i]-i;
            long totalWays = prevsmall*nextsmall;
            long totalSum= totalWays*arr[i];
            sum= (sum+totalSum)%mod;
        }
        return (int)sum;
    }

    @Test
    public void t1(){
        int[] arr = new int[]{3,1,2,4};
        System.out.println("SUM="+this.sumSubarrayMins(arr));
    }
}
