package ru.karin.nc_hw2.horstmann.Interfaces;

public class Greeter implements Runnable{
    private int n;
    private String target;

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i=0; i<n; i++) {
            System.out.println("Hello" + target);
        }
    }

    public static void main(String[] argv) {
        Greeter g1 = new Greeter(10, "first");
        Greeter g2 = new Greeter(5, "second");
        Thread thread1 = new Thread(g1);
        Thread thread2 = new Thread(g2);
        thread1.start();
        thread2.start();

    }
}
