package hm.edu.software.architecture.design.patterns.factorypattern;

public class Dinghy implements WaterVehicle {

    @Override
    public void startEngine() {
        System.out.println("Wrumm Wrumm!");
    }
}
