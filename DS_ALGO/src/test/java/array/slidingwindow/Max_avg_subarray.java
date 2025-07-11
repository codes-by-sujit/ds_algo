package array.slidingwindow;

import org.junit.jupiter.api.Test;

public class Max_avg_subarray {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1){
            return nums[0];
        }
        double maxAvg=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        double currSum=0;
        while(j<nums.length){
            currSum+=nums[j];
            if((j-i)+1==k){
                maxAvg=Math.max(maxAvg, currSum/k);
                currSum-=nums[i];
                i++;
            }
            j++;
        }
        return maxAvg;
    }

    @Test
    public void test_valid(){
        int[] nums = new int[]{1,3,2,5};
        int k = 2;
        System.out.println(findMaxAverage(nums,k));
    }

    @Test
    public void test_valid2(){
        int[] nums = new int[]{1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums,k));
    }

    @Test
    public void tc3(){
        int[] nums = new int[]{5};
        int k = 1;
        System.out.println(findMaxAverage(nums,k));
    }

    @Test
    public void tc4(){
        int[] nums = new int[]{5,-5,0};
        int k = 2;
        System.out.println(findMaxAverage(nums,k));
    }

    @Test
    public void tc5(){
        int[] nums = new int[]{0,4,0,3,2};
        int k = 1;
        System.out.println(findMaxAverage(nums,k));
    }

    @Test
    public void tc6(){
        int[] nums = new int[]{8860,-853,6534,4477,-4589,8646,-6155,-5577,-1656,-5779,-2619,-8604,-1358,-8009,4983,7063,3104,-1560,4080,2763,5616,-2375,2848,1394,-7173,-5225,-8244,-809,8025,-4072,-4391,-9579,1407,6700,2421,-6685,5481,-1732,-8892,-6645,3077,3287,-4149,8701,-4393,-9070,-1777,2237,-3253,-506,-4931,-7366,-8132,5406,-6300,-275,-1908,67,3569,1433,-7262,-437,8303,4498,-379,3054,-6285,4203,6908,4433,3077,2288,9733,-8067,3007,9725,9669,1362,-2561,-4225,5442,-9006,-429,160,-9234,-4444,3586,-5711,-9506,-79,-4418,-4348,-5891};
        int k = 93;
        System.out.println(findMaxAverage(nums,k));
    }
}

