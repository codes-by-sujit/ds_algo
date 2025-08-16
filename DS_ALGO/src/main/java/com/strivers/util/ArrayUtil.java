package com.strivers.util;

import java.lang.reflect.Type;
import java.util.List;

public class ArrayUtil {
    public static void print(int[] arr){
        System.out.println("- - - - - - - - - ");
        for(int i : arr){
            System.out.print(" "+i);
        }
        System.out.println("\n - - - - - - - - - ");
    }

    public static int[] toArray(List<Integer> lst){
        int[] r= new int[lst.size()];
        int i=0;
        for(int val: lst){
            r[i++]=val;
        }
        return r;
    }
}
