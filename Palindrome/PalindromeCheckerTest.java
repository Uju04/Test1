import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {
    @Test
    public void testNotPalindrome(){
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    public void testPalindrome(){
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("madam"));
    }

    @Test
    public void testEmptyPalindrome(){
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome(""));
    }

    @Test
    public void testSinglePalindrome(){
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("m"));
    }

    @Test
    public void testCaseSensitivtyPalindrome(){
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome("Madam"));
    }

    @Test
    public void testNullStringPalindrome(){
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome(null));
    }



}