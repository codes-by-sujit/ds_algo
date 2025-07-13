package com.strivers.pattern;

import org.junit.jupiter.api.Test;

public class Pattern18 {

    public void print(int n){

        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                char c= (char) (65+n-1-j);
                System.out.print(c+"  ");
            }
            System.out.println("");
        }

    }

    @Test
    public void tc1(){
        print(5);
    }
}
