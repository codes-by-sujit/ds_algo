package revision._15_sep;

public class _34_FindFirstlastPositionInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
            return new int[]{-1,-1};
        if(nums.length==1)
            return nums[0]==target?new int[]{0,0}:new int[]{-1,-1};
        return new int[]{findFirst(nums,target),findLast(nums,target)};
    }

    private int findFirst(int[] nums, int target){
        int size=nums.length;
        int start=0;
        int end=size-1;
        int pos=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<=nums[mid]){
                if(target==nums[mid])
                    pos=mid; //Save the current position
                end=mid-1; // Go further left to find the first position.
            } else{
                start=mid+1;
            }
        }
        return pos;
    }

    private int findLast(int[] nums, int target){
        int size=nums.length;
        int start=0;
        int end=size-1;
        int pos=-1;
        while(start<=end) {
            int mid=(start+end)/2;
            if(target>=nums[mid]){
                if(target==nums[mid])
                    pos=mid; //Save the current position
                start=mid+1; // Go further right to find the first position.
            } else{
                end=mid-1;
            }
        }
        return pos;
    }
}
