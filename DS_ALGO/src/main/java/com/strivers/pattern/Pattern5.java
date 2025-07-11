package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern5 {

    public void print(int n){
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=0;j<=n-i;j++){
                System.out.print("* ");
            }
        }
    }

    @Test
    public void tc1(){
        print(5);
    }
}
