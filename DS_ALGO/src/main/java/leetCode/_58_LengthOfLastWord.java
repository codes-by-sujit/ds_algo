package leetCode;

import org.junit.jupiter.api.Test;

public class _58_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length-1].length();
    }

    @Test
    public void test(){
        System.out.println(this.lengthOfLastWord("   Hello World "));
        System.out.println(this.lengthOfLastWord("   fly me   to   the moon  "));
    }
}
