package ru.karin.nc_hw2.horstmann.Inharitance;

public class Line extends Shape implements Cloneable{
    private Point to;

    public Line(Point from, Point to) {
        this.point = from;
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((point.getX()+to.getX())/2, (point.getY()+to.getY())/2);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Line(new Point(point.getX(), point.getY()), new Point(to.getX(), to.getY()));
    }
}
