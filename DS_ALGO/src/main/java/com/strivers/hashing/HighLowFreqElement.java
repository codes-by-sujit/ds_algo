package com.strivers.hashing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HighLowFreqElement {

    private void print(int[] arr){
        int maxOccr = Integer.MIN_VALUE ;
        int minOccr = Integer.MAX_VALUE;
        int maxNum = 0;
        int minNum=0;
        Map<Integer,Integer> occuranceMap = new HashMap();
        for(int i: arr) {
            occuranceMap.put(i, occuranceMap.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> e:occuranceMap.entrySet()){
            if(Math.min(e.getValue(),minOccr)<minOccr){
                minOccr=e.getValue();
                minNum=e.getKey();
            }
            if(Math.max(e.getValue(),maxOccr)>maxOccr){
                maxOccr=e.getValue();
                maxNum=e.getKey();
            }
        }
        System.out.println("MIN Num="+minNum+" with occurance:"+minOccr);
        System.out.println("MAX Num="+maxNum+" with occurance:"+maxOccr);
    }

    @Test
    public void tc(){
        int[] arr=new int[]{2,5,3,5,4,2,5,3};
        print(arr);
    }
}
