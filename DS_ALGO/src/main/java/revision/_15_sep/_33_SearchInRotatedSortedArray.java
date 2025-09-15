package revision._15_sep;

public class _33_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int size=nums.length;
        if(size==1)
            return target==nums[0]?0:-1;
        int start=0;
        int end=size-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[start]<=nums[mid]){ //check if left part is sorted
                if(nums[start]<=target && target<=nums[mid]) //check if target falls in the sorted part
                    end=mid-1;
                else //otherwise check target in unknown part
                    start=mid+1;
            }
            if(nums[mid]<=nums[end]){ //check if right part is sorted
                if(nums[mid]<=target && target<=nums[end]) //check if target falls in the sorted part
                    start=mid+1;
                else //otherwise check target in unknown part
                    end=mid-1;
            }
        }
        return -1;
    }
}
