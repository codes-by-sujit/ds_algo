package revision.aug_22;

import org.junit.jupiter.api.Test;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum==target){
                return new int[]{i+1,j+1};
            } else if(sum<target){
                i++;
            } else{
                j--;
            }
        }
        return new int[] {-1,-1};
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{2,7,11,15};
        int[] res = this.twoSum(arr,9);
        System.out.println(res[0]+" "+res[1]);
    }
}
