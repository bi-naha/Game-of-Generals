package model.pieces;

import lombok.Getter;
import lombok.Setter;
import model.Cell;
import model.Color;
import model.Player;

import java.util.Locale;

public abstract class Piece {
    @Getter @Setter
    protected Cell currentCell;
    @Getter @Setter
    protected Player player;
    @Getter @Setter
    protected boolean isSelected;
    @Getter @Setter
    protected boolean isAlive;
    @Getter @Setter
    protected boolean isUpgraded;
    @Getter @Setter
    protected Color color;
    @Getter @Setter
    protected PieceType type;



    public Piece(Color color, PieceType pieceType) {
        this.isUpgraded = false;
        this.color = color;
        this.type = pieceType;
    }

    public Piece(Player player, Color color, PieceType pieceType) {
        this.player = player;
        this.isUpgraded = false;
        this.color = color;
        this.type = pieceType;
    }

    public abstract boolean hasMove(Cell start, Cell destination);



    public void move(Cell start, Cell destination) {
        Piece destinationPiece = destination.getPiece();
        if (destinationPiece != null) {
            destinationPiece.setAlive(false);
            destinationPiece.setPlayer(this.getPlayer().getRival());
            destinationPiece.setCurrentCell(null);
            destinationPiece.setType(Character.isUpperCase(destinationPiece.getType().toString().charAt(0)) ?
                    PieceType.valueOf(destinationPiece.getType().toString().toLowerCase(Locale.ROOT)) :
                    PieceType.valueOf(destinationPiece.getType().toString().toUpperCase()));
            destinationPiece.setColor(destinationPiece.getColor()==Color.BLACK ? Color.WHITE : Color.BLACK);
        }
        destination.setPiece(start.getPiece());
        start.setPiece(null);
    }

    public abstract void locate();
}
