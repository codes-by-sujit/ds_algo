package com.strivers.recursion;

import org.junit.jupiter.api.Test;

public class StringPallindrome {
    private boolean isPallindrome(String s){
        return isPallindrome(s.toCharArray(),0,s.length()-1);
    }
    private boolean isPallindrome(char[] s,int i, int j){
        if(i>=j)
            return true;
        if(s[i]!=s[j])
            return false;
        i++;j--;
        return isPallindrome(s,i,j);
    }

    @Test
    public void tc(){
        System.out.println(isPallindrome("abcba"));
        System.out.println(isPallindrome("abcdba"));
        System.out.println(isPallindrome("a"));
        System.out.println(isPallindrome("abc"));
    }
}
