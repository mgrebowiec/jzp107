package sda.mg.zad35;

public class Main {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        myThread.start();

        System.out.println(Thread.currentThread().getName());
    }
}
