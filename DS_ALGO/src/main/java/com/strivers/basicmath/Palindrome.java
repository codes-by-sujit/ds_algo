package com.strivers.basicmath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Palindrome {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                break;
            i++;j--;
        }
        return i>j;
    }

    @Test
    public void tc1(){
        int num = 1234321;
        Assertions.assertTrue(isPalindrome(num));
    }
    @Test
    public void tc2(){
        int num = 1;
        Assertions.assertTrue(isPalindrome(num));
    }
    @Test
    public void tc3(){
        int num = 123;
        Assertions.assertTrue(isPalindrome(num));
    }
}
