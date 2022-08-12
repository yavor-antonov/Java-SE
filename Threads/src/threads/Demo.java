package threads;

public class Demo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread with anonymous class");
            }
        }).start();

        new Thread(() -> System.out.println("Thread wit lambda expression")).start();

        // creating a thread
        MyThread thread = new MyThread();
        // starts the thread
        thread.start();

        // creating a thread
        Thread thread2 = new Thread(new MyThread2());
        thread2.start();

        for (int i = 1; i<=100; i++) {
            System.out.println("Main thread 1: " + i);
        }
    }
}
