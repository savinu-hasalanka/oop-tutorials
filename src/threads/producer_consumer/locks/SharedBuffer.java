package threads.producer_consumer.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedBuffer {
    private final String[] buffer;

    private int in = 0;
    private int out = 0;
    private int count = 0;

    private final ReentrantLock lock = new ReentrantLock();

    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public SharedBuffer(int size) {
        buffer = new String[size];
    }

    public void put(String value) throws InterruptedException {
        // thread locks the lock
        lock.lock();

        // checks if the buffer is full
        // producers go to a waiting state if the buffer is full
        // IMPORTANT : await() method will unlock the lock and send the thread to a waiting state
        // IMPORTANT : producers have its own waiting room AKA Condition object (notEmpty)
        while (count >= buffer.length) {
            notEmpty.await();
        }

        // puts an item into the buffer
        buffer[in] = value;
        in = (in + 1) % buffer.length;
        count++;

        // notify all threads waiting on the "notFull" condition
        // in other words, we are only signalling the consumer threads
        // using Locks and Conditions we can target and signal specific group of threads
        // this is a major advantage of using Locks over monitors and synchronized methods
        notFull.signalAll();

        // thread unlocks the lock
        lock.unlock();

    }

    public String take() throws InterruptedException {
        // thread locks the lock
        lock.lock();

        // checks if the buffer is empty
        // consumers go to a waiting state if the buffer is empty
        // IMPORTANT : await() method will unlock the lock and send the thread to a waiting state
        // IMPORTANT : consumers have its own waiting room AKA Condition object (notFull)
        while (count <= 0) {
            notFull.await();
        }

        // takes an item out from the buffer
        String item = buffer[out];
        out = (out + 1) % buffer.length;
        count--;

        // notify all threads waiting on the "notEmpty" condition
        // in other words, we are only signalling the producer threads
        // using Locks and Conditions we can target and signal specific group of threads
        // this is a major advantage of using Locks over monitors and synchronized methods
        notEmpty.signalAll();

        // thread unlocks the lock
        lock.unlock();

        return item;
    }
}
