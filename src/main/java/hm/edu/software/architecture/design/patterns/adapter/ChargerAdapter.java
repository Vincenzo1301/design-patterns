package hm.edu.software.architecture.design.patterns.adapter;

public class ChargerAdapter implements Charger {

    private EuropeanCharger europeanCharger;

    public ChargerAdapter(EuropeanCharger europeanCharger) {
        this.europeanCharger = europeanCharger;
    }

    @Override
    public void charge() {
        europeanCharger.connect();
        europeanCharger.supplyPower();
    }
}
