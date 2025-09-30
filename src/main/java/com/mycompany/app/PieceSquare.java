package com.mycompany.app;

public class PieceSquare extends Piece {

    @Override
    public void rotateRight() {
    }

    @Override
    public void rotateLeft() {
    }

    @Override
    public int[][] forma() {
        return new int[][] {
            {0,0}, {0,1},
            {1,0}, {1,1}
        };
    }

}