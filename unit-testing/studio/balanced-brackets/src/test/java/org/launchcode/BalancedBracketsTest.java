package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    @Test
    public void onlyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void reversedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void nestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch]Code]"));
    }
    @Test
    public void threeLeftClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[["));
    }
    @Test
    public void missingClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void unbalancedOpeningBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]"));
    }
    @Test
    public void noBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }
    @Test
    public void specialCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[!@#$$%^&*()]"));
    }
    @Test
    public void multipleBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]"));
    }
    @Test
    public void singleOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void singleClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}