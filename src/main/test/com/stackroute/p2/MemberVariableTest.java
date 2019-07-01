package com.stackroute.p2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new MemberVariable();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void displayDetails() {

        ob.initializeData("Harry Potter", 30, 2500.3);
        String res = ob.displayData();
        assertEquals("Members Name: Harry Potter Members age: 30 Members salary: 2500.3", res);

    }

    @Test
    public void displayDetailsAgain() {

        ob.initializeData("Vishal Pattnaik", 22, 27000.7674);
        String res = ob.displayData();
        assertEquals("Members Name: Vishal Pattnaik Members age: 22 Members salary: 27000.7674", res);

    }

}