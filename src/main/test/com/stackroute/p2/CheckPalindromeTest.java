package com.stackroute.p2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromeTest {

    CheckPalindrome ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new CheckPalindrome();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void checkPalindromeReturnMessage() {

        String res = ob.checkPalindrome("madam");
        assertEquals("Palindrome", res);

    }

    @Test
    public void checkNotPalindromeReturnMessage() {

        String res = ob.checkPalindrome("london");
        assertEquals("Not Palindrome", res);

    }

    @Test
    public void givenNullvalueShouldReturnErrorMessage() {

        String res = ob.checkPalindrome(null);
        assertEquals("Null value not allowed", res);

    }

}