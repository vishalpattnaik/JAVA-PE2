package com.stackroute.p2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FourPowerTest {

    FourPower ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new FourPower();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void checkPowerOfFourTrue() {

        String res = ob.checkPowerOfFour(64);
        assertEquals("Power of 4", res);

    }

    @Test
    public void checkPowerOfFourFalse() {

        String res = ob.checkPowerOfFour(41);
        assertEquals("Not power of 4", res);

    }


    @Test
    public void checkIfNumIsZero() {

        String res = ob.checkPowerOfFour(0);
        assertEquals("Not power of 4", res);

    }

    @Test
    public void checkForCharacterReturnMessage() {

        String res = ob.checkPowerOfFour('f');
        assertEquals("Invalid input", res);

    }

}