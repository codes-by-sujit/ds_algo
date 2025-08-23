package revision.aug_23;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSUM {
    List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> temp = new ArrayList<>();
                    temp=Arrays.stream(new int[]{nums[i],nums[j],nums[k]})
                            .boxed()
                            .collect(Collectors.toList());

                    ans.add(temp);
                    j++;k--;
                } else if(sum<0){
                    j++;
                    while(j!=1 && nums[j]==nums[j-1])
                        j++;
                } else{
                    k--;
                    while(k!=nums.length-1 && nums[k]==nums[k+1])
                        k--;
                }
            }
        }
        return ans;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        System.out.println(this.threeSum(arr));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{0,0,0};
        System.out.println(this.threeSum(arr));
    }
}
