package com.mycompany.app;

public class PieceDog extends Piece {
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
            case 0: 
                return new String[][] {
                    {".", "*", "*"},
                    {"*", "*", "."},
                    {".", ".", "."}
                };
            case 1: 
                return new String[][] {
                    {"*", ".", "."},
                    {"*", "*", "."},
                    {".", "*", "."}
                };
            case 2: 
                return new String[][] {
                    {".", ".", "."},
                    {".", "*", "*"},
                    {"*", "*", "."}
                };
            case 3: 
                return new String[][] {
                    {".", "*", "."},
                    {".", "*", "*"},
                    {".", ".", "*"}
                };
        }
        return null;
    }
}