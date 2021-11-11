package com.bridgelabz.measurement;

import java.util.Objects;

public class Length {
    private static final double FEET_TO_INCH = 12.0;

    enum Unit {FEET, INCH, YARD};

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
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value) == 0;
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        if(this.unit.equals(Unit.INCH) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value, that.value) == 0;
        if(this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value * FEET_TO_INCH) == 0;
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
