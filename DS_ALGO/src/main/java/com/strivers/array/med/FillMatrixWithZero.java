package com.strivers.array.med;

import org.junit.jupiter.api.Test;

public class FillMatrixWithZero {

    private void fill(int[][] mat){
        print_matrix(mat);
        int col0=1;
        //fill the first row and col with 0's
        for(int i=0;i< mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                 if(mat[i][j]==0){
                     mat[i][0]=0;
                     if(j!=0)
                        mat[0][j]=0;
                     else
                         col0=0;
                 }
            }
        }
        //Fill the other rows and cols
        for(int i=1;i< mat.length;i++) {
            for (int j = 1; j < mat[0].length; j++) {
                if(mat[i][j]!=0){
                    if(mat[0][j]==0 || mat[i][0]==0){
                        mat[i][j]=0;
                    }
                }
            }
        }

        if(mat[0][0]==0){
            for(int j=0;j<mat[0].length;j++){
                mat[0][j]=0;
            }
        }

        if(col0==0){
            for(int i=0; i<mat.length;i++){
                mat[i][0]=0;
            }
        }
        print_matrix(mat);
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
        int[][] mat = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        fill(mat);
    }

    @Test
    public void tc2(){
        int[][] mat = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        fill(mat);
    }

    @Test
    public void tc3(){
        int[][] mat = new int[][]{{1,0,3}};
        fill(mat);
    }

}
