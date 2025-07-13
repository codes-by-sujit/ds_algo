package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern13 {

    public void print(int n){
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k+"  ");
                k++;
            }
            System.out.println("");
        }

    }

    @Test
    public void tc1(){
        print(5);
    }
}
