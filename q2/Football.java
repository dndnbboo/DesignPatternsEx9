package ex9.q2;

public class Football implements Game {
    @Override
    public void initializeGame() {
        System.out.println("Initalizing football game...");
    }
    @Override
    public void playingGame() {
        System.out.println("Playing football game...");
    }
    @Override
    public void showResult() {
        System.out.println("Showing the results for the football game...");
    }
}
