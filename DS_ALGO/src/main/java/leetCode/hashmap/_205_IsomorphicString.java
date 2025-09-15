package leetCode.hashmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class _205_IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character, Character> charMap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!charMap.containsKey(s.charAt(i))){
                if(!charMap.containsValue(t.charAt(i))){
                    charMap.put(s.charAt(i),t.charAt(i));
                } else
                    return false;
            } else{
                if(charMap.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
        }
        return true;
    }

    @Test
    public void tc1(){
        System.out.println(this.isIsomorphic("egg","add"));
        System.out.println(this.isIsomorphic("egg","ads"));
        System.out.println(this.isIsomorphic("bbbaaaba","aaabbbba"));
    }
}
