package threads.data_race;

public class Incrementor implements Runnable {
    private final Counter counter;

    public Incrementor(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
        System.out.println("Counter: " + counter.getCount());
    }
}
