package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern4 {

    public void print(int n){
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
        }
    }

    @Test
    public void tc1(){
        print(5);
    }
}
