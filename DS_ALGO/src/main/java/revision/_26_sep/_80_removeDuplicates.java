package revision._26_sep;

import org.junit.jupiter.api.Test;
import util.ArrayUtil;

public class _80_removeDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int i=1,j=1,count=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]) //adjacents are equal
                count++;
            else
                count=1; // For other number encountered reset the counter
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }

    @Test
    public void t1(){
        int[] arr = new int[]{0,0,1,1,1,1,2,3,3};
        System.out.println(this.removeDuplicates(arr));
    }
}
