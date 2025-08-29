package leetCode;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class _76_MinWindowSubString {
    public String minWindow(String s, String t) {
        Map<Character,Integer> charMap = new HashMap<>();
        String sub="";
        int min=Integer.MAX_VALUE;
        for(char c: t.toCharArray())
            charMap.put(c,charMap.getOrDefault(c,0)+1);
        int left=0;
        int right=0;
        int count=charMap.size();

        while(right<s.length()){
            char c=s.charAt(right);
            right++;
            if(!charMap.containsKey(c))
                continue;
            charMap.put(c,charMap.get(c)-1);
            if(charMap.get(c)==0)
                count--;

            while(count==0){ //Substring found having all required characters
                char oldChar=s.charAt(left);
                if((right-left)+1<min){ //Compare and check if this substring is minimum
                    sub=s.substring(left,right);
                    min=(right-left)+1;
                    System.out.println("    "+sub+"  Length:"+sub.length());
                }
               left++;
                if(!charMap.containsKey(oldChar)) {
                    continue;
                }

                charMap.put(oldChar,charMap.get(oldChar)+1);
                if(charMap.get(oldChar)>0){
                    count++;
                }
            }
        }
        return sub;
    }

    @Test
    public void tc1(){
        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println(this.minWindow(s,t));
    }

    @Test
    public void tc2(){
        String s="a";
        String t="a";
        System.out.println(this.minWindow(s,t));
    }

    @Test
    public void tc3(){
        String s="a";
        String t="aa";
        System.out.println(this.minWindow(s,t));
    }
    @Test
    public void tc4(){
        String s="cabwefgewcwaefgcf";
        String t="cae";
        System.out.println(this.minWindow(s,t));
    }
}
