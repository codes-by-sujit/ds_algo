package revision.aug_23;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayZeroSum {
    private int get(int[] arr){
        int max=0;
        Map<Integer,Integer> prefixSum=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                max=i+1;
            }
            if(prefixSum.containsKey(sum)){
                int length=i-prefixSum.get(sum);
                max=Math.max(max,length);

            } else{
                prefixSum.put(sum,i);
            }
        }
        return max;
    }

    @Test
    public void test(){
        int[] arr = new int[]{9, -3, 3, -1, 6, -5};
        System.out.println(this.get(arr));
    }

    @Test
    public void test2(){
        int[] arr = new int[]{6, -2, 2, -8, 1, 7, 4, -10};
        System.out.println(this.get(arr));
    }
}
