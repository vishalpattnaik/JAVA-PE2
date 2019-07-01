package com.stackroute.p2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new StudentMarks();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void showStudentDetails() {

        int marks[] = {86, 65, 98, 77};
        String res = ob.studentDetails(4, marks);

        assertEquals("The average is 81.5 The minimum is 65 The maximum is 98", res);

    }

    @Test
    public void checkValidInput() {

        int marks[] = {56, 45, 61, 75};
        String res = ob.studentDetails(145, marks);
        assertEquals("Please enter valid input", res);

    }

}