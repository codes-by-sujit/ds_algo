package revision._14_sep;

public class _35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int pos=-1;
        int size=nums.length;
        int start=0;
        int end=size-1;
        //if the target is highest
        if(target>nums[end])
            return end+1;
        //if the number is lowest
        if(target<nums[start])
            return start;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>=target){
                pos=mid;
                end=mid-1;
            } else{
                start=mid+1;
            }
        }
        return pos;
    }
}
