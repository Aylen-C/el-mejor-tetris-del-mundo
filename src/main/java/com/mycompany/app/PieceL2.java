package com.mycompany.app;

public class PieceL2 extends Piece {
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
                           {0,1},
                           {1,1},
                    {2,0}, {2,1}
                };
            case 1:
                return new int[][] {
                    {0,0},
                    {1,0}, {1,1}, {1,2}
                };
            case 2:
                return new int[][] {
                    {0,0}, {0,1},
                    {1,0},
                    {2,0}
                };
            case 3:
                return new int[][] {
                    {0,0}, {0,1}, {0,2},
                                  {1,2}
                };
        }
        return null;
    }

    @Override
    public boolean puedeDescender(String[][] tablero, int fila, int columna) {
        int[][] formaActual = forma();
        int alto = formaActual.length;
        int ancho = formaActual[0].length;

        if (fila + alto >= tablero.length) {
            return false;
        }

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (formaActual[i][j].equals("*")) {
                    int abajo = fila + i + 1;
                    int col = columna + j;
                    if (abajo >= tablero.length || col < 0 || col >= tablero[0].length) {
                        return false;
                    }
                    if (!tablero[abajo][col].equals(".")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public boolean puedeRotar(String[][] tablero, int fila, int columna) {
        int originalPosicion = getPosicionActual();
        int nuevaPosicion = originalPosicion + 1;
        if (nuevaPosicion > 3) {
            nuevaPosicion = 0;
        }
        setPosicionActual(nuevaPosicion);
        String[][] formaRotada = forma();
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
                    if (f >= tablero.length || c < 0 || c >= tablero[0].length) {
                        return false;
                    }
                    if (!tablero[f][c].equals(".")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}