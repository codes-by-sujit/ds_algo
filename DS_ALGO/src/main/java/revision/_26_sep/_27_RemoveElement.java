package revision._26_sep;

import org.junit.jupiter.api.Test;

public class _27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[i]==val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
            } else{
                i++;
            }
        }
        return j+1;
    }

    private void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    @Test
    public void tc1(){
        int[] arr= new int[]{3,2,2,3};
        System.out.println(this.removeElement(arr,3));
    }

    @Test
    public void tc2(){
        int[] arr= new int[]{0,1,2,2,3,0,4,2};
        System.out.println(this.removeElement(arr,2));
    }
}
