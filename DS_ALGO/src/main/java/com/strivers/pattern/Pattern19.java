package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern19 {

    public void print(int n){

        for(int i=0;i<n;i++){
            for(int x=0;x<n-i;x++){
                System.out.print("*");
            }
            for(int x=0;x<2*i;x++){
                System.out.print(" ");
            }
            for(int x=0;x<n-i;x++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n-1;i>=0;i--){
            for(int x=0;x<n-i;x++){
                System.out.print("*");
            }
            for(int x=0;x<2*i;x++){
                System.out.print(" ");
            }
            for(int x=0;x<n-i;x++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    @Test
    public void tc1(){
        print(5);
    }
}
