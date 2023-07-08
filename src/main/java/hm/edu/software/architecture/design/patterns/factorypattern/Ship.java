package hm.edu.software.architecture.design.patterns.factorypattern;

public class Ship implements WaterVehicle {

    @Override
    public void startEngine() {
        System.out.println("Brumm Brumm!");
    }
}
