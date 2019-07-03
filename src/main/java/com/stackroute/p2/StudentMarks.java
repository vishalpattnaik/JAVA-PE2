/*Write a program, which reads number of students and n grades as input (of int
between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
program shall check for valid input.*/

package com.stackroute.p2;

public class StudentMarks {


    public String studentDetails(int noOfStudents, int[] marks) {

        float avg = average(noOfStudents, marks);
        int maxMarks = max(noOfStudents, marks);
        int minMarks = min(noOfStudents, marks);

        if(!(noOfStudents>=0 && noOfStudents<=100))     //check for valid input
            return "Please enter valid input";
        else
            return "The average is " + avg + " The minimum is " + minMarks + " The maximum is " + maxMarks;

    }

    public float average(int n, int[] marks) {          //calculate average

        float sum = 0;
        for(int i=0; i<marks.length; i++) {

            sum = sum + marks[i];

        }

        return sum/marks.length;

    }

    public int max(int n, int[] marks) {        //calculate maximum mark

        int maximum= marks[0];
        for(int i=1; i<marks.length; i++) {
                if (marks[i] > maximum)
                    maximum = marks[i];
        }
        return maximum;
    }

    public int min(int n, int[] marks) {           //calculate minimum mark

        int minimum=marks[0];
        for(int i=1; i<marks.length; i++) {
                if(marks[i] < minimum)
                    minimum = marks[i];
            }

        return minimum;
    }


}


