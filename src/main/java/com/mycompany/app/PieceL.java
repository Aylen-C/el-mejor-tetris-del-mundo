package com.mycompany.app;

<<<<<<< HEAD
public class PieceL extends Piece{
=======
public class PieceL extends Piece {
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
>>>>>>> b21b4d519d60fd47384886d17df87557ea6dce59
}