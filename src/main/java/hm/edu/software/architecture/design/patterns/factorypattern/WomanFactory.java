package hm.edu.software.architecture.design.patterns.factorypattern;

public class WomanFactory extends HumanFactory {

    @Override
    protected Human createHuman() {
        return new Woman();
    }
}
