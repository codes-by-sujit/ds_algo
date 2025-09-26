package revision._26_sep;

import org.junit.jupiter.api.Test;

public class _26_removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        if(nums.length==1) return 1;
        while(j<nums.length){
            if (nums[i]!=nums[j]){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            j++;
        }
        return i+1;
    }

    @Test
    public void t1(){
        int[] arr = new int[]{1,1,2,3,3,4,4};
        System.out.println(this.removeDuplicates(arr));
    }

    @Test
    public void t2(){
        int[] arr = new int[]{1,2,3,4};
        System.out.println(this.removeDuplicates(arr));
    }
    @Test
    public void t3(){
        int[] arr = new int[]{1};
        System.out.println(this.removeDuplicates(arr));
    }
    @Test
    public void t4(){
        int[] arr = new int[]{1,1,1,1,1,1,1,1,1};
        System.out.println(this.removeDuplicates(arr));
    }
}
