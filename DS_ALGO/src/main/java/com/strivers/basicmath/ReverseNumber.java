package com.strivers.basicmath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseNumber {

    public int reverse(int x) {
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;
        Long rev=0l;
        boolean isSigned = x < 0;
        x=Math.abs(x);
        while (x>0){
            rev=rev*10+x%10;
            x=x/10;
        }
        rev=isSigned?-1*rev:rev;
        return rev>MAX||rev<MIN?0:rev.intValue();
    }

    @Test
    public void tc1(){
        int num=12345;
        int rev=reverse(num);
        Assertions.assertEquals(54321, rev);
    }

    @Test
    public void tc2(){
        int num=2147483647;
        int rev=reverse(num);
        Assertions.assertEquals(0, rev);
    }

    @Test
    public void tc3(){
        int num=-2147483648;
        int rev=reverse(num);
        Assertions.assertEquals(0, rev);
    }

    @Test
    public void tc4(){
        int num=-123;
        int rev=reverse(num);
        System.out.println(rev);
        Assertions.assertEquals(-321, rev);
    }

    @Test
    public void tc5(){
        int num=10400;
        int rev=reverse(num);
        System.out.println(rev);
        Assertions.assertEquals(401, rev);
    }

}
