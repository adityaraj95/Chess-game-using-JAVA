package Pieces;

import java.util.ArrayList;

public class Rook extends ChessPieces {
    private int color;
    public static final int empty=-1;
    ArrayList<int[]> Move;

    public Rook(int color){

        this.color=color;
        this.Move=new ArrayList<>();
    }

    /**
     * Return co-ordinates of the possible Moves
     * @param x1
     * @param y1
     * @return
     */

    public ArrayList<int[]> possibleMove(int x1, int y1, ChessPieces[][] board){

        for(int i=0;i+x1<8;i++)
        {

            if(board[x1+i][y1].getColor() != this.color)
            {
                if(board[x1+i][y1].getColor() != empty){
                    int[] move={x1+i,y1};
                    Move.add(move);
                    break;
                }
                else
                {
                    int[] move={x1+i,y1};
                    Move.add(move);
                }
            }

        }
        for(int i=0;x1-i>=8;i++)
        {

            if(board[x1-i][y1].getColor() != this.color)
            {
                if(board[x1-i][y1].getColor() != empty){
                    int[] move={x1-i,y1};
                    Move.add(move);
                    break;
                }
                else
                {
                    int[] move={x1-i,y1};
                    Move.add(move);
                }
            }

        }
        for(int i=0;y1+i<8;i++)
        {

            if(board[x1][y1+i].getColor() != this.color)
            {
                if(board[x1][y1+i].getColor() != empty){
                    int[] move={x1,y1+i};
                    Move.add(move);
                    break;
                }
                else
                {
                    int[] move={x1,y1+i};
                    Move.add(move);
                }
            }
        }
        for(int i=0;y1-i>=0;i++)
        {

            if(board[x1][y1-i].getColor() != this.color)
            {
                if(board[x1][y1-i].getColor() != empty){
                    int[] move={x1,y1-i};
                    Move.add(move);
                    break;
                }
                else
                {
                    int[] move={x1,y1-i};
                    Move.add(move);
                }
            }

        }
        return this.Move;
    }
    /**
     * Getter and Setter
     * @return White or Black.
     * Sets Color to pieces.
     */
    public int getColor() { return color;}

    public void setColor(int color) { this.color = color;}
}
