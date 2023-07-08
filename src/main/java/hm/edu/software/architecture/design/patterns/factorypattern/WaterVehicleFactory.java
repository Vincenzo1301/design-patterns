package hm.edu.software.architecture.design.patterns.factorypattern;

public abstract class WaterVehicleFactory {

    public WaterVehicle build() {
        return buildVehicle();
    }

    protected abstract WaterVehicle buildVehicle();
}
