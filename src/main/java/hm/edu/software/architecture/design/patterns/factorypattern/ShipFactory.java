package hm.edu.software.architecture.design.patterns.factorypattern;

public class ShipFactory extends WaterVehicleFactory {

    @Override
    protected WaterVehicle buildVehicle() {
        return new Ship();
    }
}
