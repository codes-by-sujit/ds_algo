package leetCode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class _242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character,Integer> charMap=new HashMap<>();
        for(char c: s.toCharArray()){
            int count=charMap.getOrDefault(c,0);
            charMap.put(c,count+1);
        }
        for(char c: t.toCharArray()){
            int count=charMap.getOrDefault(c,0);
            if(count==0)
                return false;
            else
                charMap.put(c,count-1);
        }
        return true;
    }
}
