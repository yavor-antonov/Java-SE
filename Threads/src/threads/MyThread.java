package threads;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i<=100; i++) {
            System.out.println("Thread number 1: " + i);
        }
    }
}
