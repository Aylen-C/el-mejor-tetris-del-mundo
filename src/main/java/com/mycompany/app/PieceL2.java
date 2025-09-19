package com.mycompany.app;

public class PieceL2 extends Piece {
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
        switch (getPosicionActual()) {
            case 0: // L invertida normal
                return new String[][] {
                    {".", ".", "*"},
                    {".", ".", "*"},
                    {".", "*", "*"}
                };
            case 1: // L invertida rotada derecha
                return new String[][] {
                    {".", ".", "."},
                    {"*", "*", "*"},
                    {".", ".", "*"}
                };
            case 2: // L invertida rotada abajo
                return new String[][] {
                    {"*", "*", "."},
                    {"*", ".", "."},
                    {"*", ".", "."}
                };
            case 3: // L invertida rotada izquierda
                return new String[][] {
                    {"*", ".", "."},
                    {"*", "*", "*"},
                    {".", ".", "."}
                };
        }
        return null;
    }
}