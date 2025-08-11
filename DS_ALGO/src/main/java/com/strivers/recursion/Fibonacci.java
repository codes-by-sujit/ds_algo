package com.strivers.recursion;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    Map<Integer,Integer> mem = new HashMap<>();

    private int fib(int n){
        if(mem.get(n)!=null)
            return mem.get(n);
        if(n==0) {
            mem.put(0,0);
            return 0;
        }
        else if(n==1) {
            mem.put(1,1);
            return 1;
        }
        else{
            mem.put(n-1,fib(n-1));
            mem.put(n-2, fib(n-2));
            int res=mem.get(n-1)+mem.get(n-2);
            System.out.print(" "+res);
            return res;
        }
    }

    @Test
    public void tc(){
        System.out.println("    "+fib(30));
    }
}
