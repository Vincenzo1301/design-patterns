package hm.edu.software.architecture.design.patterns.template;

public class BasketballGame extends Game {

    @Override
    public void startGame() {
        System.out.println("Start basketball game!");
    }

    @Override
    public void stopGame() {
        System.out.println("Stop basketball game!");
    }
}
