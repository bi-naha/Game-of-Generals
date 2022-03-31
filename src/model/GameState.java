package model;

import lombok.Getter;
import lombok.Setter;
import model.pieces.PieceType;

public class GameState {
    private static GameState gameState;
    @Getter
    private final Board board;
    @Getter
    private final Player blackPlayer;
    @Getter
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

    public Color getTurn() {
        if (this.turn%2 == 0) {
            return Color.BLACK;
        }
        return Color.WHITE;
    }

}
