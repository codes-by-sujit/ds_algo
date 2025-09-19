package leetCode.dynamicprogramming;

import org.junit.jupiter.api.Test;

public class _70_ClimbingStairs {
    public int climbStairs(int n) {
         if(n==1) return 1;
         if(n==2) return 1;
         int[] dp=new int[n+1];
         dp[1]=1;
         dp[2]=2;
         for(int i=3;i<=n;i++){
             if(dp[i]==0){
                 dp[i]=dp[i-2]+dp[i-1];
             }
         }
         return dp[n];
    }

    @Test
    public void tc1(){
        System.out.println(this.climbStairs((int) Math.pow(10,8)));
    }
}
