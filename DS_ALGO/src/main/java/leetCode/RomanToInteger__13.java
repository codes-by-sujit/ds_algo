package leetCode;

import org.junit.jupiter.api.Test;

public class RomanToInteger__13 {

    public int romanToInt(String s) {
        int num=0;
        int n=s.length();
        num+=getNum(s.charAt(n-1));
        for(int i=n-2;i>=0;i--){
            if(getNum(s.charAt(i))<getNum(s.charAt(i+1)))
                num-=getNum(s.charAt(i));
            else
                num+=getNum(s.charAt(i));
        }
        return num;
    }

    private int getNum(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    @Test
    public void tc1(){
        String s= "XC";
        System.out.println(this.romanToInt(s));
    }

    @Test
    public void tc2(){
        String s= "VII";
        System.out.println(this.romanToInt(s));
    }

    @Test
    public void tc3(){
        String s= "MCMXCIV";
        System.out.println(this.romanToInt(s));
    }
}
