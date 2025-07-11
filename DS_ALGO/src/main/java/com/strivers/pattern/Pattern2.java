package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern2 {

    public void print(int n){
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
        }
    }

    @Test
    public void tc1(){
        print(5);
    }
}
