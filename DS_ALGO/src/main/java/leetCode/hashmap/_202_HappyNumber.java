package leetCode.hashmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class _202_HappyNumber {
    public boolean isHappy(int n) {
        Map<Integer,Integer> numMap=new HashMap<>();
        while(true){
            int sum=sumOfSqrs(n);
            if(numMap.containsKey(sum))
                return false;
            if(sum==1)
                return true;
            numMap.put(sum,1);
            n=sum;
        }
    }

    private int sumOfSqrs(int num){
        int sum=0;
        while(num>0){
            sum+=Math.pow(num%10,2);
            num=num/10;
        }
        return sum;
    }
    @Test
    public void tc1(){

    }
}
