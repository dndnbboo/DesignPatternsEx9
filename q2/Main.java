package ex9.q2;

public class Main {
    public static void main(String[] args) {
        Game game = new Football();
        game.initializeGame();
        game.playingGame();
        game.showResult();

        game = new Basketball();
        game.initializeGame();
        game.playingGame();
        game.showResult();
    }
}
