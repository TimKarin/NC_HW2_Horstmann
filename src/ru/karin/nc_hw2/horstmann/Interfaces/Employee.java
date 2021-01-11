package ru.karin.nc_hw2.horstmann.Interfaces;

public class Employee implements Measurable{
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    @Override
    public double average(Measurable[] objects) {
        double sum = 0;
        for (int i=0; i< objects.length; i++) {
            sum += objects[i].getMeasure();
        }
        return sum/objects.length;
    }

    @Override
    public Measurable largest(Measurable[] objects) {
        int largest = 0;
        for (int i=0; i<objects.length; i++) {
            if (objects[largest].getMeasure() < objects[i].getMeasure()) {
                largest = i;
            }
        }
        return objects[largest];
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Iror", 30000);
        employees[1] = new Employee ("Irina", 5000);
        employees[2] = new Employee ("Alexey", 15000);
        System.out.println("avg salary: " + employees[0].average(employees));
        Employee largest = (Employee) employees[0].largest(employees);
        //cast is needed, because method returns Object.
        System.out.println("largest: " + largest.getName());
    }

}
