package com.strivers.stack;

import org.junit.jupiter.api.Test;

/**
 * Steps
 * --------
 * 1) Reverse the String
 * 2) Replace '(' with ')' and vice versa
 * 3) Convert to postfix
 * 4) reverse string
 */


public class InFixToPrefix {
    private String toPrefix(String expr){
        String reverse=new StringBuilder(expr).reverse().toString();
        StringBuilder temp=new StringBuilder();
        for(char c: reverse.toCharArray()){
            if(c=='(')  temp.append(')');
            else if(c==')') temp.append('(');
            else temp.append(c);
        }
        String postfix=new InfixToPostFix().convertToPostfix(temp.toString());
        return new StringBuilder(postfix).reverse().toString();
    }

    @Test
    public void tc1(){
        String expr="(A+B)*(C+D)";
        System.out.println(this.toPrefix(expr));
    }
}
