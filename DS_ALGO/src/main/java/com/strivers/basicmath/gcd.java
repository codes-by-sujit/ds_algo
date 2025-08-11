package com.strivers.basicmath;

import org.junit.jupiter.api.Test;

public class gcd {

    private int findGcd(int a, int b){
        if(a>=b){
            if(b==0)
                return a;
            else if(b==1)
                return 1;
            else
                return findGcd(b,a%b);
        } else{
            return findGcd(b,a);
        }
    }

    @Test
    public void tc(){
        System.out.println(findGcd(20,15));
        System.out.println(findGcd(15,20));
        System.out.println(findGcd(9,12));
        System.out.println(findGcd(17,25));
        System.out.println(findGcd(30,45));
    }
}
