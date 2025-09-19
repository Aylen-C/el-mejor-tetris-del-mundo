package com.mycompany.app;

public class PieceL extends Piece {
        @Override
    public void rotateRight() {
        posicionActual++;
        if (posicionActual > 3) {
            posicionActual = 0;
        }
    }

    @Override
    public void rotateLeft() {
        posicionActual--;
        if (posicionActual < 0) {
            posicionActual = 3;
        }
    }
    @Override
    public String[][] forma() {
        switch (posicionActual) {
            case 0: // L normal
                return new String[][] {
                    {"*", ".", "."},
                    {"*", ".", "."},
                    {"*", "*", "."}
                };
            case 1: // L rotada derecha
                return new String[][] {
                    {".", ".", "."},
                    {"*", "*", "*"},
                    {"*", ".", "."}
                };
            case 2: // L rotada abajo
                return new String[][] {
                    {"*", "*", "."},
                    {".", "*", "."},
                    {".", "*", "."}
                };
            case 3: // L rotada izquierda
                return new String[][] {
                    {".", ".", "*"},
                    {"*", "*", "*"},
                    {".", ".", "."}
                };
        }
        return null;
    }
}