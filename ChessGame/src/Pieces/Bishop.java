package Pieces;

public class Bishop extends ChessPieces {
    private int color;



    public Bishop(int color){

        this.color=color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
