package com.mycompany.app;
public class PieceDog extends Piece {

    @Override
    public String[][] forma() {

        switch (posicionActual) {

            case 0:
                return new String[][] {
                    {".", "*", "*"},
                    {"*", "*", "."},
                    {".", ".", "."},
                };
            case 1:
                return new String[][] {
                    {"*", ".", "."},
                    {"*", "*", "."},
                    {".", "*", "."},
                };
            case 2: 
                return new String[][] {
                    {"*", "*", "."},
                    {".", "*", "*"},
                    {".", ".", "."},
                };
            case 3: 
                return new String[][] {
                    {".", "*", "."},
                    {"*", "*", "."},
                    {"*", ".", "."},
                };
        }
        return null;
     }
         
}


