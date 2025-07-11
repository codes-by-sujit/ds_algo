package array.twopointer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Merge_Sorted_Arrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int[] nums3 = new int[m+n];
         int i=0,j=0,k=0;
         while(i<m && j<n){
             if(nums1[i]<nums2[j]){
                 nums3[k]=nums1[i];
                 i++;
             } else{
                 nums3[k]=nums2[j];
                 j++;
             }
             k++;
         }
         while(i<m){
             nums3[k]=nums1[i];
             k++;i++;
         }
        while(j<n){
            nums3[k]=nums2[j];
            k++;j++;
        }
        for(i=0;i<nums3.length;i++){
            nums1[i]=nums3[i];
        }
        print(nums1);
    }

    private void print(int[] n){
        for(int a:n){
            System.out.print(a+" ");
        }
    }

    @Test
    public void tc1(){
        int[] n1= new int[]{1,2,3,0,0,0};
        int[] n2 = new int[]{2,5,6};
        merge(n1,3,n2,3);
    }
}
