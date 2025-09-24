package leetCode;

import util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class ProductArrayExceptSelf__238 {
    public int[] productExceptSelf(int[] nums) {
        int[] res= new int[nums.length];
        int n=res.length;
        int m=1;
        //calculate right sides
        for(int i=n-1;i>=0;i--){
            if (i != n - 1) {
                m *= nums[i + 1];
            }
            res[i]=m;
        }
        m=1;
        //calculate left sides
        for(int i=0;i<n;i++){
            if(i==0)
                res[i]*=m;
            else{
                res[i]*=m*nums[i-1];
                m*=nums[i-1];
            }
        }
        return res;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{1,2,3,4};
        ArrayUtil.print(this.productExceptSelf(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{-1,1,0,-3,3};
        ArrayUtil.print(this.productExceptSelf(arr));
    }
}
