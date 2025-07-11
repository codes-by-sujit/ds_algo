package array.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Max_Vowel_count {
    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int max = 0;
        int i=0,j=0;
        int curr_count=0;
        boolean[] vowelMap=new boolean[s.length()];

        while(j<s.length()){
            vowelMap[j]=isVowel(chars[j]);
            curr_count=vowelMap[j]?curr_count+1:curr_count;
            if((j-i)+1==k){
                max=Math.max(max,curr_count);
                curr_count=vowelMap[i]?curr_count-1:curr_count;
                i++;
            }
            j++;
        }
        return max;
    }

    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    @Test
    public void tc1(){
        String s = "abciiidef";
        int k=3;
        Assertions.assertEquals(3, maxVowels(s,k));
    }

    @Test
    public void tc2(){
        String s = "aeiou";
        int k=2;
        Assertions.assertEquals(2, maxVowels(s,k));
    }

    @Test
    public void tc3(){
        String s = "a";
        int k=1;
        Assertions.assertEquals(1, maxVowels(s,k));
    }

    @Test
    public void tc4(){
        String s = "b";
        int k=1;
        Assertions.assertEquals(0, maxVowels(s,k));
    }

    @Test
    public void tc5(){
        String s = "leetcode";
        int k=3;
        Assertions.assertEquals(2, maxVowels(s,k));
    }
}
