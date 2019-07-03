/*program to list all the factorials, that can be expressed as an int
* add a method called longFactorial to list all the factorial that can
 be expressed as a long (64-bit signed integer)*/

package com.stackroute.p2;

public class Factorial {

        public String printIntFactorials(){
            int i = 1;
            int fn = 1;
            String output = "";
            while (true) {
                output = output + "\n" + fn;
                if (Integer.MAX_VALUE / fn < (i + 1)) {     //check if integer value is out of range
                    output = output + "out of range";
                    break;
                }
                i++;
                fn *= i;
            }
            return output;
        }

        public String printLongFactorials() {

            String output="";
            long i  = 1L;
            long fn = 1L;
            while (true)
            {   output=output+"\n"+fn;

                if (Long.MAX_VALUE / fn < (i+1)) {
                    output=output+"out of range";       //check if long value is out of range
                    break;
                }
                i++;
                fn *= i;
            }
            return output;  // return the result
        }

}
