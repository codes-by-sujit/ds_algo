package revision._15_sep;

public class _153_MinInSortedRotatedArray {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int size=nums.length;
        if(size==1)
            return nums[0];
        int start=0;
        int end=size-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[start]<nums[mid]) { //left part is sorted
                min=Math.min(min, nums[start]);
                start=mid+1; // Go to unknown right part
            }
            if(nums[mid]<nums[end]){ // right part is sorted
                min=Math.min(min, nums[mid]);
                end=mid-1; // Go to unknown left part;
            }
        }
        return min;
    }
}
