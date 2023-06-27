package hm.edu.software.architecture.design.patterns.facade;

public class ServiceFacade {

    private final ServiceA serviceA;
    private final ServiceB serviceB;
    private final ServiceC serviceC;

    public ServiceFacade() {
        this.serviceA = new ServiceA();
        this.serviceB = new ServiceB();
        this.serviceC = new ServiceC();
    }

    public void operation() {
        serviceA.foo();
        serviceB.boo();
        serviceC.zoo();
    }
}
