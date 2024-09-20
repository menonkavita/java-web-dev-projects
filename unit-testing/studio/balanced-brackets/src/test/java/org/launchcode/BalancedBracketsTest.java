package org.launchcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    // Test 1:
    // Refactor eg test from instructions to use AAA pattern & message parameter
    @Test
    public void onlyBracketsReturnTrue(){
        String message = "a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }


    // Test 2:
    // Test Balanced Brackets in front of other characters - "[]LaunchCode"
    @Test
    public void singleBracketBeforeOtherCharacters(){
        String message = "balanced brackets in front of other characters returns true";
        String testStr = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testStr);
        assertTrue(result, message);
    }


    // Test 3:
    // Test Balanced Brackets around other characters - "[LaunchCode]"
    @Test
    public void balancedBracketsAroundOtherCharacters(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"), "balanced brackets around other characters return true");
    }


    // Test 4:
    // Test Balanced Brackets within other characters - "Launch[Code]"
    @Test
    public void balancedBracketsWithinOtherBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"), "balanced brackets within other brackets returns true");
    }


    // Test 5:
    // Test multiple consecutive pairs of Balanced Brackets- "[][][]"
    @Test
    public void consecutivePairsOfBalancedBrackets(){
        String testStr = "[][][]";
        String message = "multiple consecutive pairs of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets(testStr), message);
    }


    // Test 6:
    // Test multiple nested Balanced Brackets - "[[[]]]"
    @Test
    public void multipleNestedBalancedBrackets(){
        String testStr = "[[[]]]";
        String message = "multiple nested balance brackets returns true";
        boolean result = BalancedBrackets.hasBalancedBrackets(testStr);
        assertTrue(result, message);
    }


    // Test 7:
    // Test single opening bracket - "["
    @Test
    public void testSingleOpeningBracket(){
        String testStr = "[";
        String message = "a single opening bracket should return false";
        boolean result = BalancedBrackets.hasBalancedBrackets(testStr);
        assertFalse(result, message);
    }


    // Test 8:
    // Test single closing bracket - "]"
    @Test
    public void testSingleClosingBracket(){
    String testStr = "]";
    String message = "a single closing bracket should return false";
    boolean result =  BalancedBrackets.hasBalancedBrackets(testStr);
    assertFalse(result, message);
    }


    // Test 9:
    // Test reversed brackets - "]["
    @Test
    public void testReversedBrackets(){
        String testData = "][";
        String message = "matching reversed brackets should return false";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }


    // Test 10:
    // Test single bracket with other characters - "[LaunchCode"
    @Test
    public void testSingleOpeningBracketWithOtherCharacters(){
    String testData = "[LaunchCode";
    String message = "a single bracket with other characters should return false";
    boolean result = BalancedBrackets.hasBalancedBrackets(testData) ;
    assertFalse(result, message);
    }


    // Test 11:
    // Test empty String - ""
    @Test
    public void testEmptyString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(""), "an empty string should return false");
    }


    // Test 12:
    // Test unbalanced brackets among other characters - "Launch]Code["
    @Test
    public void testReversedMatchingBracketsWithCharacters(){
        String testStr = "Launch]Code[";
        String message = "reversed matching brackets among other characters should return false";
        boolean result = BalancedBrackets.hasBalancedBrackets(testStr);
        assertFalse(result, message);
    }


    // Test 13:
    // Test a series of mixed unbalanced brackets - "[[]][]["
    @Test
    public void testMixedUnbalancedBrackets(){
        String testStr = "[[]][][";
        String message = "a series of mixed unbalanced brackets should return false";
        boolean result= BalancedBrackets.hasBalancedBrackets(testStr);
        assertFalse(result, message);
    }


    // Test 14:
    // Test string with only characters & no brackets - "LaunchCode"
    @Test
    public void testNoBracketsAmongText(){
        String testStr = "LaunchCode";
        String message = "string with only characters and no brackets should return false";
        boolean result = BalancedBrackets.hasBalancedBrackets(testStr);
        assertFalse(result, message);
    }


    // Test 15:
    // Test String for only square brackets?? - "{launchCode}", "Launch(Code)"
    @Test
    public void testSquareBalancedBrackets(){
        //String testStr = "{LaunchCode}";
        String testStr = "(LaunchCode)";
        String message = "string with any brackets except balanced square brackets should return false";
        boolean result  = BalancedBrackets.hasBalancedBrackets(testStr);
        assertFalse(result, message);
    }
}