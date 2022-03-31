package logic;

import cli.CommandLineAgent;
import graphic.GraphicalAgent;
import model.Cell;
import model.GameState;
import model.pieces.Piece;

public class LogicalAgent {
    private final GraphicalAgent graphicalAgent;
    private final CommandLineAgent commandLineAgent;
    private final GameState gameState;


    public LogicalAgent() {
        this.graphicalAgent = new GraphicalAgent();
        this.commandLineAgent = new CommandLineAgent(this);
        this.gameState = GameState.getInstance();
    }


    public void commandLineInitialize() {
        this.commandLineAgent.execution();
    }

    public void graphicInitialize() {
    }


    public void apply(String pieceType, int initialRow, int initialColumn, int destinationRow, int destinationColumn) {
        if (initialRow == 0 && initialColumn == 0) {
            locatePiece(pieceType, destinationRow, destinationColumn);
            return;
        }
        movePiece(pieceType, initialRow, initialColumn, destinationRow, destinationColumn);
    }

    public void locatePiece(String pieceType, int destinationRow, int destinationColumn) {

    }

    public void movePiece(String pieceType, int initialRow, int initialColumn, int destinationRow, int destinationColumn) {
        Cell start = gameState.getBoard().getCells()[initialColumn-1][initialRow-1];
        Cell destination = gameState.getBoard().getCells()[destinationColumn-1][destinationRow-1];
        Piece piece = start.getPiece();
        if (!piece.getType().toString().equals(pieceType) && !piece.getColor().equals(gameState.getTurn())) {
            return;
        }
        if (piece.hasMove(start, destination)) {
            piece.move(start, destination);
        }
    }

}
