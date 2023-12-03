/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * Tests for the Expression abstract data type.
 */
public class ExpressionTest {

    // Testing strategy
    //   TODO
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    
    // TODO tests for Expression
    
    
    // Testing for toString
    @Test
    public void testToString() {
        Expression numExp = new NumExp(99);
        Expression varExp = new VarExp("y");

        assertEquals("99.0", numExp.toString());
        assertEquals("y", varExp.toString());
    }

    // Testing for equals
    @Test
    public void testEquals() {
        Expression exp_1 = new NumExp(99);
        Expression exp_2 = new NumExp(99);
        Expression exp_3 = new VarExp("y");

        assertEquals(exp_1, exp_2);
        assertNotEquals(exp_1, exp_3);
    }
    @Test
    public void testHashCode() {
        Expression exp_1 = new NumExp(99);
        Expression exp_2 = new NumExp(99);
        Expression exp_3 = new VarExp("y");

        assertEquals(exp_1.hashCode(), exp_2.hashCode());
        assertNotEquals(exp_1.hashCode(), exp_3.hashCode());
    }
    
}
