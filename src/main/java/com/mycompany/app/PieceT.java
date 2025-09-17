package com.mycompany.app;

public class PieceT extends Piece{

    @Override
    public String[][] forma() {

        switch (posicionActual) {

            case 0: // Normal
                return new String[][] {
                    {".", "*", "."},
                    {"*", "*", "*"}
                };

            case 1: // Derecha
                return new String[][] {
                    {"*", "."},
                    {"*", "*"},
                    {"*", "."}
                };
                
            case 2: // Abajo
                return new String[][] {
                    {"*", "*", "*"},
                    {".", "*", "."}
                };

            case 3:
                // Izquierda
                return new String[][] {
                    {".", "*"},
                    {"*", "*"},
                    {".", "*"}
                };
        }

        return null;
    }
}



/*String matriz [][] = new String [2][3];

        // INICIALIZA
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                matriz[i][j] = ".";
            }
        }

        // T
        if (posicionActual == 0){   // normal
            matriz[0][0] ="*"; 
            matriz[0][1]= "*";
            matriz[0][2]= "*"; 
            matriz[1][1]= "*"; 
        }
        else if (posicionActual == 1){   // derecha
            matriz[0][1] ="*"; 
            matriz[1][1]= "*";
            matriz[2][1]= "*"; 
            matriz[1][2]= "*"; 
        }
        else if (posicionActual == 2){   // abajo
            matriz[1][0] ="*"; 
            matriz[1][1]= "*";
            matriz[1][2]= "*"; 
            matriz[0][1]= "*"; 
        }
        else if (posicionActual == 3){   // izquierda
            matriz[0][1] ="*"; 
            matriz[1][1]= "*";
            matriz[2][1]= "*"; 
            matriz[1][0]= "*"; 
        }

        return matriz;
    }

*/