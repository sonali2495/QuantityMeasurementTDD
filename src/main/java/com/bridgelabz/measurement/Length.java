package com.bridgelabz.measurement;

import java.util.Objects;

public class Length {
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
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
