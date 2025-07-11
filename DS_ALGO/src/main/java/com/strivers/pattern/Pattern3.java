package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern3 {

    public void print(int n){
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
        }
    }

    @Test
    public void tc1(){
        print(15);
    }
}
