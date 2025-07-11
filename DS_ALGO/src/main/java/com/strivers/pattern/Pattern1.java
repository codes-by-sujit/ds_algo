package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern1 {
    public void printPattern(int n){
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
        }
    }

    @Test
    public void tc1(){
        printPattern(5);
    }
}
