package leetCode;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class H_Index__274 {
    public int hIndex(int[] citations) {
        int n= citations.length;
        int[] res= new int[n+1];
        for(int c: citations){
            if(c>n){
                res[n]++;
            } else{
                res[c]++;
            }
        }
        int count=0;
        for(int i=res.length-1;i>=0;i--){
            count=count+res[i];
            if(i<=count)
                return i;
        }
        return 0;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{3,0,6,1,5};
        System.out.println(this.hIndex(arr));
    }

}
