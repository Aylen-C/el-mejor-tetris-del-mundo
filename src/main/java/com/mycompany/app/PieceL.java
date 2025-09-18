package com.mycompany.app;

public class PieceL extends Piece{
    @Override
    public String[][] forma() {

        switch (posicionActual) {

            case 0: // Normal
                return new String[][] {
                    {"*", "*", "*"},
                    {".", "*", "."},
                    {".", ".", "."},
                };

            case 1: // Derecha
                return new String[][] {
                    {".", ".", "*"},
                    {".", "*", "*"},
                    {".", ".", "*"},
                };
                
            case 2: // Abajo
                return new String[][] {
                    {".", ".", "."},
                    {".", "*", "."},
                    {"*", "*", "*"},
                };

            case 3: // Izquierda
                return new String[][] {
                    {"*", ".", "."},
                    {"*", "*", "."},
                    {"*", ".", "."},

                };
        }

        return null;
    }
}