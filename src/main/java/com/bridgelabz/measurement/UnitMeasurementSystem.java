package com.bridgelabz.measurement;

import java.util.Objects;

public class UnitMeasurementSystem {
    public double value;
    private final MeasurementUnits unit;


    public UnitMeasurementSystem(MeasurementUnits unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Purpose: Given Two Lengths Should add and return Expected Value
     * @param that Taking Lengths
     * @return addition of two lengths
     */
    public double addTwoLengths(UnitMeasurementSystem that) {
        return this.unit.convertToBaseUnit(this) + that.unit.convertToBaseUnit(that);
    }

    /**
     * Purpose : Compare the Lengths
     * * @param that : Converted Values
     * @return : Converted Values
     */
    public boolean compare(UnitMeasurementSystem that) {
        return Double.compare(this.unit.convertToBaseUnit(this), that.unit.convertToBaseUnit(that)) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurementSystem unitMeasurementSystem = (UnitMeasurementSystem) o;
        return Double.compare(unitMeasurementSystem.value, value) == 0 && unit == unitMeasurementSystem.unit;
    }
}
