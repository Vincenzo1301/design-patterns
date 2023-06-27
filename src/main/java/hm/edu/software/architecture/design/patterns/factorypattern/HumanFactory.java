package hm.edu.software.architecture.design.patterns.factorypattern;

public abstract class HumanFactory {

    protected abstract Human createHuman();

    public Human create() {
        return createHuman();
    }
}
