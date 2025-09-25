package leetCode.stack;

import org.junit.jupiter.api.Test;
import util.ArrayUtil;

import java.util.Stack;

public class _85_MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        int max=Integer.MIN_VALUE;
        int[] temp=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                temp[j]= matrix[i][j]=='0'?0:temp[j]+1;
            }
            ArrayUtil.print(temp);
            System.out.println("MAX Area="+this.maxArea(temp));
            max=Math.max(max, this.maxArea(temp));
        }
        return max;
    }

    private int maxArea(int[] arr){
        int[] nextNums=this.nextSmallerRight(arr);
        int[] prevNums=this.nextSmallerLeft(arr);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, ((nextNums[i]-prevNums[i])-1)*arr[i]);
        }
        return max;
    }

    private int[] nextSmallerRight(int[] arr){
        int[] res= new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
                stack.pop();
            res[i]=stack.isEmpty()?arr.length:stack.peek();
            stack.push(i);
        }
        return res;
    }

    private int[] nextSmallerLeft(int[] arr){
        int[] res= new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i])
                stack.pop();
            res[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return res;
    }

    @Test
    public void tc1(){
        char[][] mat=new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(this.maximalRectangle(mat));
    }

    @Test
    public void tc2(){
        char[][] mat=new char[][]{{'1'}};
        System.out.println(this.maximalRectangle(mat));
    }
}
