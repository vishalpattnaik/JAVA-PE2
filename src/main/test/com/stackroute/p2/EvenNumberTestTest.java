package com.stackroute.p2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTestTest {

    EvenNumberTest ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new EvenNumberTest();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;
    }

    @Test
    public void checkEvenNumberTrueReturnMessage() {

        boolean res = ob.isEven(100);
        assertEquals(true, res);

    }

    @Test
    public void checkEvenNumberFalseReturnMessage() {

        boolean res = ob.isEven(13);
        assertEquals(false, res);

    }

    @Test
    public void checkNumberOrCharacterReturnErrorMessage() {

        boolean res = ob.isEven(13);
        assertEquals(false, res);

    }

}