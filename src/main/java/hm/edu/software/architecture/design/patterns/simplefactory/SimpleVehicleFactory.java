package hm.edu.software.architecture.design.patterns.simplefactory;

public class SimpleVehicleFactory {

    public static Vehicle createVehicle(String type) {
        Vehicle vehicle;
        if (type.equals("Motorcycle")) {
            vehicle = new Motorcycle();
        } else if (type.equals("Truck")) {
            vehicle = new Truck();
        } else {
            throw new IllegalArgumentException("Type " + type + " is not supported!");
        }

        return vehicle;
    }
}
