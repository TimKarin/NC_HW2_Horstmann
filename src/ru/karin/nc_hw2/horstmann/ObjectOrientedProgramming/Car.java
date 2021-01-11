package ru.karin.nc_hw2.horstmann.ObjectOrientedProgramming;

/**
 * Implement a class Car that models a car traveling along the x-axis, consuming
 * gas as it moves. Provide methods to drive by a given number of
 * miles, to add a given number of gallons to the gas tank, and to get the
 * current distance from the origin and fuel level. Specify the fuel efficiency
 * (in miles/gallons) in the constructor. Should this be an immutable class?
 * Why or why not?
 *
 * Not, because fields can be changed
 */
public class Car {

    private double distance;
    private double fuelLevel;
    private double efficiency;

    public Car() {
        distance = 0;
        fuelLevel = 50;
        efficiency = 5;
    }

    public Car(double distance, double fuelLevel, double efficiency) {
        this.distance = distance;
        this.fuelLevel = fuelLevel;
        this.efficiency = efficiency;
    }

    public void drive(double miles) {
        if (fuelLevel * efficiency < miles) {
            System.out.println("not enough fuel");
        } else {
            distance += miles;
            fuelLevel -= miles/efficiency;
        }
    }

    public void addFuel(double gallons) {
        fuelLevel += gallons;
    }

    public double getDistance() {
        return distance;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
}
