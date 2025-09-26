package revision._26_sep;

public class _55_JumpGame {
    public boolean canJump(int[] nums) {
        int destination=nums.length-1;
        if(nums.length==1){
            return nums[0]>0;
        }
        for(int i=nums.length-2;i>=0;i--){
            //can we reach destination from current position ?
            if(i+nums[i]>=destination){
                destination=i; // reduce the destination to the current index. It means come down to the current stair.
            }
        }
        return destination==0; // it means we reached the first position
    }
}
