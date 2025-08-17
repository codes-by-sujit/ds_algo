package com.strivers.array.hard;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    private List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> temp = new ArrayList<>();
            if (i==1) {
                temp.add(1);
            } else if(i==2){
                temp.add(1);
                temp.add(1);
            } else {
                temp.add(1);
                int k=1;
                for(int j=1;j<i;j++){
                    k=k*(i-j);
                    k=k/j;
                    temp.add(k);
                }
            }
            ans.add(temp);
        }
        return ans;
    }

    @Test
    public void tc(){
        List<List<Integer>> res = generate(6);
        System.out.println(res);
    }
}
