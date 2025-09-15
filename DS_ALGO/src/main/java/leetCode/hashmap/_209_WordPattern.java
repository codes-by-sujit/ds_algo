package leetCode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class _209_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        char[] patternArray=pattern.toCharArray();
        String[] words=s.split(" ");
        Map<Character,String> wordMap=new HashMap<>();
        if(patternArray.length!=words.length)
            return false;
        for(int i=0;i<patternArray.length;i++){
            if(!wordMap.containsKey(patternArray[i])){
                if(!wordMap.containsValue(words[i])){
                    wordMap.put(patternArray[i],words[i]);
                } else{
                    return false;
                }
            } else{
                if(!wordMap.get(patternArray[i]).equals(words[i]))
                    return false;
            }
        }
        return true;
    }
}
