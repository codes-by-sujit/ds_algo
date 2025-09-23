package com.strivers.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class PostfixToInfix {
    private String convert(String expr){
        Stack<String> stack=new Stack<>();
        for(char c: expr.toCharArray()){
            if(Character.isLetterOrDigit(c)) stack.push(c+"");
            else{
                String op2=stack.pop();
                String op1=stack.pop();
                stack.push("("+op1+c+op2+")");
            }
        }
        return stack.pop();
    }

    @Test
    public void tc1(){
        String str1="pq+mn-*";
        String str2="abcd^e-fgh*+^*+i-";
        System.out.println(this.convert(str1));
        System.out.println(this.convert(str2));
        System.out.println(this.convert("(A+B)*(C+D)"));
    }

}
