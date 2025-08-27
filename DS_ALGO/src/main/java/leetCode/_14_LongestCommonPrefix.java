package leetCode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class _14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        StringBuilder res=new StringBuilder();
        int i=0;
        while(i<s1.length() && i<s2.length()){
            if(s1.charAt(i)!=s2.charAt(i))
                return res.toString();
            res.append(s1.charAt(i));
            i++;
        }
        return res.toString();
    }

    @Test
    public void tc1(){
        String [] s = new String[]{"flower", "fly","float"};
        System.out.println(this.longestCommonPrefix(s));
    }
    @Test
    public void tc2(){
        String [] s = new String[]{"dog","racecar","car"};
        System.out.println(this.longestCommonPrefix(s));
    }
}
