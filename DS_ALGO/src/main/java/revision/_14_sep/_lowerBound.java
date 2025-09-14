package revision._14_sep;

import org.junit.jupiter.api.Test;

public class _lowerBound {
    public static int getLowerBound(int []arr, int n, int x) {

        int ans=-1;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>=x)
                ans=mid;
            if(arr[mid]<=x){
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return ans;
    }


    @Test
    public void tc(){
        int[] nums = new int[]{-1,0,3,5,9,12};
        System.out.println(getLowerBound(nums,6,4));
    }
    @Test
    public void tc2(){
        int[] nums = new int[]{3, 5, 8, 15, 19};
        System.out.println(getLowerBound(nums,5,9));
    }
}
