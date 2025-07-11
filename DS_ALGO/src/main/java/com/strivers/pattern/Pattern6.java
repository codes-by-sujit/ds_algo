package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern6 {

    public void print(int n){
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
        }
    }

    @Test
    public void tc1(){
        print(5);
    }
}
