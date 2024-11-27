package threads.producer_consumer.question;

public class Main {
    public static void main(String[] args) {
        // Shared PizzaShop
        PizzaShop pizzaShop = new PizzaShop(10);

        Chef chef = new Chef(pizzaShop);
        Customer customer = new Customer(pizzaShop);

        // spawning 10 chef threads
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(chef, "Chef #" + i);
            // chef threads will terminate
            // when no non-daemon threads are running
            thread.setDaemon(true);
            thread.start();
        }

        // spawning 100 customer threads
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(customer, "Customer #" + i);
            thread.start();
        }
    }
}
