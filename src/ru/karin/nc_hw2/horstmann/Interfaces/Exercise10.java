package ru.karin.nc_hw2.horstmann.Interfaces;

/**
 * Implement methods
 * public static void runTogether(Runnable... tasks)
 * public static void runInOrder(Runnable... tasks)
 * The first method should run each task in a separate thread and then return. The second method should run all methods in the current thread
 * and return when the last one has completed.
 */
public class Exercise10 {
    public static void runTogether(Runnable... tasks) throws InterruptedException {
        Thread[] threads = new Thread[tasks.length];
        for (int i=0; i<tasks.length; i++) {
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }
        for (int i=0; i<threads.length; i++) {
            threads[i].join();
        }
    }

    public static void runInOrder(Runnable... tasks) throws InterruptedException {
        Thread[] threads = new Thread[tasks.length];
        for (int i=0; i<tasks.length; i++) {
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
            threads[i].join();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Greeter[] greaters = new Greeter[5];
        for (int i=0; i<greaters.length; i++) {
            greaters[i] = new Greeter(5, "I am " + i);
        }
        System.out.println("Together");
        runTogether(greaters);
        System.out.println("In order");
        runInOrder(greaters);
    }
}
