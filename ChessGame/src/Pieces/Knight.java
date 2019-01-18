package Pieces;

public class Knight extends ChessPieces {
    private int color;

    public Knight(int color){

        this.color=color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
