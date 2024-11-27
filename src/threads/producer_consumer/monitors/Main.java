package threads.producer_consumer.monitors;

import threads.producer_consumer.sync.SharedBuffer;

public class Main {
    public static void main(String[] args) {
        // Buffer that we share between producers and consumers
        threads.producer_consumer.sync.SharedBuffer buffer = new SharedBuffer(10);

        // Implementation of consumer
        // An anonymous inner class
        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        String item = buffer.take();
                        System.out.println(Thread.currentThread().getName() + " takes item: " + item);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // Implementation of producer
        // An anonymous inner class
        Runnable producer = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        String item = Thread.currentThread().getName() + " - " + i ;
                        buffer.put(item);
                        System.out.println("Producer puts items: " + item);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // spawning 10 consumer threads
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(consumer, "Consumer #" + i);
            thread.start();
        }

        // spawning 10 producer threads
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(producer, "Producer #" + i);
            thread.start();
        }

    }
}
