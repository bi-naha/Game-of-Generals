package model.pieces;

import model.Cell;
import model.Color;
import model.Player;

public class Soldier extends Piece {

    public Soldier(Color color, PieceType pieceType) {
        super(color, pieceType);
    }
    public Soldier(Player player, Color color, PieceType pieceType) {
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
