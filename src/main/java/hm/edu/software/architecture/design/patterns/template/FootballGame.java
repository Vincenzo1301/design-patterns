package hm.edu.software.architecture.design.patterns.template;

public class FootballGame extends Game {

    @Override
    public void startGame() {
        System.out.println("Start football game!");
    }

    @Override
    public void stopGame() {
        System.out.println("Stop football game!");
    }
}
