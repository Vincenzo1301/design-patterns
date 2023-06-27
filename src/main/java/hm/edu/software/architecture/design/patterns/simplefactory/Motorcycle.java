package hm.edu.software.architecture.design.patterns.simplefactory;

public class Motorcycle extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Wrumm Wrumm!");
    }
}
