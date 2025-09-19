package leetCode.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class Calculator {
    int sign=1;
    public int calc(String str){
        Stack<Integer> operands=new Stack<>();
        Stack<Character> operators=new Stack<>();
        char prev = ' ';
        for(char c: str.toCharArray()){
            if(c=='-'){
                if(operands.isEmpty() || !Character.isDigit(prev)) {
                    sign = -1;
                    continue;
                }
            }
            if(Character.isDigit(c))
                handleDigit(c,operands,prev);
            else
                handleOperators(c,operators,prev);
            prev=c;
        }
        System.out.println(operands);
        System.out.println(operators);
        //System.out.println("result="+evaluate(operands,operators));
        return evaluate(operands,operators);
    }

    private void handleDigit(char c, Stack<Integer> operands, char prev){
        if(operands.isEmpty())
            operands.push(sign*Integer.valueOf(c+""));
        else{
            if(Character.isDigit(prev)){
                int curr=operands.pop();
                if(curr<0){
                    curr*=-1;
                    curr=curr*10+Integer.valueOf(c+"");
                    curr*=-1;
                } else{
                    curr=curr*10+Integer.valueOf(c+"");
                }
                operands.push(curr);
            } else{
                operands.push(sign*Integer.valueOf(c+""));
            }
        }
         sign=1;
    }

    private void handleOperators(char c, Stack<Character> operators, char prev){
        operators.push(c);
    }

    private int evaluate(Stack<Integer> operands,Stack<Character> operators){
        int sum=0;
        while(!operators.isEmpty()){
            int b=operands.pop();
            int a=operands.pop();
            char op=operators.pop();
            switch (op){
                case '+':{
                    sum=a+b; break;
                }
                case '-': {
                    sum=a-b;break;
                }
            }
            operands.push(sum);
        }
        return sum;
    }

    @Test
    public void tc1(){
        //System.out.println(this.calc("12+56"));
        System.out.println(this.calc("-5--7"));
    }
}
