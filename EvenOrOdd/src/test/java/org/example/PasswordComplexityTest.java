package org.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordComplexityTest {

    @Test
    public void isPasswordComplexityTest_true() {
        assertTrue(Main.isPasswordComplex("Happy12"));
        assertTrue(Main.isPasswordComplex("1Sarah L ength"));
        assertTrue(Main.isPasswordComplex("Password12"));
        assertTrue(Main.isPasswordComplex("2PassW@ord1"));
        assertTrue(Main.isPasswordComplex("01Sall#y9"));
    }

    @Test
    public void isPasswordComplex_false() {
        assertFalse(Main.isPasswordComplex("12aB"));
        assertFalse(Main.isPasswordComplex("Ab112"));
        assertFalse(Main.isPasswordComplex("happy"));
        assertFalse(Main.isPasswordComplex("happy_1"));
        assertFalse(Main.isPasswordComplex("p assword12"));
        assertFalse(Main.isPasswordComplex("Sur18"));
        assertFalse(Main.isPasswordComplex(""));
    }
}
