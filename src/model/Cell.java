package model;

import lombok.Getter;
import lombok.Setter;
import model.pieces.Piece;

public class Cell {
    @Getter @Setter
    private final int row, col;
    @Getter @Setter
    private Piece piece;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
