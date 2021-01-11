package ru.karin.nc_hw2.horstmann.Inharitance;

import java.util.Objects;

public class LabeledPoint extends Point {

    String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "label='" + label + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LabeledPoint that = (LabeledPoint) o;
        return label.equals(that.label) && Double.compare(x, that.x) == 0 && Double.compare(x, that.x) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, x, y);
    }
}
