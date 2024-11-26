package threads.basics;

public class Main {
    public static void main(String[] args) {
        // Method 01 : Extending the Thread class
        // Note : The thread and the task we want run concurrently
        // both are inside one single unit
        // Not a good design in terms of OOP
        // Ideal when we want to be included in the Thread class's inheritance hierarchy
        Thread myThread = new MyThread();
        myThread.start();

        // Method 02 : Implementing the runnable interface
        // Note : The thread and the task we want run concurrently are seperated
        // Good design in terms of OOP
        // Ideal when we want to adapt the concurrent behaviour
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        // IMPORTANT : To start the thread you must call the start() method
        // calling the run methods will result in running your program in a sequential manner

        // TODO : A couple of other way to create threads
        // Method 03 : Anonymous inner-class
        // Method 04 : Lambda expression
    }
}
