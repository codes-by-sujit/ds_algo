package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern9 {

    public void print(int n){
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<i*2;k++){
                System.out.print("*");
            }

        }
        n=n-1;
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(n*2-((i*2)+1));k++){
                System.out.print("*");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
        }
    }

    @Test
    public void tc1(){
        print(5);
    }
}
