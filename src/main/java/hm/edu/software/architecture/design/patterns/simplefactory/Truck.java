package hm.edu.software.architecture.design.patterns.simplefactory;

public class Truck extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Brumm Brumm!");
    }
}
