package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern17 {

    public void print(int n){

        for(int i=0;i<n;i++){
            for(int x=0;x<n-i;x++){
                System.out.print("  ");
            }
            int y=0;
            for(;y<=i;y++){
                char c = (char) (y+65);
                System.out.print(c+" ");
            }
            for (y=i-1; y >= 0;y--) {
                char c = (char) (y+65);
                System.out.print(c+" ");
            }
            System.out.println("");
        }

    }

    @Test
    public void tc1(){
        print(4);
    }
}
