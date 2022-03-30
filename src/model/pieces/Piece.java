package model.pieces;

import lombok.Getter;
import lombok.Setter;
import model.Cell;
import model.Color;
import model.Player;

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
    protected PieceType pieceType;



    public Piece(Color color, PieceType pieceType) {
        this.isUpgraded = false;
        this.color = color;
        this.pieceType = pieceType;
    }

    public Piece(Player player, Color color, PieceType pieceType) {
        this.player = player;
        this.isUpgraded = false;
        this.color = color;
        this.pieceType = pieceType;
    }

    public abstract boolean isValidMove();
    public abstract void move();
    public abstract void upgradedMove();
    public abstract void locate();
}
