package com.bridgelabz.measurement;

public class Volume {
    enum Unit {GALLON, MILLI_LITER, LITER}
    private final double value;
    private final Unit unit;
    public Volume(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 && unit == volume.unit;

    }
}
