package leetCode.stack;

import org.junit.jupiter.api.Test;
import util.ArrayUtil;

import java.util.Stack;
// Iterate over each asteroid
// if it's +ve, then push to stack
// if it's -ve then check with top
//      if equal then simply pop and break out
//      if less then break (because already the higher number in stack)
//      if greater then pop till stack exhaust, then push the element

public class _735_AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        //stack to track the previous elements
        Stack<Integer> stack=new Stack<>();

        for (int asteroid : asteroids) {
            if (stack.isEmpty()) {
                stack.push(asteroid);
                continue;
            }
            if (asteroid > 0) { //positive asteroid-> push to stack
                stack.push(asteroid);
            } else { // negative asteroid-> process
                if (asteroid < 0 && stack.peek() < 0) {
                    stack.push(asteroid);
                    continue;
                }
                while (!stack.isEmpty() && stack.peek() > 0) {
                    int top = stack.peek();
                    int num = Math.abs(asteroid);
                    if (top == num) { //collision with same weight
                        stack.pop();
                        break;
                    } else if (top > num) { //already the higher number is in stack
                        break;
                    } else {
                        stack.pop();
                        if (stack.empty()|| stack.peek()<0) {
                            stack.push(asteroid);
                            break;
                        }
                    } // END of else block (top>num
                } //End of while loop
            } //END of -ve asteroid condition
        } // END of for loop
        //move the stack element to result, because these won't collide
        int[] result=new int[stack.size()];
        int idx=0;
        for(Integer i: stack)
            result[idx++]=i;
        return result;
    }

    @Test
    public void tc1(){
        int[] asterods = new int[]{10,2,-5};
        ArrayUtil.print(this.asteroidCollision(asterods));
    }

    @Test
    public void tc2(){
        int[] asterods = new int[]{5,10,-5};
        ArrayUtil.print(this.asteroidCollision(asterods));
    }

    @Test
    public void tc3(){
        int[] asterods = new int[]{-2,-10,5,10,-5};
        ArrayUtil.print(this.asteroidCollision(asterods));
    }

    @Test
    public void tc4(){
        int[] asterods = new int[]{-2,-2,1,-2};
        ArrayUtil.print(this.asteroidCollision(asterods));
    }
}
