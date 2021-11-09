package com.bridgelabz.measurement;

public class Inch {
    public  double value;

    public Inch(double value) {
        this.value = value;
    }

    /**
     * Purpose : Compare the Lengths in Inch
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
        Inch inch = (Inch) obj;
        return Double.compare(inch.value, value) == 0;
    }
}
