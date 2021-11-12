package com.bridgelabz.measurement;

import java.util.Objects;

public class Weight {
    public final Double value;
    public final Unit unit;
    enum Unit {KILOGRAM, GRAMS, TONNE}

    public Weight(Unit unit, Double value) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Objects.equals(value, weight.value) && unit == weight.unit;
    }
}
