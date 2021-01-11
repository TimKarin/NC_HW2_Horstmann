package ru.karin.nc_hw2.horstmann.Inharitance;

public abstract class Shape {

    protected Point point;

    public void moveBy(double dx, double dy) {
        point.x += dx;
        point.y += dy;
    }

    public abstract Point getCenter();
}
