package leetCode.recursion;

import org.junit.jupiter.api.Test;

public class _50_power {

    public double myPow(double x, int n) {
        return myPowl(x,n);
    }

    private double myPowl(double x, long n){
        if(n==1) return x;
        if(n==0) return 1;
        if(n<0) return 1/myPowl(x,-n);
        if(n%2==0)
            return myPowl(x*x,n/2);
        return x*myPowl(x*x,n/2);
    }

    @Test
    void t1(){
        System.out.println(myPow(-10,5));
    }
    @Test
    void t2(){
        System.out.println(myPow(2,-2));
    }
}
