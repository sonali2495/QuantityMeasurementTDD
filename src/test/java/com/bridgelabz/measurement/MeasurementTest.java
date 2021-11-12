package com.bridgelabz.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeasurementTest {
    @Test
    public void given0Feetand0Feet_shouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand0Feet_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0Inchand0Inch_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand0Inch_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0Yardand0Yard_shouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD,0.0);
        assertEquals(yard1, yard2);
    }

    @Test
    public void given0Yardand0Yard_shouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD,1.0);
        assertNotEquals(yard1, yard2);
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
    public void given12Inchand1Feet_ShouldReturnEqualLength() {
        Feet feetToInch = new Feet();
        boolean result = feetToInch.lengthComparison(1.0, 12.0);
        assertTrue(result);
    }

    @Test
    public void given0InchandNullInch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        assertNotSame(inch1, inch2);
    }

    @Test
    public void givenInchandInchFromSameRef_WhenEqual_ShouldReturnTrue() {
        Inch inch1 = new Inch(0);
        boolean result = inch1 == inch1;
        assertTrue(result);
    }

    @Test
    public void given0Inchand0InchFromDifferentType_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0);
        assertNotSame(inch1, inch2);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 3.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        assertFalse(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 36.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnTrue() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length inch = new Length(Length.Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnTrue() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Cm_WhenCompared_ShouldReturnEqualLength() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length cm = new Length(Length.Unit.CENTI_METER, 5.0);
        boolean compareCheck = inch.compare(cm);
        assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        Length inch2 = new Length(Length.Unit.INCH, 2.0);
        Length expectedSum = new Length(Length.Unit.INCH, 4.0);
        Length actualSum = inch1.sumOfLength(inch2);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length expectedSum = new Length(Length.Unit.INCH, 14.0);
        Length actualSum = feet.sumOfLength(inch);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Length expectedSum = new Length(Length.Unit.INCH, 24.0);
        Length actualSum = feet1.sumOfLength(feet2);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given2Inch2$5Cm_WhenAdded_ShouldReturn3Inch() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length cm = new Length(Length.Unit.CENTI_METER, 2.5);
        Length expectedSum = new Length(Length.Unit.INCH, 3.0);
        Length actualSum = inch.sumOfLength(cm);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 0.0);
        assertEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAnd2Gallon_ShouldReturnNotEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 2.0);
        assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAndNull_ShouldReturnNotEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = null;
        assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAnd1GallonFromDiffRef_ShouldReturnNotEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        assertNotSame(gallon1, gallon2);
    }

    @Test
    public void give0LiterAnd0Liter_ShouldReturnEqualVolume() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 0.0);
        Volume liter2 = new Volume(Volume.Unit.LITER, 0.0);
        assertEquals(liter1, liter2);
    }

    @Test
    public void give1LiterAnd2Liter_ShouldReturnNotEqualVolume() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 1.0);
        Volume liter2 = new Volume(Volume.Unit.LITER, 2.0);
        assertNotEquals(liter1, liter2);
    }

    @Test
    public void given1LitreAndNull_ShouldReturnNotEqualVolume() {
        Volume litre1 = new Volume(Volume.Unit.LITER, 1.0);
        Volume litre2 = null;
        assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0GallonAnd0Liter_WhenCompared_ShouldReturnEqualVolume() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 0.0);
        Volume liter = new Volume(Volume.Unit.LITER, 0.0);
        boolean compareCheck = gallon.compare(liter);
        assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd1Liter_WhenCompared_ShouldReturnNotEqualVolume() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        boolean compareCheck = gallon.compare(liter);
        assertFalse(compareCheck);
    }

    @Test
    public void given1GallonAnd3$78Liter_WhenCompared_ShouldReturnEqualVolume() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        boolean compareCheck = gallon.compare(liter);
        assertTrue(compareCheck);
    }

    @Test
    public void given1LiterAnd1000MilliLiter_WhenCompared_ShouldReturnEqualVolume() {
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        boolean compareCheck = liter.compare(ml);
        assertTrue(compareCheck);
    }

    @Test
    public void given1000MilliLiterAnd1Liter_WhenCompared_ShouldReturnEqualVolume() {
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        boolean compareCheck = ml.compare(liter);
        assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3$78Liter_WhenAdded_ShouldReturn7$57Liter() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        Volume expectedSum = new Volume(Volume.Unit.LITER, 7.56);
        Volume actualSum = gallon.sumOfVolume(liter);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1LiterAnd1000MilliLiter_WhenAdded_ShouldReturn2Liter() {
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        Volume expectedSum = new Volume(Volume.Unit.LITER, 2.0);
        Volume actualSum = liter.sumOfVolume(ml);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void givenKg_WhenNull_ShouldReturnFalse() {
        Weight kg = new Weight(Weight.Unit.KILOGRAM, null);
        boolean result = kg.equals(null);
        assertFalse(result);
    }

    @Test
    public void givenGrams_WhenNull_ShouldReturnFalse() {
        Weight grams = new Weight(Weight.Unit.GRAMS, null);
        boolean result = grams.equals(null);
        assertFalse(result);
    }

    @Test
    public void givenTonne_WhenNull_ShouldReturnFalse() {
        Weight tonne = new Weight(Weight.Unit.TONNE, null);
        boolean result = tonne.equals(null);
        assertFalse(result);
    }

    @Test
    public void givenKg_WhenSameType_ShouldReturnEqual() {
        Weight kg1 = new Weight(Weight.Unit.KILOGRAM, 1.0);
        Weight kg2 = new Weight(Weight.Unit.KILOGRAM, 1.0);
        assertEquals(kg1.getClass(), kg2.getClass());
    }

    @Test
    public void givenGram_WhenSameType_ShouldReturnEqual() {
        Weight gram1 = new Weight(Weight.Unit.GRAMS, 1000.0);
        Weight gram2 = new Weight(Weight.Unit.GRAMS, 1000.0);
        assertEquals(gram1, gram2);
    }

    @Test
    public void givenTonne_WhenSameType_ShouldReturnEqual() {
        Weight tonne1 = new Weight(Weight.Unit.TONNE, 1.0);
        Weight tonne2 = new Weight(Weight.Unit.TONNE, 1.0);
        assertEquals(tonne1, tonne2);
    }
}
