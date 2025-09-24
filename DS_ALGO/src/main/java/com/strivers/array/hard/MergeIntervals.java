//package com.strivers.array.hard;
//
//import util.ArrayUtil;
//import org.junit.jupiter.api.Test;
//
//import java.util.*;
//
//public class MergeIntervals {
//    public int[][] merge(int[][] intervals) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<List<Integer>> arr = Arrays.stream(intervals)
//                                .map(inner -> Arrays.stream(inner).boxed().toList())  // box each int[]
//                                .toList();
//        this.sort(intervals);
//        for(int i=0;i<intervals.length;i++){
//            if(ans.isEmpty() || ans.get(ans.size()-1).get(1)<intervals[i][0]){
//                ans.add(Arrays.asList(intervals[i][0],intervals[i][1]));
//            } else{
//                List<Integer> t= ans.get(ans.size()-1);
//                int lastIndex=ans.size()-1;
//                //ans.set(1,Arrays.asList(Math.min(t.get(0),intervals[i][0]),Math.max(t.get(1),intervals[i][1])));
//                ans.get(ans.size() - 1).set(1,
//                        Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]));
//
//            }
//        }
//        return ans.stream()
//                .map(inner -> inner.stream().mapToInt(Integer::intValue).toArray())
//                .toArray(int[][]::new);
//    }
//
//    private void sort(int[][] arr){
//
//        arr.sort(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[1]-o2[1];
//            }
//        });
//    }
//
//
//
//    @Test
//    public void tc2(){
//        int[][] arr = new int[][]{{1,3},{2,3},{8,10},{2,6},{15,18},{2,4}};
//        int[][] ans = this.merge(arr);
//        for(int[] t: ans){
//            System.out.println("["+t[0]+","+t[1]+"]");
//        }
//    }
//}
