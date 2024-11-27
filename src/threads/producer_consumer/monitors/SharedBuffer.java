package threads.producer_consumer.monitors;

public class SharedBuffer {
    private final String[] buffer;

    private int in = 0;
    private int out = 0;
    private int count = 0;

    private final Object monitor = new Object();

    public SharedBuffer(int size) {
        buffer = new String[size];
    }


    public void put(String value) throws InterruptedException {
        // following synchronized block uses "monitor" object as the monitor
        // thread acquires the "monitor" object as it goes inside the synchronized block
        synchronized (monitor) {
            // checks if the buffer is full
            // producers go to a waiting state if the buffer is full
            // IMPORTANT : wait() method will release the monitor object and send the thread to a waiting state
            while (count >= buffer.length) {
                monitor.wait();
            }

            // puts an item into the buffer
            buffer[in] = value;
            in = (in + 1) % buffer.length;
            count++;

            // notify all threads waiting on the "monitor" object
            // in an ideal scenario we want to notify only the consumer threads
            // however, target notifying is not possible using monitors or synchronized methods
            monitor.notifyAll();
        }
        // thread releases monitor object as exists from the synchronized block
    }

    public String take() throws InterruptedException {
        // following synchronized block uses "monitor" object as the monitor
        // thread acquires the "monitor" object as it goes inside the synchronized block
        synchronized (monitor) {
            // checks if the buffer is empty
            // consumers go to a waiting state if the buffer is empty
            // IMPORTANT : wait() method will release the monitor object and send the thread to a waiting state
            while (count <= 0) {
                monitor.wait();
            }

            // takes an item out from the buffer
            String item = buffer[out];
            out = (out + 1) % buffer.length;
            count--;

            // notify all threads waiting on the "monitor" object
            // in an ideal scenario we want to notify only the producer threads
            // however, target notifying is not possible using monitors or synchronized methods
            monitor.notifyAll();

            return item;
        }
        // thread releases monitor object as exists from the synchronized block
    }
}
