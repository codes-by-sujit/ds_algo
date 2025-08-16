package com.strivers.array.med;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SpiralPrintMatrix {

    private List<Integer> print(int[][] mat){
        List<Integer> ans = new ArrayList<>();

        int top=0;
        int left=0;
        int right=mat[0].length-1;
        int bottom=mat.length-1;

        while(top<=bottom && left<=right) {
            // TOP ROW
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;
            // RIGHT ROW
            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;
            //BOTTOM ROW
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(mat[bottom][i]);
                }
            }
            bottom--;
            //LEFT ROW
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(mat[i][left]);
                }
            }
            left++;
        }
        return ans;
    }

    private void print_matrix(int[][] mat){
        System.out.println("-------------------");
        for(int i=0;i< mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }

    @Test
    public void tc(){
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(print(mat));
    }

    @Test
    public void tc3(){
        int[][] mat = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(print(mat));
    }


    @Test
    public void tc2(){
        int[][] mat=new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                mat[i][j]=6*(i)+j+1;
            }
        }
        print_matrix(mat);
        System.out.println(print(mat));
    }
}
