package leetCode;

import org.junit.jupiter.api.Test;

public class _209_MinSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
       int min=Integer.MAX_VALUE;
       if(nums.length==1)
           return nums[0]>=target?1:0;
       int i=0,j=0;
       int sum=0;
       while(j<nums.length){
           sum+=nums[j];
           while(sum>=target){
               min=Math.min(min, (j-i)+1);
               sum-=nums[i];
               i++;
           }
           j++;
       }
       return min==Integer.MAX_VALUE?0:min;
    }

    @Test
    public void tc1(){
        int[] arr= new int[]{2,3,1,2,4,3};
        int target=7;
        System.out.println(this.minSubArrayLen(target,arr));
    }

    @Test
    public void tc2(){
        int[] arr= new int[]{1,4,4};
        int target=4;
        System.out.println(this.minSubArrayLen(target,arr));
    }

    @Test
    public void tc3(){
        int[] arr= new int[]{1,2,3,4,5};
        int target=11;
        System.out.println(this.minSubArrayLen(target,arr));
    }
}
