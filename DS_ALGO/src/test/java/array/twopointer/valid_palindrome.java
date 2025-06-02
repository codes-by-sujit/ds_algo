package array.twopointer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class valid_palindrome {
    public boolean isPalindrome(String s) {
        if(s.length()<=1){
            return true;
        } else{
            char[] c = s.toLowerCase().toCharArray();
            int i=0;
            int j=c.length-1;
            while(j>i){
                if(isNonAlphaNumeric(c[i])){
                    i++;
                } else if(isNonAlphaNumeric(c[j])){
                    j--;
                } else{
                    if(c[i]!=c[j]){
                        return false;
                    }
                    i++;j--;
                }
            }
        }
        return true;
    }

    private boolean isNonAlphaNumeric(char c){
        return !Character.isDigit(c) && !Character.isAlphabetic(c);
    }

    @Test
    public void tc1(){
         assertTrue(isPalindrome("abcba"));
    }

    @Test
    public void tc2(){
        assertFalse(isPalindrome("abcea"));
    }

    @Test
    public void tc3(){
        assertTrue(isPalindrome("    "));
    }

    @Test
    public void tc4(){
        assertTrue(isPalindrome("_a__b_a  --"));
    }

    @Test
    public void tc5(){
        assertTrue(isPalindrome("AbcBa"));
    }
}
