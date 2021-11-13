package com.bridgelabz.measurement;

public enum MeasurementUnits {
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4),
    GALLON(3.78), LITRE(1.0), MILLI_LITRE(0.001),
    KILOGRAM(1.0), GRAMS(0.001), TONNE(1000.0);
    private final double baseUnitConversion;

    MeasurementUnits(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    /**
     * Purpose : To Convert Into Base Value
     *
     * @param that Taking Value
     * @return Converted Value
     */
    public double convertToBaseUnit(UnitMeasurementSystem that) {
        return (that.value * baseUnitConversion);
    }
}
