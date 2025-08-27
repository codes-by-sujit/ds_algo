package leetCode;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class _3_LongestSubStringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        Map<Character,Integer> occ=new HashMap<>();
        int i=0,j=0;
        while(j<s.length()){
            occ.put(s.charAt(j),occ.getOrDefault(s.charAt(j),0)+1);
            while(occ.get(s.charAt(j))>1){
                occ.put(s.charAt(i),occ.get(s.charAt(i))-1);
                i++;
            }
            count=Math.max(count, (j-i)+1);
            j++;
        }
        return count;
    }

    @Test
    public void test(){
        String s= "abcabcdbb";
        System.out.println(this.lengthOfLongestSubstring(s));
    }

    @Test
    public void test2(){
        String s= "bbbb";
        System.out.println(this.lengthOfLongestSubstring(s));
    }

    @Test
    public void test3(){
        String s= "pwwkew";
        System.out.println(this.lengthOfLongestSubstring(s));
    }
}
