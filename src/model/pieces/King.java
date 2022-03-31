package model.pieces;

import model.Cell;
import model.Color;
import model.Player;

public class King extends Piece {

    public King(Player player, Color color, PieceType pieceType) {
        super(player, color, pieceType);
    }

    @Override
    public boolean hasMove(Cell start, Cell destination) {
        return false;
    }

    public King(Color color, PieceType pieceType) {
        super(color, pieceType);
    }


    @Override
    public void locate() {

    }
}
