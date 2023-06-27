package hm.edu.software.architecture.design.patterns.decorator;

public class NullSafeBasket implements Basket {

    private final Basket basket;

    public NullSafeBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void put(int number) {
        if (number > 0) {
            basket.put(number);
        }
    }
}
