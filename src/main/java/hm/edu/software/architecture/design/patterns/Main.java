package hm.edu.software.architecture.design.patterns;

import hm.edu.software.architecture.design.patterns.adapter.Charger;
import hm.edu.software.architecture.design.patterns.adapter.ChargerAdapter;
import hm.edu.software.architecture.design.patterns.adapter.EuropeanCharger;
import hm.edu.software.architecture.design.patterns.constructionbuilder.Car;
import hm.edu.software.architecture.design.patterns.decorator.Basket;
import hm.edu.software.architecture.design.patterns.decorator.NullSafeBasket;
import hm.edu.software.architecture.design.patterns.decorator.WoodenBasket;
import hm.edu.software.architecture.design.patterns.expressionbuilder.Bird;
import hm.edu.software.architecture.design.patterns.facade.ServiceFacade;
import hm.edu.software.architecture.design.patterns.factorypattern.Human;
import hm.edu.software.architecture.design.patterns.factorypattern.ManFactory;
import hm.edu.software.architecture.design.patterns.factorypattern.WomanFactory;
import hm.edu.software.architecture.design.patterns.simplefactory.SimpleVehicleFactory;
import hm.edu.software.architecture.design.patterns.simplefactory.Vehicle;
import hm.edu.software.architecture.design.patterns.strategy.BubbleSortStrategy;
import hm.edu.software.architecture.design.patterns.strategy.QuickSortStrategy;
import hm.edu.software.architecture.design.patterns.strategy.SortContext;
import hm.edu.software.architecture.design.patterns.template.BasketballGame;
import hm.edu.software.architecture.design.patterns.template.FootballGame;
import hm.edu.software.architecture.design.patterns.template.Game;

public class Main {

    public static void main(String[] args) {
        //
        // Construction Builder Pattern
        //
        Car car = new Car.CarBuilder().setBrand("BMW").setHorsePower(190).setColor("Blue").build();
        System.out.println(car);

        //
        // Expression Builder Pattern
        //
        Bird bird = new Bird();
        bird.color("blue").age(12).name("Bobo");

        //
        // Factory Method Pattern
        //
        Human man = new ManFactory().create();
        man.speak();

        Human woman = new WomanFactory().create();
        woman.speak();

        //
        // Simple Factory Method Pattern
        //
        Vehicle truck = SimpleVehicleFactory.createVehicle("Truck");
        truck.startEngine();

        Vehicle motorcycle = SimpleVehicleFactory.createVehicle("Motorcycle");
        motorcycle.startEngine();

        //
        // Template Pattern
        //
        Game footballGame = new FootballGame();
        footballGame.game();

        Game basketballGame = new BasketballGame();
        basketballGame.game();

        //
        // Decorator Pattern
        //
        Basket nullSafeBasket = new NullSafeBasket(new WoodenBasket());
        nullSafeBasket.put(10);

        //
        // Strategy Pattern
        //
        int[] array = {5, 2, 7, 1, 3, 9, 4, 6, 8, 10, 11, 15, 14, 12, 17, 19, 16, 20, 22, 23, 25, 24, 26, 30, 32, 2, 1};

        SortContext context = new SortContext(new BubbleSortStrategy());
        context.sort(array);

        context.setStrategy(new QuickSortStrategy());
        context.sort(array);

        //
        // Adapter Pattern
        //
        Charger charger = new ChargerAdapter(new EuropeanCharger());
        charger.charge();

        //
        // Facade Pattern
        //
        ServiceFacade serviceFacade = new ServiceFacade();
        serviceFacade.operation();
    }
}