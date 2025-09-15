package leetCode.hashmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class _219_ContainsDuplicatesII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int prevIndex=map.get(nums[i]);
                if(Math.abs(prevIndex-i)<=k)
                    return true;
                else
                    map.put(nums[i],i);
            } else{
                map.put(nums[i],i);
            }
        }
        return false;
    }

    @Test
    public void tc1(){
        int[] nums=new int[]{1,2,3,1};
        System.out.println(this.containsNearbyDuplicate(nums,3));
    }
    @Test
    public void tc2(){
        int[] nums=new int[]{1,0,2,1};
        System.out.println(this.containsNearbyDuplicate(nums,1));
    }
}
