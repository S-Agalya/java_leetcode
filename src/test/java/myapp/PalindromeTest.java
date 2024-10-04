package myapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    public void testPalindrome(){
        Palindrome reverse=new Palindrome();
        Assertions.assertFalse(reverse.isPalindrome(21));
        Assertions.assertTrue(reverse.isPalindrome(545));
    }
}
