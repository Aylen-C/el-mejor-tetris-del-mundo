package com.mycompany.app;

public class PieceStick extends Piece {
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
    public int[][] forma() {
        if (getPosicionActual() == 0) {
            // horizontal
            return new int[][] {
                {0,0}, {0,1}, {0,2}, {0,3}
            };
        } else {
            // vertical
            return new int[][] {
                {0,0},
                {1,0},
                {2,0},
                {3,0}
            };
        }
    }
    @Override
    public boolean puedeDescender(String[][] tablero, int fila, int columna) {
        int[][] formaActual = forma();
        int alto = formaActual.length;
        int ancho = formaActual[0].length;

       
        if (fila + alto >= tablero.length) {
            return false;
        }

      
        for (int j = 0; j < ancho; j++) {
            for (int i = alto - 1; i >= 0; i--) {
                if (formaActual[i][j].equals("*")) {
                    int abajo = fila + i + 1;
                    int col = columna + j;
                    if (!tablero[abajo][col].equals(".")) {
                        return false;
                    }
                    break; 
                }
            }
        }
        return true;
    }

    @Override
    public boolean puedeRotar(String[][] tablero, int fila, int columna) {
        int nuevaPosicion = getPosicionActual() + 1;
        if (nuevaPosicion > 3) {
            nuevaPosicion = 0;
        }
        setPosicionActual(nuevaPosicion);
        String[][] formaRotada = forma();        int originalPosicion = nuevaPosicion - 1;
        if (originalPosicion < 0) {
            originalPosicion = 3;
        }
        setPosicionActual(originalPosicion);

        int alto = formaRotada.length;
        int ancho = formaRotada[0].length;

        if (fila + alto > tablero.length || columna + ancho > tablero[0].length) {
            return false;
        }

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (formaRotada[i][j].equals("*")) {
                    int f = fila + i;
                    int c = columna + j;
                    if (!tablero[f][c].equals(".")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

