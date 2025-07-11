package array.twopointer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Valid_Palindrome_II {
    public boolean validPalindrome(String s) {
        char[] c = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        int skipCounter=0;
        while(i<=j){
            if(c[i]==c[j]){
                i++;j--;
            } else{
                if(skipCounter>0)
                    return false;
                else {
                    if(j-1>=i && c[j-1]==c[i])
                        j--;
                    else if(i+1<j && c[i+1]==c[j])
                        i++;
                    skipCounter++;
                }
            }
        }
        return true;
    }

    @Test
    public void tc1(){  assertTrue(this.validPalindrome("abca")); }

    @Test
    public void tc2(){  assertTrue(this.validPalindrome("aba")); }

    @Test
    public void tc3(){  assertTrue(this.validPalindrome("a")); }

    @Test
    public void tc4(){  assertFalse(this.validPalindrome("abc")); }

    @Test
    public void tc5(){  assertFalse(this.validPalindrome("eceec")); }
}
