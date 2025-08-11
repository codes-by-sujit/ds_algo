package com.strivers.basicmath;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {

    private boolean isArmstrong(int n){
        int sum=0;
        int actual = n;
        List<Integer> digits = new ArrayList<>();
        while(n!=0){
            digits.add(n%10);
            n=n/10;
        }
        for(int i:digits){
            sum+=Math.pow(i, digits.size());
        }
        return sum==actual;
    }

    @Test
    public void tc(){
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(566));
    }
}
