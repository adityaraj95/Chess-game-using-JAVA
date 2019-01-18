package Pieces;

public class Queen extends ChessPieces {
    private int color;

    public Queen(int color){

        this.color=color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
