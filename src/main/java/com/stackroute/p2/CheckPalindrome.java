/*Reverse the given input & Check if it is a Palindrome.*/

package com.stackroute.p2;

public class CheckPalindrome {

    public static String checkPalindrome(String str) {

        if(str==null)
            return "Null value not allowed";    //return message if string passed is null

        String reverse = "";
        for(int i=str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i);  //logic to reverse the given input
        }

        if(reverse.equals(str)) //return palindrome or not palindrome
            return "Palindrome";

        return "Not Palindrome";


    }

}
