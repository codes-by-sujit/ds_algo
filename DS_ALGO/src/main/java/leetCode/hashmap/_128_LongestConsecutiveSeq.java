package leetCode.hashmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class _128_LongestConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> map=new HashMap<>();
        int maxLength=Integer.MIN_VALUE;
        if(nums.length==0)
            return 0;
        for(int n:nums){
            map.put(n,false);
        }
        for(int n:nums){
             maxLength=Math.max(maxLength, (nextConsLength(n, map)+prevConsLength(n,map)-1));
        }
        return maxLength;
    }

    private int nextConsLength(int num, Map<Integer,Boolean> map){
        int length=1;
        map.put(num,true);
        num++;
        while(map.containsKey(num) && !map.get(num)) {
             length++;
             map.put(num,true);
             num++;
        }
        return length;
    }

    private int prevConsLength(int num, Map<Integer,Boolean> map){
        int length=1;
        map.put(num,true);
        num--;
        while(map.containsKey(num) && !map.get(num)) {
            length++;
            map.put(num,true);
            num--;
        }
        return length;
    }

    @Test
    public void tc1(){
        int[] nums= new int[]{100,4,200,1,3,2};
        System.out.println(this.longestConsecutive(nums));
    }


}
