package hm.edu.software.architecture.design.patterns.decorator;

public class NullSafeBasket implements Basket {

    private final Basket basket;

    public NullSafeBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void put(Integer number) {
        if (number != null) {
            basket.put(number);
        } else {
            throw new IllegalArgumentException("Argument cannot be null!");
        }
    }
}
