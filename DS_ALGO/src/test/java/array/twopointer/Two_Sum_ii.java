package array.twopointer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Two_Sum_ii {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return res;
    }

    @Test
    public void tc1(){
        int[] arr = new int[]{1,2,3,4,6};
        int target = 6;
        int[] res = this.twoSum(arr,target);
        System.out.println("res[]="+res[0]+","+res[1]);
        assertEquals(arr[res[0]-1]+arr[res[1]-1],target);
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        int[] res = this.twoSum(arr,target);
        System.out.println("res[]="+res[0]+","+res[1]);
        assertEquals(arr[res[0]-1]+arr[res[1]-1],target);
    }
}
