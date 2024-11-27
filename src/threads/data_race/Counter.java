package threads.data_race;

public class Counter {
    private int count;

    public Counter(int initialCount) {
        count = initialCount;
    }

    // this method is not synchronised properly
    // more than one thread can access it at a time
    // this can corrupt the variable "count"
    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
