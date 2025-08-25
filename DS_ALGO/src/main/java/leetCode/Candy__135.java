package leetCode;

import org.junit.jupiter.api.Test;

public class Candy__135 {
    public int candy(int[] ratings) {
        int i=1;
        int sum=1; //at least 1 candy is req to give
        int peak;
        int down;
        if(ratings.length==1)
            return 1;
        while(i<ratings.length){
            //Flat graph
            if(ratings[i]==ratings[i-1]) {
                sum += 1;
                i++;
                continue;
            }
            //Inclined Graph
            peak=1; //at least 1 candy is req to give
            while(i<ratings.length && ratings[i]>ratings[i-1]){
                peak++;
                sum+=peak;
                i++;
            }
            //Declined Graph
            down=1; //at least 1 candy is req to give
            while (i<ratings.length && ratings[i]<ratings[i-1]){
                sum+=down;
                down++;
                i++;
            }
            if(down>peak)
                sum+=down-peak;

        }
        return sum;
    }

    @Test
    public void tc1(){
        int[] arr= new int[]{1,2,2};
        System.out.println(this.candy(arr));
    }

    @Test
    public void tc2(){
        int[] arr= new int[]{1,0,2};
        System.out.println(this.candy(arr));
    }
}
