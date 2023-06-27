package hm.edu.software.architecture.design.patterns.decorator;

public class WoodenBasket implements Basket {

    @Override
    public void put(int number) {
        System.out.println("In den Korb gelegt: " + number);
    }
}
