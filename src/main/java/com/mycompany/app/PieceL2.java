package com.mycompany.app;

public class PieceL2 extends Piece {
    @Override
public void rotateRight() {
    posicionActual++;
    if (posicionActual > 3) {
        posicionActual = 0;
    } // vuelve a la posicion 0 si se pasa la 3
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