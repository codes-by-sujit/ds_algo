package array.twopointer;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.*;

public class remove_zeros {
    public void moveZeroes(int[] nums) {
        if(nums.length>1){
            int i=0;
            int j=i+1;
            while(j<nums.length){
                if(nums[i]!=0){
                    i++;
                } else{
                    if(nums[j]!=0){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        i++;
                    }
                }
                j++;
            }
        }
    }

    @Test
    public void tc1(){
        int[] nums= new int[]{1,0,0,3,12};
        this.moveZeroes(nums);
        assertEquals(nums[2],12);
    }

    @Testable
    public void tc2(){
        int[] nums= new int[]{1,2,3,4};
        this.moveZeroes(nums);
        assertEquals(nums[2],3);
    }

    @Test
    public void tc3(){
        int[] nums= new int[]{0,0,1};
        this.moveZeroes(nums);
        assertEquals(nums[0],1);
        assertEquals(nums[2],0);
    }
    @Test
    public void tc4(){
        int[] nums= new int[]{0};
        this.moveZeroes(nums);
        assertEquals(nums[0],0);
    }


}
