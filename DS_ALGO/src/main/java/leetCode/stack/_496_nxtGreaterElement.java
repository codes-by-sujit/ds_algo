package leetCode.stack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _496_nxtGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        //store the index of nums2 for O(1) search
        Map<Integer,Integer> indexMap=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            indexMap.put(nums2[i],i);
        }

        //Create the result array
        int[] result= new int[nums1.length];

        //create an array to hold the next greater element of each element in nums2
        int[] nxt=new int[nums2.length];

        //Create a stack to hold the greater elements
        Stack<Integer> stack=new Stack<>();

        // Parse each int from last in nums2 and store in nxt;
        for(int i= nums2.length-1;i>=0;i--){
            if(stack.isEmpty()) nxt[i]=-1;
            else if(nums2[i]<stack.peek()) nxt[i]=stack.peek();
            else{
                while(!stack.isEmpty() && nums2[i]>stack.peek()){
                    stack.pop();
                }
                nxt[i]=stack.isEmpty()?-1:stack.peek();
            }
            stack.push(nums2[i]);
        }

        //prepare the result
        for(int i=0;i<nums1.length;i++){
            result[i]=nxt[indexMap.get(nums1[i])];
        }
        return result;
    }

    @Test
    public void tc1(){
        int[] nums1=new int[]{1,5,7};
        int[] nums2=new int[]{1,5,2,7,9,3};
        System.out.println(Arrays.asList(this.nextGreaterElement(nums1,nums2)));
    }
}
