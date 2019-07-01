package com.stackroute.p2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    Factorial ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new Factorial();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void checkFactorialWithIntValue() {

        String res=ob.printIntFactorials();
        assertEquals("\n1\n2\n6\n24\n120\n720\n5040\n40320\n362880\n3628800\n39916800\n479001600out of range",res);

    }
}