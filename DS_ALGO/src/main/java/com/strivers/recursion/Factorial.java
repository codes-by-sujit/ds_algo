package com.strivers.recursion;

import org.junit.jupiter.api.Test;

public class Factorial {

    private int factorial(int n){
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }

    @Test
    public void tc(){
        System.out.println(factorial(4));
    }
}
