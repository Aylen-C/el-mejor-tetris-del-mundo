package com.mycompany.app;

public class PieceDog2 extends Piece {
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
            case 0: 
                return new String[][] {
                    {"*", "*", "."},
                    {".", "*", "*"},
                    {".", ".", "."}
                };
            case 1: 
                return new String[][] {
                    {".", "*", "."},
                    {"*", "*", "."},
                    {"*", ".", "."}
                };
            case 2: 
                return new String[][] {
                    {".", ".", "."},
                    {"*", "*", "."},
                    {".", "*", "*"}
                };
            case 3: 
                return new String[][] {
                    {"*", ".", "."},
                    {"*", "*", "."},
                    {".", "*", "."}
                };
        }
        return null;
    }
}