package array.twopointer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class reverse_String {
    public void reverseString(char[] s) {
        if(s.length>1) {
            int i = 0;
            int j = s.length - 1;
            while (j > i) {
                swap(s, i, j);
                i++;
                j--;
            }
        }
    }

    private void swap(char[] s,int i, int j){
        char temp = s[i];
        s[i]=s[j];
        s[j]=temp;
    }

    @Test
    public void testCase_1(){
        char[] str = "hello".toCharArray();
        this.reverseString(str);
        assertEquals(String.valueOf(str),"olleh");
    }

}
