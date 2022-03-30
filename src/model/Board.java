package model;


import lombok.Getter;
import lombok.Setter;
import model.pieces.*;

public class Board {
    @Getter @Setter
    private static Board board;
    @Getter
    private final Cell[][] cells;

    private Board() {
        this.cells = new Cell[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cells[i][j] = new Cell(i+1, j+1);
            }
        }

        cells[0][0].setPiece(new King(Color.WHITE, PieceType.K));
        cells[0][1].setPiece(new GoldenGeneral(Color.WHITE, PieceType.G));
        cells[0][2].setPiece(new SilverGeneral(Color.WHITE, PieceType.S));
        cells[0][3].setPiece(new Elephant(Color.WHITE, PieceType.B));
        cells[0][4].setPiece(new Spear(Color.WHITE, PieceType.L));
        cells[1][0].setPiece(new Soldier(Color.WHITE, PieceType.P));

        cells[4][4].setPiece(new King(Color.BLACK, PieceType.k));
        cells[4][3].setPiece(new GoldenGeneral(Color.BLACK, PieceType.g));
        cells[4][2].setPiece(new SilverGeneral(Color.BLACK, PieceType.s));
        cells[4][1].setPiece(new Elephant(Color.BLACK, PieceType.b));
        cells[4][0].setPiece(new Spear(Color.BLACK, PieceType.l));
        cells[3][4].setPiece(new Soldier(Color.BLACK, PieceType.p));
    }

    public static Board getInstance() {
        if (board == null)
            board = new Board();

        return board;
    }


}
