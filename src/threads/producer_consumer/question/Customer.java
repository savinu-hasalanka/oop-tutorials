package threads.producer_consumer.question;

public class Customer implements Runnable {
    private final PizzaShop pizzaShop;

    public Customer(PizzaShop pizzaShop) {
        this.pizzaShop = pizzaShop;
    }

    @Override
    public void run() {
        try {
            pizzaShop.placeOrder(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
