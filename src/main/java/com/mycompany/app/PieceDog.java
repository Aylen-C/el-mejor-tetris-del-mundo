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
    public int[][] forma() {
        switch (getPosicionActual()) {
            case 0: 
                return new int[][] {
                            {0, 1}, {0, 2},
                    {1, 0}, {1, 1}
                };
            case 1: 
                return new int[][] {
                    {0, 0},
                    {1, 0}, {1, 1},
                            {2, 1}
                };
        }
        return null;
    }

    

    @Override
    public boolean puedeDescender(String[][] tablero, int fila, int columna) {
        int[][] formaActual = forma();
        int alto = formaActual.length;
        int ancho = formaActual[0].length;

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (formaActual[i][j].equals("*")) {
                    int nuevaFila = fila + i + 1;
                    int nuevaColumna = columna + j;
                    if (nuevaFila >= tablero.length || 
                        (tablero[nuevaFila][nuevaColumna] != null && !tablero[nuevaFila][nuevaColumna].equals("."))) {
                        return false;
                    }
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
        String[][] formaRotada = forma();
        
        int originalPosicion = nuevaPosicion - 1;
        if (originalPosicion < 0) {
            originalPosicion = 3;
        }
        setPosicionActual(originalPosicion);

        int alto = formaRotada.length;
        int ancho = formaRotada[0].length;

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (formaRotada[i][j].equals("*")) {
                    int nuevaFila = fila + i;
                    int nuevaColumna = columna + j;
                    if (nuevaFila >= tablero.length || nuevaColumna < 0 || nuevaColumna >= tablero[0].length ||
                        (tablero[nuevaFila][nuevaColumna] != null && !tablero[nuevaFila][nuevaColumna].equals("."))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}