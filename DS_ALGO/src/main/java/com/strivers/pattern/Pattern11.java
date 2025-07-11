package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern11 {

    public void print(int n){
        for(int i=1;i<=n-1;i++){
            System.out.println();
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=(n-1-i)*2;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
        }

    }

    @Test
    public void tc1(){
        print(5);
    }
}
