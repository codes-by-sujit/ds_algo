package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern21 {
    public void print(int n){
        for(int i=0;i<n;i++){
             if(i==0 || i==n-1){
                 for(int j=0;j<n;j++){
                     System.out.print("*");
                 }
             } else{
                 for(int j=0;j<n;j++){
                     if(j==0 || j==n-1) {
                         System.out.print("*");
                     } else{
                         System.out.print(" ");
                     }
                 }
             }
            System.out.println("");
        }
    }

    @Test
    public void tc1(){
        print(5);
    }
}
