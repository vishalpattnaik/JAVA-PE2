/*boolean method called isEven() in a class called EvenNumTest, which takes an int as input and returns true if the input is even.*/

package com.stackroute.p2;

import static java.lang.Character.isLetter;

public class EvenNumberTest {

    public static boolean isEven(Integer number) {


        if(number%2 == 0) {     //checks for even number

            return true;

        }
        return false;
    }
}

