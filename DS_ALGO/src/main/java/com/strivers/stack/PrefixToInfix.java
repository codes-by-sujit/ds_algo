package com.strivers.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class PrefixToInfix {
    private String convert(String expr){
        Stack<String> stack=new Stack<>();
        String rev=new StringBuilder(expr).reverse().toString();
        for(char c: rev.toCharArray()){
            if(Character.isLetterOrDigit(c)) stack.push(c+"");
            else{
                String op1=stack.pop();
                String op2=stack.pop();
                stack.push("("+op1+c+op2+")");
            }
        }
        return stack.pop();
    }

    @Test
    public void tc1(){
        System.out.println(this.convert("*+AB+CD"));
    }
}
