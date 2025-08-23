package revision.aug_23;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<nums.length-1;j++){
                if(j!=i+1 && nums[j]==nums[j-1])
                    continue;
                int k= j+1;
                int l= nums.length-1;
                while(k<l){
                    long sum= Integer.valueOf(nums[i]).longValue()
                                +Integer.valueOf(nums[j]).longValue()
                                +Integer.valueOf(nums[k]).longValue()
                                +Integer.valueOf(nums[l]).longValue();
                    if(sum==target){
                        ans.add(Arrays.stream(new int[]{nums[i],nums[j],nums[k],nums[l]})
                                        .boxed()
                                        .collect(Collectors.toList())
                                );
                        k++;l--;
                        while(k<l && k!=j+1 && nums[k]==nums[k-1])
                            k++;
                        while(k<l && l!=nums.length-1 && nums[l]!=nums[l+1])
                            l--;
                    } else if(sum<target){
                        k++;
                        while(k<l && k!=j+1 && nums[k]==nums[k-1])
                            k++;
                    } else{
                        l--;
                        while(k<l && l!=nums.length-1 && nums[l]!=nums[l+1])
                            l--;
                    }
                }
            }
        }
        return ans;
    }

    @Test
    public void tc(){
        int[] arr = new int[]{1,0,-1,0,-2,2};
        System.out.println(this.fourSum(arr,0));
    }

    @Test
    public void tc2(){
        int[] arr = new int[]{1000000000,1000000000,1000000000,1000000000};

        long temp= Integer.valueOf(arr[0]).longValue()*4;
        //System.out.println(temp);
        System.out.println(this.fourSum(arr,-294967296));
    }
}
