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
    public String[][] forma() {
        if (getPosicionActual() == 0) {
            // Horizontal
            return new String[][] {
                {"*", "*", "*", "*"}
            };
        } else {
            // Vertical
            return new String[][] {
                {"*"},
                {"*"},
                {"*"},
                {"*"}
            };
        }
    }
}

