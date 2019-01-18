package GameBoard;

import Pieces.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Board extends JPanel{

    private static final int white=0;
    private static final int black=1;
    private static final int freespace=-1;


    private ChessPieces[][] board;
    private int turns;
    private ArrayList<int [][]> PreviousMoves;

    public Board(){

        this.turns=0;
        this.board=new ChessPieces[8][8];

        for(int i=2;i<6;i++){
            for(int j=0;j<8;j++){

                board[i][j]= new FreeSpace(freespace);
            }
        }
        // Placing the black pieces

        board[0][0]=new Rook(black);
        board[0][1]=new Knight(black);
        board[0][2]=new Bishop(black);
        board[0][3]=new Queen(black);
        board[0][4]=new King(black);
        board[0][5]=new Bishop(black);
        board[0][6]=new Knight(black);
        board[0][7]=new Rook(black);

        for(int i=0;i<8;i++){
            board[1][i]=new Pawn(black);
        }

        board[7][0]=new Rook(white);
        board[7][1]=new Knight(white);
        board[7][2]=new Bishop(white);
        board[7][3]=new Queen(white);
        board[7][4]=new King(white);
        board[7][5]=new Bishop(white);
        board[7][6]=new Knight(white);
        board[7][7]=new Rook(white);

        for(int i=0;i<8;i++){

            board[1][i]=new Pawn(white);
        }


    }

    /**
     * See if the move is valid
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return true if move is valid
     */
    public boolean move(int x1,int y1,int x2,int y2){
    return false;
    }

    /**
     * Test for CheckMate
     * @return true if CheckMate
     */

    public boolean CheckMate(){
        return false;
    }

    /**
     * Checks for StaleMate
     * @return true if StaleMate
     */
    public boolean StaleMate(){

        return false;
    }

    //getters and setters

    //prevoius moves
    public ArrayList<int[][]> getPreviousMoves() {
        return PreviousMoves;
    }
    public void setPreviousMoves(ArrayList<int[][]> previousMoves){
        this.PreviousMoves=previousMoves;
    }

    //set and get turns
    public int getTurns(){return turns;}
    public void setTurns(int turns){this.turns=turns; }

    //set and get the Board
    public ChessPieces[][] getBoard(){return this.board;}
    public void setBoard(ChessPieces[][] board){this.board=board;}


    public void paint(Graphics graphics){

        graphics.fillRect(100,100,400,400);
        for(int i=100;i<=400;i+=100){

            for(int j=100;j<=400;j+=100){
                graphics.clearRect(i,j,50,50);
            }
        }
         for(int i=150;i<=450;i+=100){
            for(int j=150;j<=450;j+=100){
                graphics.clearRect(i,j,50,50);
            }

        }
    }
    public static void main (String args[]){


        JFrame frame=new JFrame();
        frame.setSize(600,600);
        frame.getContentPane().add(new Board());
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

}
