package leetCode.hashmap;

import org.junit.jupiter.api.Test;

import java.util.*;

public class _49_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();
        Map<String, List<String>> wordMap=new HashMap<>();
        for(String s: strs){
            char[] temp=s.toCharArray();
            Arrays.sort(temp);
            List<String> matchList=wordMap.getOrDefault(String.valueOf(temp),new ArrayList<>());
            matchList.add(s);
            wordMap.put(String.valueOf(temp), matchList);
        }
        for(Map.Entry e: wordMap.entrySet()){
            ans.add((List<String>) e.getValue());
        }
        return ans;
    }

    @Test
    public void tc1(){
        String[] s= new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(this.groupAnagrams(s));
    }
}
