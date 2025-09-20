package leetCode.dynamicprogramming;

import org.junit.jupiter.api.Test;

public class _322_Coin_Change {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];

        //Initialize the dp with Integer.max;
        //dp[0] is 0 because we need 0 coins to make 0 amount
        for(int i=1;i<dp.length;i++)
            dp[i]=Integer.MAX_VALUE;

        for(int i=1;i<=amount;i++){
            for(int coin:coins){ //check the possibility with each coin for amount i
                if(coin<=i && dp[i-coin]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i], 1+dp[i-coin]);
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }

    @Test
    public void tc(){
        System.out.println(this.coinChange(new int[]{1,2,5},11));
    }
}
