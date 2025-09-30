package com.mycompany.app;

public class PieceStick extends Piece {
    @Override
    public void rotateRight() {
        setPosicionActual(getPosicionActual() + 1);
        if (getPosicionActual() > 3) {
            setPosicionActual(0);
        }
    }

    @Override
    public void rotateLeft() {
        setPosicionActual(getPosicionActual() - 1);
        if (getPosicionActual() < 0) {
            setPosicionActual(3);
        }
    }

    @Override
    public int[][] forma() {
        if (getPosicionActual() == 0) {
            return new int[][] {
                {0,0}, {0,1}, {0,2}, {0,3}
            };
        } else {
            return new int[][] {
                {0,0},
                {1,0},
                {2,0},
                {3,0}
            };
        }
    }
}