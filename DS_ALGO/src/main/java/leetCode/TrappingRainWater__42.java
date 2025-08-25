package leetCode;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class TrappingRainWater__42 {
    public int trap(int[] height) {
        int res=0;
        int[] leftMax=new int[height.length];
        int[] rightMax= new int[height.length];
        int[] minArr = new int[height.length];

        for(int i=0;i<height.length;i++){
            if(i==0) {
                leftMax[0] = height[0];
                continue;
            }
            leftMax[i]=Math.max(leftMax[i-1],height[i]);

        }
        //ArrayUtil.print(leftMax);
        for(int i=height.length-1;i>=0;i--){
            if(i==height.length-1){
                rightMax[i]=height[height.length-1];
                continue;
            }
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        //ArrayUtil.print(rightMax);

        for(int i=0;i<height.length;i++){
             minArr[i]=Math.min(leftMax[i],rightMax[i]);
        }
        //ArrayUtil.print(minArr);
        for(int i=0;i<height.length;i++){
            res+=minArr[i]-height[i];
        }

        return res;

    }

    @Test
    public void tc(){
        int[] arr = new int[]{4,2,0,3,2,5};
        System.out.println("Total:"+this.trap(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Total:"+this.trap(arr));
    }
}
