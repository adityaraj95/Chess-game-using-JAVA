package Pieces;

public class Pawn extends ChessPieces {
    private int color;

    public Pawn(int color){

        this.color=color;
    }
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
