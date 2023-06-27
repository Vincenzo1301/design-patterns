package hm.edu.software.architecture.design.patterns.template;

public abstract class Game {

    public void game() {
        startGame();
        stopGame();
    }

    abstract void startGame();

    abstract void stopGame();
}
