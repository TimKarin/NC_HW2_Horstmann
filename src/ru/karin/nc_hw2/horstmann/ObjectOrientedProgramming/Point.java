package ru.karin.nc_hw2.horstmann.ObjectOrientedProgramming;

/**
 * Implement an immutable class Point that describes a point in the plane.
 * Provide a constructor to set it to a specific point, a no-arg constructor to
 * set it to the origin, and methods getX, getY, translate, and scale. The translate
 * method moves the point by a given amount in x- and y-direction. The
 * scale method scales both coordinates by a given factor. Implement these
 * methods so that they return new points with the results
 */
public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double xMove, double yMove) {
        return new Point(x+xMove, y+yMove);
    }

    public Point scale(double scale) {
       return new Point (x*scale,y*scale);
    }
}
