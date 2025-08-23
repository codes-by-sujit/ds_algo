package revision.aug_23;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class SubArrayCountWithXorK {
    private int count(int[] arr, int k){
        int c=0;
        Map<Integer,Integer> mp = new HashMap<>();
        int xr=0;
        mp.put(xr,1);
        for(int i=0;i<arr.length;i++){
            xr=xr^arr[i];
            int x = xr^k;
            if(mp.containsKey(x)){
                c+=mp.get(x);
            }
            mp.put(xr,mp.getOrDefault(xr,0)+1);
        }
        return c;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{4,2,2,6,4};
        System.out.println(this.count(arr,6));
    }
    @Test
    public void tc2(){
        int[] arr = new int[]{5, 6, 7, 8, 9};
        this.count(arr,5);
    }
}
