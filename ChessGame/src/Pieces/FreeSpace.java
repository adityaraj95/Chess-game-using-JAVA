package Pieces;

public class FreeSpace extends ChessPieces {

    private int color;

    public FreeSpace(int color){

        this.color=color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
