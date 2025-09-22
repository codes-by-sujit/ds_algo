package leetCode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _120_Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size=triangle.size();
        int[][] dp=new int[size+1][size+1];

        //Initialize the last row of DP to 0s
        //For bottom-up approach
        for(int i=0;i<=size;i++){
            dp[size][i]=0;
        }

        for(int i=size-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                //if dp[i][j] is the current element then
                //dp[i-1][j] is bottom and
                //dp[i-1][j+1] is bottom right
                dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        //Return the top most of dp which is summation of all minimum
        return dp[0][0];
    }

    @Test
    public void tc1(){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(new Integer[] {2}));
        triangle.add(Arrays.asList(new Integer[] {3,4}));
        triangle.add(Arrays.asList(new Integer[] {6,5,7}));
        triangle.add(Arrays.asList(new Integer[] {4,1,8,3}));
        System.out.println(this.minimumTotal(triangle));
    }

    private void printArray(int[][] arr){
        System.out.println("------------------------");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" | ");
            }
            System.out.println(" ");
        }
        System.out.println("------------------------");
    }
}
