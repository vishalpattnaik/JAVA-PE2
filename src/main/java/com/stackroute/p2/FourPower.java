/*check if a given number is power of 4*/

package com.stackroute.p2;

import static java.lang.Character.isLetter;

public class FourPower {

    public static String checkPowerOfFour(int num) {

        if(isLetter(num))
            return "Invalid input";     //check for invalid input

        if(num==0) return "Not power of 4";     //if zero return not a power of 4
        while(num != 1)
        {
            if(num % 4 != 0)                //check for power of 4
                return "Not power of 4";
            num = num / 4;
        }
        return "Power of 4";

    }

}
