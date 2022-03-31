package model.pieces;

import model.Cell;
import model.Color;
import model.Player;

public class SilverGeneral extends Piece {

    public SilverGeneral(Color color, PieceType pieceType) {
        super(color, pieceType);
    }

    public SilverGeneral(Player player, Color color, PieceType pieceType) {
        super(player, color, pieceType);
    }

    @Override
    public boolean hasMove(Cell start, Cell destination) {
        return false;
    }

    @Override
    public void locate() {

    }
}
