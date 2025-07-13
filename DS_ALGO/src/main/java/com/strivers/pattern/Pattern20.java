package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern20 {

    public void print(int n){

        for(int i=0;i<n;i++){
            for(int x=0;x<=i;x++){
                System.out.print("*");
            }
            for(int x=0;x<(n-1-i)*2;x++){
                System.out.print(" ");
            }
            for(int x=0;x<=i;x++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n-2;i>=0;i--){
            for(int x=0;x<=i;x++){
                System.out.print("*");
            }
            for(int x=0;x<(n-1-i)*2;x++){
                System.out.print(" ");
            }
            for(int x=0;x<=i;x++){
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
