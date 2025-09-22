package leetCode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class _300_longestIncrSubsq {
    public int lengthOfLIS(int[] nums) {
        //Creating the temporary list which stores the elements in sorted order
        List<Integer> temp=new ArrayList<>();
        temp.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int top=temp.get(temp.size()-1);
            //If the current element is greater than the element in list then add it to list
            //This signifies the current element is greater than previous (Increasing order)
            if(top<curr){
                temp.add(nums[i]);
            } else if(top>curr){
                //Find the index of the lower bound
                int lowerBoundIndex=this.lowerBoundIndex(temp.toArray(new Integer[0]),nums[i]);
                //Replace the lower bound with current element
                temp.set(lowerBoundIndex,curr);
            }
            System.out.println("Current temp="+temp);
        }
        return temp.size();
    }

    private int lowerBoundIndex(Integer[] arr, int target){
        int lower=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>=target){
                lower=mid;
                end=mid-1;
            } else{
                start=mid+1;
            }
        }
        return lower;
    }

    @Test
    public void tc1(){
        int[] arr=new int[]{10,9,2,5,3,7,101,18};
        System.out.println(this.lengthOfLIS(arr));
    }

    @Test
    public void tc2(){
        int[] arr=new int[]{4,10,4,3,8,9};
        System.out.println(this.lengthOfLIS(arr));
    }
}
