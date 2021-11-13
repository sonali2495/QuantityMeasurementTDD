package com.bridgelabz.measurement;

public class Temperature {
    enum Unit {FAHRENHEIT, CELSIUS}
    public final double value;
    public final Unit unit;

    public Temperature(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Purpose : To Convert Value Fahrenheit to Celsius
     *
     * @return Celsius
     */
    public double convertFahrenheitToCelsius() {
        return (this.value - 32) * 5 / 9;
    }

    public double convertCelsiusToFahrenheit() {
        return (this.value * 9 / 5) + 32;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.value, value) == 0;
    }

}
