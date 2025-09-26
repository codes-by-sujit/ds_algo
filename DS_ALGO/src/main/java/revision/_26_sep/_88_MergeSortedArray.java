package revision._26_sep;

import org.junit.jupiter.api.Test;
import util.ArrayUtil;

public class _88_MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        int[] temp=new int[nums1.length];
        int idx=0;

        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                temp[idx++]=nums2[j];
                j++;
            } else{
                temp[idx++]=nums1[i];
                i++;
            }
        }

        while(i<m)  temp[idx++]=nums1[i++];
        while(j<n) temp[idx++]=nums2[j++];

        for(i=0;i<temp.length;i++) nums1[i]=temp[i];
    }

    @Test
    public void tc1(){
        int[] n1=new int[] {4,5,0,0,0};
        int[] n2=new int[] {1,2,3};
        this.merge(n1,2,n2,3);
        ArrayUtil.print(n1);
    }

    @Test
    public void tc2(){
        int[] n1=new int[] {1,3,0,0,0};
        int[] n2=new int[] {2,4,6};
        this.merge(n1,2,n2,3);
        ArrayUtil.print(n1);
    }
}
