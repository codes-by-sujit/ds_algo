package com.strivers.basicmath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class countDigits {

    public int count(int n){
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        return c;
    }

    @Test
    public void tc1(){
        int c=count(12345);
        Assertions.assertEquals(5,c);
    }
}
