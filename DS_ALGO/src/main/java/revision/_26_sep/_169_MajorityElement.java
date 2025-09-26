package revision._26_sep;

public class _169_MajorityElement {

    public int majorityElement(int[] nums) {
        int count=0;
        int mj=nums[0];
        if(nums.length==1) return mj;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==mj)
                count++;
            else
                count--;
            if(count==-1) {
                mj=nums[i];
                count=1;
            }
        }
        return mj;
    }
}
