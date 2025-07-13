package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern12 {

    public void print(int n){
        for(int i=1;i<n;i++){
            for(int x=1;x<=i;x++){
                System.out.print(x);
            }
            for(int y=0;y<(n-i-1)*2;y++){
                System.out.print(" ");
            }
            for (int z=i;z>=1;z--){
                System.out.print(z);
            }
            System.out.println(" ");
        }
    }

    @Test
    public void tc1(){
        print(5);
    }
}
