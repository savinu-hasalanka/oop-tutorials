package threads.data_race;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        Incrementor incrementor = new Incrementor(counter);

        Thread thread01 = new Thread(incrementor);
        Thread thread02 = new Thread(incrementor);
        Thread thread03 = new Thread(incrementor);

        thread01.start();
        thread02.start();
        thread03.start();

        // Expected outcome: 3000
        // However, actual output changes almost everytime the program runs
        // Reason: Improper synchronisation in  increment() in Counter class
        // Multiple threads write value to count variable resulting a corrupted variable
        // Solution: Use proper synchronisation using synchronised methods, monitors, locks etc
        // this ensures only one thread at a time access the critical section of the code

        // This issue is commonly known as data race in concurrent programming
    }
}
