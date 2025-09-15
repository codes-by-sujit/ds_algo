package leetCode.binarysearch;

public class _4_MedianOfSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>n2)
            return findMedianSortedArrays(nums2,nums1); //calculating the possibilities on smaller array for better time complexity
        //Calculate the possibility of picking the number of elements
        int leftCount=(n1+n2+1)/2; // maximum number of elements on the left side of line.
        int start=0; //Possibility : No element
        int end=n1; //Possibility: all element
        while(start<=end){
            //Mid is the position to draw the line.
            int mid1=(start+end)/2; //Mid of nums1 array
            int mid2=leftCount-mid1; //mid of nums2 array

            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;

            //Assign l1,l2 if the mid1 is not negative
            if(mid1-1>=0) l1=nums1[mid1-1];
            if(mid2-1>=0) l2=nums2[mid2-1];

            //Assign the r1,r2 if the mid-values are in range
            if(mid1<n1) r1=nums1[mid1];
            if(mid2<n2) r2=nums2[mid2];

            boolean isEven=(n1+n2)%2==0;

            if(l1<=r2 && l2<=r1) {
                //Check median if the total element count is even
                if (isEven) {
                    return (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else { //Check median if the total element count is odd
                    return (double) Math.max(l1, l2);
                }
            }
            if(l1>r2){
                end=mid1-1;
            } else{
                start=mid1+1;
            }
        }
        return 0;
    }
}
