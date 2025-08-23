package leetCode;

import org.junit.jupiter.api.Test;

public class JumpGame_II_45 {
    public int jump(int[] nums) {
        int count=0;
        int lastJump=0;
        int coverage=0;
        if(nums.length==1)
            return 0;
        for(int i=0;i<nums.length;i++){
            coverage=Math.max(coverage, i+nums[i]);
            if(i==lastJump){
                lastJump=coverage;
                count++;
                if(coverage>=nums.length-1)
                    return count;
            }
        }
        return count;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{2,3,1,1,4};
        System.out.println(this.jump(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{2,3,0,1,4};
        System.out.println(this.jump(arr));
    }
}
