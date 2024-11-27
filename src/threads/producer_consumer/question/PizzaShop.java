package threads.producer_consumer.question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PizzaShop {
    private final Queue<String> orderQueue = new LinkedList<>();
    private final int capacity;
    private final Lock lock = new ReentrantLock();

    private final Condition queueEmpty = lock.newCondition();
    private final Condition queueFull = lock.newCondition();

    public PizzaShop(int capacity) {
        this.capacity = capacity;
    }

    public void placeOrder(String order) throws InterruptedException {
        // acquires the lock
        lock.lock();

        // checks if the queue is full
        while (orderQueue.size() >= capacity) {
            System.out.println(Thread.currentThread().getName() + " going to wait");
            // sends the thread to a waiting state
            // thread will give up the lock as it goes to the waiting state
            queueFull.await();
        }

        // performs the critical action
        orderQueue.add(order);

        System.out.println(Thread.currentThread().getName() + " added order");

        // signals all the threads waiting on "queueEmpty" condition AKA Chefs
        queueEmpty.signalAll();

        // releases the lock
        lock.unlock();
    }

    public  String prepareOrder() throws InterruptedException {
        // acquires the lock
        lock.lock();

        // checks if the queue is full
        while (orderQueue.isEmpty()) {
            System.out.println(Thread.currentThread().getName() + " going to wait");
            // sends the thread to a waiting state
            // thread will give up the lock as it goes to the waiting state
            queueEmpty.await();
        }

        // performs the critical action
        String order = orderQueue.poll();

        // signals all the threads waiting on "queueFull" condition AKA Consumer
        queueFull.signalAll();

        // releases the lock
        lock.unlock();
        return order;
    }
}
