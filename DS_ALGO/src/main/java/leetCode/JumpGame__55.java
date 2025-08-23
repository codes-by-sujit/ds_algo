package leetCode;

import org.junit.jupiter.api.Test;

public class JumpGame__55 {
    public boolean canJump(int[] nums) {
        int n=nums.length-1;
        int f=n;
        for(int i=n-1;i>=0;i--){
            if(i+nums[i]>=f){
                f=i;
            }
        }
        return f==0;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{2,3,1,1,4};
        System.out.println(this.canJump(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{3,2,1,0,4};
        System.out.println(this.canJump(arr));
    }
}
