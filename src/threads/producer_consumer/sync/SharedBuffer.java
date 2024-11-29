package threads.producer_consumer.sync;

public class SharedBuffer {
    private String[] buffer;

    private int in;
    private int out;
    private int count;

    public SharedBuffer(int size) {
        this.buffer = new String[size];
    }

    // synchronized methods uses "this" object as the monitor
    // thread acquires "this" object as it goes inside the synchronized method
    public synchronized void put(String item) throws InterruptedException {
        // checks if the buffer is full
        // producers go to a waiting state if the buffer is full
        // IMPORTANT : wait() method will release the monitor object and send the thread to a waiting state
        while (count >= buffer.length) {
            // following code can also be written as this.wait()
            wait();
        }

        // puts an item into the buffer
        buffer[in] = item;
        in = (in + 1) % buffer.length;
        count++;

        // notify all threads waiting on "this" monitor
        // in an ideal scenario we want to notify only the consumer threads
        // however, target notifying is not possible using monitors or synchronized methods
        // following code can also be written as this.notifyAll()
        notifyAll();
    }
    // thread releases "this" object as exists from the synchronized method


    // synchronized methods uses "this" object as the monitor
    // thread acquires "this" object as it goes inside the synchronized method
    public synchronized String take() throws InterruptedException {
        // checks if the buffer is empty
        // consumers go to a waiting state if the buffer is empty
        // IMPORTANT : wait() method will release the monitor object and send the thread to a waiting state
        while (count <= 0) {
            // following code can also be written as this.wait()
            wait();
        }

        // takes an item out from the buffer
        String item = buffer[out];
        out = (out + 1) % buffer.length;
        count--;

        // notify all threads waiting on "this" monitor
        // in an ideal scenario we want to notify only the producer threads
        // however, target notifying is not possible using monitors or synchronized methods
        // following code can also be written as this.notifyAll()
        notifyAll();
        return item;
    }
    // thread releases "this" object as exists from the synchronized method
}
