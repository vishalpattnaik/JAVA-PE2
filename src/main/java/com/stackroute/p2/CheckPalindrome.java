package com.stackroute.p2;

public class CheckPalindrome {

    public static String checkPalindrome(String str) {

        if(str==null)
            return "Null value not allowed";

        String reverse = "";
        for(int i=str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if(reverse.equals(str))
            return "Palindrome";

        return "Not Palindrome";


    }

}
