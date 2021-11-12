package com.bridgelabz.measurement;

import java.util.Objects;

public class Weight {
    public final Double value;
    public final Unit unit;
    private static final Double KG_INTO_GRAMS = 1000.0;
    enum Unit {KILOGRAM, GRAMS, TONNE}

    public Weight(Unit unit, Double value) {
        this.value = value;
        this.unit = unit;
    }

    /**
     * Purpose : To Compare Weights
     *
     * @param that Taking Weights
     * @return if Units Matches Return Converted Values
     */
    public boolean compare(Weight that) {
        if (this.unit.equals(Unit.KILOGRAM) && that.unit.equals(Unit.GRAMS))
            return Double.compare(this.value * KG_INTO_GRAMS, that.value) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Objects.equals(value, weight.value) && unit == weight.unit;
    }
}
