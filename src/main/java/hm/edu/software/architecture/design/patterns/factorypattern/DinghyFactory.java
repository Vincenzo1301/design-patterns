package hm.edu.software.architecture.design.patterns.factorypattern;

import hm.edu.software.architecture.design.patterns.simplefactory.Vehicle;

public class DinghyFactory extends WaterVehicleFactory {

    @Override
    protected WaterVehicle buildVehicle() {
        return new Dinghy();
    }
}
