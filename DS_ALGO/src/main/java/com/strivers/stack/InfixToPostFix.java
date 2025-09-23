package com.strivers.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class InfixToPostFix {

    public String convertToPostfix(String expr){
        StringBuffer result=new StringBuffer("");

        //To hold the operators we need to follow stack
        Stack<Character> stack=new Stack<>();
        char[] exp=expr.toCharArray();
        //Parse each char of expression
        for(int i=0;i<exp.length;i++){
            char c= exp[i];
            //if it's an operand just add to result;
            if(Character.isLetterOrDigit(c)){
                result.append(c);
            } else { //if it's an operator
                if (c == '(') stack.push(c); // for '(' -> push to stack
                else if (c == ')') { //pop all operators till it finds the '('
                    while (stack.peek() != '(' && !stack.isEmpty()) {
                        result.append(stack.pop());
                    }
                    stack.pop(); // pop the '(' as the expression inside the brackets are processed
                } else if(stack.isEmpty()){
                    stack.push(c);
                }else {
                    if(precedense(c)>precedense(stack.peek())){ //if larger precedence -> push to stack
                        stack.push(c);
                    } else{
                        System.out.println(stack);
                        while(!stack.isEmpty() && (precedense(c)<precedense(stack.peek()) || stack.peek()==')')){
                            result.append(stack.pop()); //pop the operator having high precedence than current operator
                        }
                        stack.push(c);
                    }
                }
            }
        }
        //process the leftover operators in stack
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result.toString();
    }

    //Method to return the precedence of operator
    //BADMAS
    private int precedense(char opr){
        switch(opr){
            case '-': return 1;
            case '+': return 2;
            case '*': return 3;
            case '/': return 4;
            case '^': return 5;
            default: return -1;
        }
    }

    @Test
    public void tc1(){
        String expr="a+b*c";
        System.out.println(this.convertToPostfix(expr));
    }

    @Test
    public void tc2(){
        String expr=" (p+q)*(m-n)";
        System.out.println(this.convertToPostfix(expr));
    }

    @Test
    public void tc3(){
        String expr="a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(this.convertToPostfix(expr));
    }
}
