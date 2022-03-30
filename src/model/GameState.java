package model;

import lombok.Getter;
import lombok.Setter;

public class GameState {
    private static GameState gameState;
    @Getter @Setter
    private final Board board;
    @Getter @Setter
    private final Player blackPlayer;
    @Getter @Setter
    private final Player whitePlayer;
    @Getter @Setter
    private int turn;
    @Getter @Setter
    private boolean endGame;


    private GameState(Board board, Player blackPlayer, Player whitePlayer) {
        this.board = board;
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        turn = 0;
        endGame = true;
    }

    public static GameState getInstance() {
        if (gameState == null) {
            Player whitePlayer = new Player(Color.WHITE);
            Player blackPlayer = new Player(Color.BLACK);
            whitePlayer.setRival(blackPlayer);
            blackPlayer.setRival(whitePlayer);
            gameState = new GameState(Board.getInstance(), whitePlayer, blackPlayer);
        }
        return gameState;
    }
}
