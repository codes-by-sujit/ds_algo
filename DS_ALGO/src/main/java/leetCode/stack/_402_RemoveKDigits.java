package leetCode.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class _402_RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        int i=0;
        //Edge Cases
        // if k=0 : no digit can be removed -> return the number unchanged
        if(k==0) return num;
        if(k==num.length()) return "0";
        //if k=num.length then all digits can be removed so return 0
        //parse from left to right to form the number
        for(;i<num.length();i++){
            if(k==0)
                break;
            //To maintain strict non-decreasing order Start removing if
            // K>0 and top >= num[i]
            while(!stack.isEmpty() && k>0 && stack.peek()>num.charAt(i)){
                stack.pop();
                k--;
            }
            //System.out.println(stack+"  "+num.charAt(i));
            //push the current digit to stack
            stack.push(num.charAt(i));
        }
        //If repeated digits occurs then k can't be reduced. so reduce it after all digit parsed.
        while(k>0){
            stack.pop();
            k--;
        }
        while(k==0 && i<num.length()){
            stack.push(num.charAt(i));
            i++;
        }
        return this.getReverseNum(stack);
    }

    private String getReverseNum(Stack<Character> stack){
        StringBuilder s= new StringBuilder();
        while(!stack.isEmpty()){
            char top=stack.pop();
            s.append(top);
        }
        StringBuilder st= s.reverse();
        //remove all the 0 at the head
        while(st.length()>1 && st.charAt(0)=='0')
            st.deleteCharAt(0);
        return st.toString();
    }

    @Test
    public void tc1(){
        String s="1432219";
        System.out.println(this.removeKdigits(s,3));
    }

    @Test
    public void tc2(){
        String s="10010";
        System.out.println(this.removeKdigits(s,3));
    }

    @Test
    public void tc3(){
        String s="112";
        System.out.println(this.removeKdigits(s,1));
    }
}
