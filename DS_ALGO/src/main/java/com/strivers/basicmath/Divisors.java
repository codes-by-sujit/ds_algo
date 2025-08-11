package com.strivers.basicmath;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Divisors {

    private List<Integer> getDivisors(int n){
        List<Integer> divisors = new ArrayList();
        int sqrt=(int)Math.sqrt(n);
        for(int i=1;i<=sqrt;i++){
            if(n%i==0){
                divisors.add(i);
                if(i!=n/i)
                    divisors.add(n/i);
            }
        }
        return divisors;
    }

    @Test
    public void tc(){
        System.out.println(getDivisors(10));
        System.out.println(getDivisors(36));
    }
}
