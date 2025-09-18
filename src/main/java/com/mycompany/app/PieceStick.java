package com.mycompany.app;

public class PieceStick extends Piece {

    @Override
    public void rotateRight() {
        if (getPosicionActual() == 0) {
            setPosicionActual(1);
        } else {
            setPosicionActual(0);
        }
    }

    @Override
    public void rotateLeft() {
        if (getPosicionActual() == 0) {
            setPosicionActual(1);
        } else {
            setPosicionActual(0);
        }
    }

    @Override
    public String[][] forma() {
        if (getPosicionActual() == 0) {
            return new String[][] {
                {"*", "*", "*", "*"}
            };
        } else {
            return new String[][] {
                {"*"},
                {"*"},
                {"*"},
                {"*"}
            };
        }
    }


}

