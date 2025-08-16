package com.strivers.array.med;

import org.junit.jupiter.api.Test;

public class RotateMatrix {

    public void rotate(int[][] mat) {
        transpose(mat);
        for (int[] row : mat) {
            reverse(row);
        }
        print_matrix(mat);
    }

    private void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }

    private void transpose(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[0].length;j++){
                swap(mat,i,j);
            }
        }
    }

    private void swap(int[][] mat, int i, int j){
        int t = mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=t;
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
        print_matrix(mat);
        rotate(mat);
        print_matrix(mat);
    }
}
