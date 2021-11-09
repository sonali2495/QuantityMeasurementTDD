package com.bridgelabz.measurement;

public class Yard {
    public double value;

    public Yard(double value) {
        this.value = value;
    }

    /**
     * Purpose : Compare the Lengths in Yard
     * * @param that : Taking Lengths
     * @return : if Matches then returning Values
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Yard yard = (Yard) obj;
        return Double.doubleToLongBits(value) == Double.doubleToLongBits(yard.value);
    }
}
