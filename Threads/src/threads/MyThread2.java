package threads;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i<=100; i++) {
            System.out.println("Thread number 2: " + i);
        }
    }
}