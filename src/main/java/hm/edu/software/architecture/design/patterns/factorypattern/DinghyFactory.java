package hm.edu.software.architecture.design.patterns.factorypattern;

public class DinghyFactory extends WaterVehicleFactory {

    @Override
    protected WaterVehicle buildVehicle() {
        return new Dinghy();
    }
}
