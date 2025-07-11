package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern10 {

    public void print(int n){
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=1;j<=i;j++){
                int temp = (i+j)%2==0?1:0;
                System.out.print(temp+" ");
            }
        }

    }

    @Test
    public void tc1(){
        print(5);
    }
}
