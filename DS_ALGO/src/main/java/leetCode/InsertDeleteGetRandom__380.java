package leetCode;

import java.util.*;

public class InsertDeleteGetRandom__380 {

    class RandomizedSet {

        private Map<Integer, Integer> map;
        private List<Integer> list;

        public RandomizedSet() {
            map=new HashMap<>();
            list =new ArrayList<>();
        }

        public boolean insert(int val) {
            if(map.containsKey(val)){
                return false;
            } else{
                list.add(val);
                map.put(val,list.size()-1);
                return true;
            }
        }

        public boolean remove(int val) {
            if(map.containsKey(val)){
                int pos=map.get(val);
                int lastElement = list.get(list.size()-1);
                list.set(pos,lastElement);
                map.put(list.get(pos),pos);
                list.remove(list.size()-1);
                map.remove(val);
                return true;
            } else{
                return false;
            }
        }

        public int getRandom() {
            return list.get(new Random().nextInt( list.size()));
        }
    }
}
