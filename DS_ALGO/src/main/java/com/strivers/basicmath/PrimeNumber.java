package com.strivers.basicmath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumber {
    private boolean isPrimeNumber(int n){
        int sqrt = (int)Math.sqrt(n);
        for(int i=2;i<=sqrt;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    @Test
    public void tc1(){
        Assertions.assertTrue(isPrimeNumber(3));
        Assertions.assertTrue(isPrimeNumber(2));
        Assertions.assertFalse(isPrimeNumber(10));
        Assertions.assertFalse(isPrimeNumber(15));
        Assertions.assertTrue(isPrimeNumber(17));
    }
}
