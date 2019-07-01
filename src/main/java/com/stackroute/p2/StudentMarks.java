package com.stackroute.p2;

public class StudentMarks {


    public String studentDetails(int noOfStudents, int[] marks) {

        float avg = average(noOfStudents, marks);
        int maxMarks = max(noOfStudents, marks);
        int minMarks = min(noOfStudents, marks);

        if(!(noOfStudents>=0 && noOfStudents<=100))
            return "Please enter valid input";
        else
            return "The average is " + avg + " The minimum is " + minMarks + " The maximum is " + maxMarks;

    }

    public float average(int n, int[] marks) {

        float sum = 0;
        for(int i=0; i<marks.length; i++) {

            sum = sum + marks[i];

        }

        return sum/marks.length;

    }

    public int max(int n, int[] marks) {

        int maximum= marks[0];
        for(int i=1; i<marks.length; i++) {
                if (marks[i] > maximum)
                    maximum = marks[i];
        }
        return maximum;
    }

    public int min(int n, int[] marks) {

        int minimum=marks[0];
        for(int i=1; i<marks.length; i++) {
                if(marks[i] < minimum)
                    minimum = marks[i];
            }

        return minimum;
    }


}


