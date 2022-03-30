package model.pieces;

import model.Cell;
import model.Color;
import model.Player;

public class Elephant extends Piece {


    public Elephant(Color color, PieceType pieceType) {
        super(color, pieceType);
    }

    public Elephant(Player player, Color color, PieceType pieceType) {
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
