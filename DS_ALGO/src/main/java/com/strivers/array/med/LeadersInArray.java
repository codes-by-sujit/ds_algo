package com.strivers.array.med;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    private int[] findLeaders(int[] arr){
        List<Integer> leaders = new ArrayList<>();
        if(arr.length==1){
            return arr;
        }
        int currLeader = arr[arr.length-1];
        leaders.add(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(currLeader<arr[i]){
                leaders.add(arr[i]);
                currLeader=arr[i];
            }
        }
        leaders.sort(Collections.reverseOrder());
        return ArrayUtil.toArray(leaders);
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{10, 22, 12, 3, 0, 6};
        ArrayUtil.print(findLeaders(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{4,7,1,0};
        ArrayUtil.print(findLeaders(arr));
    }
}
