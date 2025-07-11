package array.twopointer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Interval_List_Intersection {

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> lst = new ArrayList<>();
        int i=0,j=0,k=0;
        while(i< firstList.length && j<secondList.length){
            int start = max(firstList[i][0], secondList[j][0]);
            int end = min(firstList[i][1], secondList[j][1]);
            if(start<=end){
                lst.add(new int[]{start,end});
            }
            if(firstList[i][1]<secondList[j][1])
                i++;
            else
                j++;
        }
        return lst.toArray(new int[lst.size()][]);
    }


    @Test
    public void tc1(){
        int[][] firstList = new int[][]{{0,2},{5,10},{13,23},{24,25}};
        int[][] secondList = new int[][]{{1,5}, {8,12},{15,24},{25,26}};
        int[][] result = intervalIntersection(firstList,secondList);
        print(result);
    }

    @Test
    public void tc2(){
        int[][] firstList = new int[][]{{1,3},{5,9}};
        int[][] secondList = new int[][]{};
        int[][] result = intervalIntersection(firstList,secondList);
        print(result);
    }

    private void print(int[][] arr){
        System.out.println(arr.length);
        int i=0;
        while(i<arr.length) {
            System.out.print("["+arr[i][0]+","+arr[i][1]+"], ");
            i++;
        }
    }
}
