package revision._26_sep;

import org.junit.jupiter.api.Test;

public class _122_BestTimeToBuySellStock_II {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<=prices[i+1])
                profit+= prices[i+1]-prices[i];
        }
        return profit;
    }

    @Test
    public void t1(){
        int[] arr= new int[]{7,1,5,3,6,4};
        System.out.println(this.maxProfit(arr));
    }
}
