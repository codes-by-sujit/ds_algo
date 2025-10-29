package leetCode.recursion;

import org.junit.jupiter.api.Test;

public class _8_string_to_integer {
    public int myAtoi(String s) {
        if(s.isEmpty())
            return 0;
        //Trim the String to remove the head & tail spaces then convert to chararray.
        char[] chars=s.trim().toCharArray();
        int sign=1;
        long num=0;
        for(int i=0;i<chars.length;i++){
            //The first char should be a digit or sign
            if(i==0 && (chars[i]=='-' || chars[i]=='+')) {
                sign = chars[i]=='-'?-1:1;
            } else if(Character.isDigit(chars[i])){
                num=num*10+Integer.parseInt(chars[i]+"");
                if(num>Integer.MAX_VALUE || sign*num<Integer.MIN_VALUE)
                    break;
            } else{
                break;
            }
        }
        num=sign*num;
        if(num<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if(num>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return (int)num;
    }

    @Test
    void test_1(){
        System.out.println(myAtoi("42"));
    }
    @Test
    void test_2(){
        System.out.println(myAtoi("   42   "));
    }

    @Test
    void test_3(){
        System.out.println(myAtoi("042"));
    }

    @Test
    void test_4(){
        System.out.println(myAtoi("+1"));
    }
    @Test
    void test_5(){
        System.out.println(myAtoi("  -45ewer"));
    }
    @Test
    void test_7(){
        System.out.println(myAtoi("-+12"));
    }

    @Test
    void test_6(){
        System.out.println(myAtoi("-9223372036854775808"));
    }
}
