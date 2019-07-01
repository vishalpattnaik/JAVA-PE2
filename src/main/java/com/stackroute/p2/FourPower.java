package com.stackroute.p2;

public class FourPower {

    public static String checkPowerOfFour(int num) {
        if(num==0) return "Not power of 4";
        while(num != 1)
        {
            if(num % 4 != 0)
                return "Not power of 4";
            num = num / 4;
        }
        return "Power of 4";

    }

}
