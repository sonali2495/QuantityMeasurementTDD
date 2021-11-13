package com.bridgelabz.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeasurementTest {
    @Test
    public void given0Feetand0Feet_shouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(MeasurementUnits.FEET, 0.0);
        assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand0Feet_shouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET,0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(MeasurementUnits.FEET,1.0);
        assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0Inchand0Inch_shouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(MeasurementUnits.INCH, 0.0);
        assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand0Inch_shouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(MeasurementUnits.INCH, 1.0);
        assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0Yardand0Yard_shouldReturnEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(MeasurementUnits.YARD, 0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(MeasurementUnits.YARD,0.0);
        assertEquals(yard1, yard2);
    }

    @Test
    public void given0Yardand0Yard_shouldReturnNotEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(MeasurementUnits.YARD, 0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(MeasurementUnits.YARD,1.0);
        assertNotEquals(yard1, yard2);
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET,0.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 0.0);
        assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0Feetand0Inch_ShouldReturnEqualLength() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET,0.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqualLength() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET,1.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_ShouldReturnEqualLength() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET,1.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(MeasurementUnits.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Inch_ShouldReturnEqualLength() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 1.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(MeasurementUnits.INCH, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        assertTrue(compareCheck);
    }

    @Test
    public void given12Inchand1Feet_ShouldReturnEqualLength() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 12.0);
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        assertTrue(compareCheck);
    }

    @Test
    public void given0InchandNullInch_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(MeasurementUnits.INCH, 0.0);
        boolean result = inch.equals(null);
        assertFalse(result);
    }

    @Test
    public void givenInchandInchFromSameRef_WhenEqual_ShouldReturnTrue() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH,0.0);
        boolean result = inch1 == inch1;
        assertTrue(result);
    }

    @Test
    public void given0Inchand0InchFromDifferentType_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH,0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(MeasurementUnits.INCH, 0.0);
        assertNotSame(inch1, inch2);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnTrue() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(MeasurementUnits.FEET, 3.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(MeasurementUnits.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(MeasurementUnits.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnFalse() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(MeasurementUnits.INCH, 1.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(MeasurementUnits.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        assertFalse(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnTrue() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(MeasurementUnits.INCH, 36.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(MeasurementUnits.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnTrue() {
        UnitMeasurementSystem yard = new UnitMeasurementSystem(MeasurementUnits.YARD, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(MeasurementUnits.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnTrue() {
        UnitMeasurementSystem yard = new UnitMeasurementSystem(MeasurementUnits.YARD, 1.0);
        UnitMeasurementSystem feet = new UnitMeasurementSystem(MeasurementUnits.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Cm_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(MeasurementUnits.INCH, 2.0);
        UnitMeasurementSystem cm = new UnitMeasurementSystem(MeasurementUnits.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(cm);
        assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(MeasurementUnits.INCH, 2.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(MeasurementUnits.INCH, 2.0);
        double actualSum = inch1.addTwoLengths(inch2);
        assertEquals(4.0, actualSum);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(MeasurementUnits.INCH, 2.0);
        double actualSum = feet.addTwoLengths(inch);
        assertEquals(14.0, actualSum);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(MeasurementUnits.FEET, 1.0);
        double actualSum = feet1.addTwoLengths(feet2);
        assertEquals(24.0, actualSum);
    }

    @Test
    public void given2Inch2$5Cm_WhenAdded_ShouldReturn3Inch() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(MeasurementUnits.INCH, 2.0);
        UnitMeasurementSystem cm = new UnitMeasurementSystem(MeasurementUnits.CENTIMETER, 2.5);
        double actualSum = inch.addTwoLengths(cm);
        assertEquals(3.0, actualSum);
    }

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqualVolume() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(MeasurementUnits.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(MeasurementUnits.GALLON, 0.0);
        assertEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAnd2Gallon_ShouldReturnNotEqualVolume() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(MeasurementUnits.GALLON, 2.0);
        assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAndNull_ShouldReturnNotEqualVolume() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        UnitMeasurementSystem gallon2 = null;
        assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAnd1GallonFromDiffRef_ShouldReturnNotEqualVolume() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        assertNotSame(gallon1, gallon2);
    }

    @Test
    public void give0LiterAnd0Liter_ShouldReturnEqualVolume() {
        UnitMeasurementSystem liter1 = new UnitMeasurementSystem(MeasurementUnits.LITRE, 0.0);
        UnitMeasurementSystem liter2 = new UnitMeasurementSystem(MeasurementUnits.LITRE, 0.0);
        assertEquals(liter1, liter2);
    }

    @Test
    public void give1LiterAnd2Liter_ShouldReturnNotEqualVolume() {
        UnitMeasurementSystem liter1 = new UnitMeasurementSystem(MeasurementUnits.LITRE, 1.0);
        UnitMeasurementSystem liter2 = new UnitMeasurementSystem(MeasurementUnits.LITRE, 2.0);
        assertNotEquals(liter1, liter2);
    }

    @Test
    public void given1LitreAndNull_ShouldReturnNotEqualVolume() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(MeasurementUnits.LITRE, 1.0);
        UnitMeasurementSystem litre2 = null;
        assertNotEquals(litre1, litre2);
    }

    @Test
    public void given1GallonAnd1Liter_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(MeasurementUnits.LITRE, 0.0);
        UnitMeasurementSystem liter = new UnitMeasurementSystem(MeasurementUnits.LITRE, 0.0);
        boolean compareCheck = gallon.compare(liter);
        assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd1Liter_WhenCompared_ShouldReturnNotEqualVolume() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(MeasurementUnits.LITRE, 1.0);
        boolean compareCheck = gallon.compare(litre);
        assertFalse(compareCheck);
    }

    @Test
    public void given1GallonAnd3$78Liter_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        UnitMeasurementSystem liter = new UnitMeasurementSystem(MeasurementUnits.LITRE, 3.78);
        boolean compareCheck = gallon.compare(liter);
        assertTrue(compareCheck);
    }

    @Test
    public void given1LiterAnd1000MilliLiter_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem liter = new UnitMeasurementSystem(MeasurementUnits.LITRE, 1.0);
        UnitMeasurementSystem ml = new UnitMeasurementSystem(MeasurementUnits.MILLI_LITRE, 1000.0);
        boolean compareCheck = liter.compare(ml);
        assertTrue(compareCheck);
    }

    @Test
    public void given1000MilliLiterAnd1Liter_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem ml = new UnitMeasurementSystem(MeasurementUnits.MILLI_LITRE, 1000.0);
        UnitMeasurementSystem liter = new UnitMeasurementSystem(MeasurementUnits.LITRE, 1.0);
        boolean compareCheck = ml.compare(liter);
        assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3$78Liter_WhenAdded_ShouldReturn7$57Liter() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(MeasurementUnits.GALLON, 1.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(MeasurementUnits.LITRE, 3.78);
        double actualSum = gallon.addTwoLengths(litre);
        assertEquals(7.56, actualSum);
    }

    @Test
    public void given1LiterAnd1000MilliLiter_WhenAdded_ShouldReturn2Liter() {
        UnitMeasurementSystem liter = new UnitMeasurementSystem(MeasurementUnits.LITRE, 1.0);
        UnitMeasurementSystem ml = new UnitMeasurementSystem(MeasurementUnits.MILLI_LITRE, 1000.0);
        double actualSum = liter.addTwoLengths(ml);
        assertEquals(2, actualSum);
    }



    @Test
    public void givenKg_WhenSameType_ShouldReturnEqual() {
        UnitMeasurementSystem kg1 = new UnitMeasurementSystem(MeasurementUnits.KILOGRAM, 1.0);
        UnitMeasurementSystem kg2 = new UnitMeasurementSystem(MeasurementUnits.KILOGRAM, 1.0);
        assertEquals(kg1.getClass(), kg2.getClass());
    }

    @Test
    public void givenGram_WhenSameType_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 1000.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 1000.0);
        assertEquals(gram1.getClass(), gram2.getClass());
    }

    @Test
    public void givenTonne_WhenSameType_ShouldReturnEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(MeasurementUnits.TONNE, 1.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(MeasurementUnits.TONNE, 1.0);
        assertEquals(tonne1.getClass(), tonne2.getClass());
    }

    @Test
    public void given1KgAnd1Kg_WhenCompare_ShouldReturnEqual() {
        UnitMeasurementSystem kg1 = new UnitMeasurementSystem(MeasurementUnits.KILOGRAM, 1.0);
        UnitMeasurementSystem kg2 = new UnitMeasurementSystem(MeasurementUnits.KILOGRAM, 1.0);
        assertEquals(kg1, kg2);
    }

    @Test
    public void given1000gramAnd1000gram_WhenCompare_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 1000.0);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 1000.0);
        assertEquals(gram1, gram2);
    }

    @Test
    public void given1TonneAnd1Tonne_WhenCompare_ShouldReturnEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(MeasurementUnits.TONNE, 1.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(MeasurementUnits.TONNE, 1.0);
        assertEquals(tonne1, tonne2);
    }

    @Test
    public void given1kgAnd1000Grams_WhenCompare_ShouldReturnTrue() {
        UnitMeasurementSystem kg = new UnitMeasurementSystem(MeasurementUnits.KILOGRAM, 1.0);
        UnitMeasurementSystem gram = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 1000.0);
        boolean compareCheck = kg.compare(gram);
        assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kg_WhenCompare_ShouldReturnTrue() {
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(MeasurementUnits.TONNE, 1.0);
        UnitMeasurementSystem gram = new UnitMeasurementSystem(MeasurementUnits.GRAMS, 1000.0);
        double add = tonne.addTwoLengths(gram);
        assertEquals(1001.0, add);
    }

    @Test
    public void givenFahrenheitAndFahrenheit_ShouldReturnEqual() {
        Temperature fahrenheit1 = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        Temperature fahrenheit2 = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        assertEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenFahrenheitAndFahrenheit_ShouldReturnNotEqual() {
        Temperature fahrenheit1 = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        Temperature fahrenheit2 = new Temperature(Temperature.Unit.FAHRENHEIT, 200.0);
        assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void givenFahrenheit_WhenNull_ShouldReturnFalse() {
        Temperature fahrenheit = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        boolean nullCheck = fahrenheit.equals(null);
        assertFalse(nullCheck);
    }

    @Test
    public void givenFahrenheit1AndFahrenheit2_WhenEqualType_ShouldReturnEqual() {
        Temperature fahrenheit1 = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        Temperature fahrenheit2 = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        assertEquals(fahrenheit1.getClass(), fahrenheit2.getClass());
    }

    @Test
    public void given212FahrenheitAnd100C_WhenCompared_ShouldReturnEqual() {
        Temperature fahrenheit = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        double celsius = fahrenheit.convertFahrenheitToCelsius();
        assertEquals(100.0, celsius);
    }

    @Test
    public void given100Celsius_WhenConvert_ShouldReturn212F() {
        Temperature celsius = new Temperature(Temperature.Unit.CELSIUS, 100.0);
        double fahrenheit = celsius.convertCelsiusToFahrenheit();
        assertEquals(212.0, fahrenheit);
    }
}
