package ru.karin.nc_hw2.horstmann.Inharitance;

public class Rectangle extends Shape implements Cloneable{
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        this.point = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX()+width/2, point.getY() + height/2);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Rectangle(new Point(point.getX(), point.getY()), width, height);
    }
}
