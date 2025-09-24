package leetCode.stack;

import org.junit.jupiter.api.Test;
import util.ArrayUtil;

public class _42_TrappingRainWater {
    public int trap(int[] height) {
        int[] temp=new int[height.length];
        int max=Integer.MIN_VALUE;
        int sum=0;

        //parse from left to right and store the MAX value seen from left
        for(int i=0;i<height.length;i++){
            temp[i]=Math.max(height[i],max);
            max=temp[i];
        }
        max=Integer.MIN_VALUE;
        //parse from right to left to fetch MAX right element and min between before
        for(int i=height.length-1;i>=0;i--){
            temp[i]=Math.min(temp[i],Math.max(max,height[i]));
            max=temp[i];
            temp[i]=temp[i]-height[i];
            if(temp[i]>0)
                sum+=temp[i];
        }

        return sum;
    }

    @Test
    public void tc1(){
        int[] arr=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(this.trap(arr));
    }
}
