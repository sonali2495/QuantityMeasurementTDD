package com.bridgelabz.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeasurementTest {
    @Test
    public void given0Feetand0Feet_shouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        assertEquals(feet1, feet2, "Assert Equal test failed! ");
    }

    @Test
    public void given0Feetand0Feet_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        assertNotEquals(feet1, feet2, "Assert Not Equal test failed! ");
    }

    @Test
    public void given0Inchand0Inch_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        assertEquals(inch1, inch2, "Assert Equal test failed!");
    }

    @Test
    public void given0Inchand0Inch_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        assertNotEquals(inch1, inch2, "Assert Not Equal test failed!");
    }

    @Test
    public void given0Yardand0Yard_shouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD,0.0);
        assertEquals(yard1, yard2, "Assert Equal test failed!");
    }

    @Test
    public void given0Yardand0Yard_shouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD,1.0);
        assertNotEquals(yard1, yard2, "Assert Not Equal test failed!");
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0Feetand0Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Inch_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        assertTrue(compareCheck);
    }

    @Test
    public void given12Inchand1Feet_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH,12.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        assertTrue(compareCheck);
    }
}
