package leetCode.binarysearch;

import org.junit.jupiter.api.Test;

public class _74_Search2Dmatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen=matrix.length;
        int colLen=matrix[0].length;
        for(int i=0;i<rowLen;i++){
            //Identify the row which may have the target
            if(target>=matrix[i][0] && target<=matrix[i][colLen-1]){
                int start=0;
                int end=colLen-1;
                while(start<=end){
                    int mid=(start+end)/2;
                    if(matrix[i][mid]==target)
                        return true;
                    if(target>matrix[i][mid])
                        start=mid+1;
                    else
                        end=mid-1;
                }
            }
        }
        return false;
    }

    @Test
    public void tc1(){
        int[][] matrix=new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(this.searchMatrix(matrix,11));
        System.out.println(this.searchMatrix(matrix,99));
    }
}
