package sda.mg.zad34;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();

        System.out.println(Thread.currentThread().getName());
    }
}
