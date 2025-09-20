package leetCode.dynamicprogramming;

import org.junit.jupiter.api.Test;
import java.util.*;

public class _139_WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        //Convert the dictionary to map/set for O(1) search time.
        Set<String> dict=new HashSet<>(wordDict);

        //Create a DP array and initialize
        //Extra 1 length because if string length is 0 it should be true;
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;

        //Find the maxLen of the word in dictionary
        int maxLen=0;
        for(String word: wordDict){
            maxLen=Math.max(maxLen,word.length());
        }

        //Iterate through char by char of the parent string
        //bottom up approach
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=maxLen && j<=i;j++){
                System.out.println(s.substring(i-j,i)+" - "+j);
                if(dp[i-j] && dict.contains(s.substring(i-j,i))){
                    dp[i]=true;
                    break; //If the word is found no need to check for further suffix.
                }
            }
        }
        return dp[s.length()];
    }

    @Test
    public void tc1(){
        boolean res=this.wordBreak("leetcode",Arrays.asList(new String[]{"leet","code"}));
        System.out.println("=>"+res);
    }
}
