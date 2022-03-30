package model.pieces;

import model.Color;
import model.Player;

public class King extends Piece {

    public King(Player player, Color color, PieceType pieceType) {
        super(player, color, pieceType);
    }

    public King(Color color, PieceType pieceType) {
        super(color, pieceType);
    }

    @Override
    public boolean isValidMove() {
        return false;
    }
    @Override
    public void move() {

    }
    @Override
    public void upgradedMove() {

    }
    @Override
    public void locate() {

    }
}
