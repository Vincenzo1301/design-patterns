package hm.edu.software.architecture.design.patterns.adapter;

public class EuropeanCharger {

    void connect() {
        System.out.println("European charger connected.");
    }

    void supplyPower() {
        System.out.println("Supplying power using European charger.");
    }
}
