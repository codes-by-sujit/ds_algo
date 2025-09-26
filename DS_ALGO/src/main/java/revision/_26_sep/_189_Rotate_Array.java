package revision._26_sep;

import org.junit.jupiter.api.Test;
import util.ArrayUtil;

public class _189_Rotate_Array {
    public void rotate(int[] nums, int k) {
        if(k>0) {
            this.reverse(nums, 0, nums.length - 1);
            this.reverse(nums, 0, (k%nums.length) - 1);
            this.reverse(nums, (k%nums.length), nums.length - 1);
        }
    }

    private void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    @Test
    public void t1(){
        int[] arr = new int[]{1,2,3,4,5,6,7};
        this.rotate(arr,3);
        ArrayUtil.print(arr);
    }
    @Test
    public void t2(){
        int[] arr = new int[]{-1};
        this.rotate(arr,2);
        ArrayUtil.print(arr);
    }

    @Test
    public void t3(){
        int[] arr = new int[]{-1,4};
        this.rotate(arr,15);
        ArrayUtil.print(arr);
    }
}
