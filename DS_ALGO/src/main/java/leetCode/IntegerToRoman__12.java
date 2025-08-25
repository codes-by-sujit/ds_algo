package leetCode;

import org.junit.jupiter.api.Test;

import java.util.*;

public class IntegerToRoman__12 {
    Map<Integer, String> romans=new HashMap();
    List<Integer> romansList = new ArrayList<>();

    public String intToRoman(int num) {
        initMap();
        StringBuilder s= new StringBuilder();
        for(int i=romansList.size()-1;i>=0;i--){
            while(num>=romansList.get(i)){
                s.append(romans.get(romansList.get(i)));
                num-=romansList.get(i);
            }
        }

        return s.toString();
    }

    private void initMap(){
        romans.put(1,"I");romans.put(4,"IV");romans.put(5,"V");
        romans.put(9,"IX");romans.put(10,"X");
        romans.put(40,"XL");romans.put(50,"L");
        romans.put(90,"XC"); romans.put(100,"C");
        romans.put(400,"CD");romans.put(500,"D");
        romans.put(900,"CM");romans.put(1000,"M");
        for(Map.Entry e: romans.entrySet()){
            romansList.add(Integer.valueOf(e.getKey().toString()));
        }
        Collections.sort(romansList);
    }

    @Test
    public void tc1(){
        System.out.println(this.intToRoman(1994));
    }

    @Test
    public void tc2(){
        System.out.println(this.intToRoman(3749));
    }
}
