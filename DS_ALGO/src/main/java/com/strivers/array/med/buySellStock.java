package com.strivers.array.med;

import org.junit.jupiter.api.Test;

public class buySellStock {

    private int maxProfit(int[] arr){
        int max_profit=0;
        int min_price=arr[0];
        for(int i=1;i<arr.length;i++){
            int cost = arr[i]-min_price;
            max_profit=Math.max(max_profit,cost);
            min_price=Math.min(arr[i],min_price);
        }
        return max_profit;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }

}
