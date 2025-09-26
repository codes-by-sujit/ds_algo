package revision._26_sep;

import org.junit.jupiter.api.Test;

public class _121_BestTimetoBuySellStock {
    public int maxProfit(int[] prices) {
        int buyPrice=Integer.MAX_VALUE; //BUY at lowest price.
        int profit = Integer.MIN_VALUE;
        for(int curr: prices){
            if(curr<buyPrice){
                buyPrice=curr;
            }
            profit=Math.max(profit,curr-buyPrice);
        }
        return profit;
    }

    @Test
    public void t1(){
        int[] arr = new int[]{5,2,7,6,1,3};
        System.out.println(this.maxProfit(arr));
    }
}
