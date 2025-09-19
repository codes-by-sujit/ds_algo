package leetCode.dynamicprogramming;

import org.junit.jupiter.api.Test;

public class _198_HouseRobber {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(dp[i]==0){
                int home1=i-2>=0?dp[i-2]:0;
                int home2=i-3>=0?dp[i-3]:0;
                dp[i]=nums[i]+Math.max(home1,home2);
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }

    @Test
    public void tc1(){
        int[] nums=new int[]{2,7,9,3,1};
        System.out.println(this.rob(nums));
    }

    @Test
    public void tc2(){
        int[] nums=new int[]{2,1,1,2};
        System.out.println(this.rob(nums));
    }
}
