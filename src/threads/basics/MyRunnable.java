package threads.basics;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        // code that we want to run concurrently
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
