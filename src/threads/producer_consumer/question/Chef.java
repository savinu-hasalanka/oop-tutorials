package threads.producer_consumer.question;

public class Chef implements Runnable {
    private final PizzaShop pizzaShop;

    public Chef(PizzaShop pizzaShop) {
        this.pizzaShop = pizzaShop;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String order = pizzaShop.prepareOrder();
                System.out.println(Thread.currentThread().getName() + " prepares order: " + order);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
