package hm.edu.software.architecture.design.patterns.factorypattern;

public class ManFactory extends HumanFactory {

    @Override
    protected Human createHuman() {
        return new Man();
    }
}
