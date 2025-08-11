package com.strivers.recursion;

import org.junit.jupiter.api.Test;

public class SumOfNumbers {
    public int sum(int n,int sum){
        if(n<1)
            return sum;
        sum+=n;
        n--;
        return sum(n,sum);
    }

    public int sum2(int n){
        if(n==0)
            return 0;
        return n+sum2(n-1);
    }

    @Test
    public void tc1(){
        System.out.println(sum(5,0));
        System.out.println(sum2(5));
    }
}
