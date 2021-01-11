package ru.karin.nc_hw2.horstmann.Interfaces;

/**
 * Provide an interface Measurable with a method double getMeasure() that measures
 * an object in some way. Make Employee implement Measurable. Provide
 * a method double average(Measurable[] objects) that computes the average
 * measure. Use it to compute the average salary of an array of employees.
 */
public interface Measurable {
    double getMeasure();
    double average(Measurable[] objects);
    Measurable largest(Measurable[] objects);
}
