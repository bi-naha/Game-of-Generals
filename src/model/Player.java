package model;

import lombok.Getter;
import lombok.Setter;
import model.pieces.Piece;
import java.util.List;

public class Player {
    @Getter @Setter
    private List<Piece> pieces;
    @Getter @Setter
    private Player rival;
    @Getter @Setter
    private Piece selectedPiece;
    @Getter @Setter
    private Color color;


    public Player(Color color) {
        this.color = color;
    }

    public void endTurn() {}
}
