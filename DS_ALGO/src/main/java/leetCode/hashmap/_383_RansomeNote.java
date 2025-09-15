package leetCode.hashmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class _383_RansomeNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charMap=new HashMap<>();
        //Updates the character occurrences in map
        for(char c: magazine.toCharArray()){
            int currentCount=charMap.getOrDefault(c,0);
            charMap.put(c,currentCount+1);
        }
        for(char c: ransomNote.toCharArray()){
            int count=charMap.getOrDefault(c,0);
            if(count==0)
                return false;
            charMap.put(c, count-1);
        }
        return true;
    }

    @Test
    public void test1(){
        String mag="aabbc";
        String ransome="ab";
        System.out.println(canConstruct(ransome,mag));
    }
    @Test
    public void test2(){
        String mag="aa";
        String ransome="ab";
        System.out.println(canConstruct(ransome,mag));
    }
}
