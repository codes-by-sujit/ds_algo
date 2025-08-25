package leetCode;

import org.junit.jupiter.api.Test;

public class GasStation__134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int costSum=0;
        int gasSum=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            costSum+=cost[i];
            gasSum+=gas[i];
        }
        if(costSum>gasSum)
            return -1;
        int leftGas=0;
        for(int i=0;i<gas.length;i++){
            leftGas=(leftGas+gas[i])-cost[i];
            if(leftGas<0){
                start=i+1;
                leftGas=0;
            }
        }
        return start;
    }

    @Test
    public void tc1(){
        int[] gas= new int[]{1,2,3,4,5};
        int[] cost= new int[]{3,4,5,1,2};
        System.out.println(this.canCompleteCircuit(gas,cost));
    }

    @Test
    public void tc2(){
        int[] gas= new int[]{3,1,1};
        int[] cost= new int[]{1,2,2};
        System.out.println(this.canCompleteCircuit(gas,cost));
    }
}
