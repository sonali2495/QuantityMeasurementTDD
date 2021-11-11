package com.bridgelabz.measurement;

import java.util.Objects;

public class Length {
    private static final double FEET_TO_INCH = 12.0;
    private static final double INCH_TO_CM = 2.5;
    private static final double YARD_TO_FEET = 3.0;
    private static final double YARD_TO_INCH = 36.0;
    public enum Unit {FEET, YARD, CENTI_METER, INCH}
    private final Unit unit;
    public double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Purpose : Compare the Lengths
     * * @param that : Taking Lengths
     * @return : if Matches then returning Values
     */

    public boolean compare(Length that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value * FEET_TO_INCH) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value * YARD_TO_FEET) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value * YARD_TO_FEET, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value * YARD_TO_INCH) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * YARD_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.CENTI_METER))
            return Double.compare(this.value * INCH_TO_CM, that.value) == 0;
        if (this.unit.equals(Unit.CENTI_METER) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value, that.value * INCH_TO_CM) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
