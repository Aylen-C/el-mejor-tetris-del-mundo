package com.mycompany.app;

public class PieceL extends Piece {
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
            case 0: // L normal
                return new int[][] {
                    {0,0},
                    {1,0},
                    {2,0}, {2,1}
                };
            case 1: // L rotada derecha
                return new int[][] {
                    {1,0}, {1,1}, {1,2},
                    {2,0}
                };
        }
        return null;
    }

    @Override
    public boolean puedeDescender(String[][] tablero, int fila, int columna) {
        int[][] formaActual = forma();
        for (int[] coord : formaActual) {
            int nuevaFila = fila + coord[0] + 1;
            int nuevaColumna = columna + coord[1];
            if (nuevaFila >= tablero.length || !tablero[nuevaFila][nuevaColumna].equals(".")) {
                return false;
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
        int[][] formaRotada = forma();
        setPosicionActual(originalPosicion);

        for (int[] coord : formaRotada) {
            int f = fila + coord[0];
            int c = columna + coord[1];
            if (f < 0 || f >= tablero.length || c < 0 || c >= tablero[0].length || !tablero[f][c].equals(".")) {
                return false;
            }
        }
        return true;
    }
}