package com.strivers.revision.aug19;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    private List<List<Integer>> generate(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            List<Integer> temp = new ArrayList<>();
            if(i==1){
                temp.add(1);
            }else if(i==2){
                temp.add(1);
                temp.add(1);
            } else{
                 temp=getncr(i);
            }
            ans.add(temp);
        }
        return ans;
    }

    private List<Integer> getncr(int n){
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        int k=1;
        for(int j=1;j<n;j++){
            k=k*(n-j);
            k=k/j;
            ans.add(k);
        }
        return ans;
    }

    @Test
    public void tc(){
        System.out.println(this.generate(6));
    }
}
