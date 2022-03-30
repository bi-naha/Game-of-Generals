package model.pieces;

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