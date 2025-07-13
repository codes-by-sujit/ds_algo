package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern22 {
    public void print(int n){
        for(int i=n;i>=1;i--){
            printInternal(i,n);
        }
        for(int i=2;i<=n;i++){
            printInternal(i,n);
        }
    }

    private void printInternal(int i,int n){
        for(int j=n;j>=i;j--){
            System.out.print(j);
        }
        for(int k=0;k<2*i-3;k++){
            System.out.print(i);
        }
        for(int j=i;j<=n;j++){
            if(j!=1)
                System.out.print(j);
        }
        System.out.println("");
    }

    @Test
    public void tc1(){
        print(7);
    }
}
