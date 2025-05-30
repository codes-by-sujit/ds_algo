import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

    public static void main(String[] args) {
        SubArraySumEqualsK obj = new SubArraySumEqualsK();
        int[] arr = new int[]{1,-1,0};
        System.out.println(obj.subarraySum(arr,0));
    }
    public int subarraySum(int[] nums, int k) {
        int[] ps = new int[nums.length];
        Map<Integer, Integer> psMap = new HashMap<>();
        int counter=0;
        psMap.put(0,1);
        if(nums.length==1){
            if(nums[0]==k) return 1;
            else return 0;
        }

        for(int i=0;i<nums.length;i++){
            ps[i]= i==0?nums[0]:ps[i-1]+nums[i];
            if(psMap.getOrDefault(ps[i]-k,0)>=1){
                counter=counter+psMap.getOrDefault(ps[i]-k,0);
            }
            psMap.put(ps[i],psMap.getOrDefault(ps[i],0)+1);
        }
        return counter;
    }
}
