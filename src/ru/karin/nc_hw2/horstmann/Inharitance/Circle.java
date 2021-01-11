package ru.karin.nc_hw2.horstmann.Inharitance;

public class Circle extends Shape implements Cloneable {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Circle(new Point(center.getX(), center.getY()), radius);
    }
}
