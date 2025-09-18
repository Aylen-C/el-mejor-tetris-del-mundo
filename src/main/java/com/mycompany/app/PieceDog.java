package com.mycompany.app;
public class PieceDog extends Piece {

    @Override
    public String[][] forma() {

        switch (posicionActual) {

            case 0: //dog derecha
                return new String[][] {
                    {".", "*", "*"},
                    {"*", "*", "."},
                    {".", ".", "."},
                };
            case 1: //dog derecha (rotado)
                return new String[][] {
                    {"*", ".", "."},
                    {"*", "*", "."},
                    {".", "*", "."},
                };
            case 2: //dog izquierda
                return new String[][] {
                    {"*", "*", "."},
                    {".", "*", "*"},
                    {".", ".", "."},
                };
            case 3: //dog izquierda (rotado)
                return new String[][] {
                    {".", "*", "."},
                    {"*", "*", "."},
                    {"*", ".", "."},
                };
        }
        return null;
     }
         
}


