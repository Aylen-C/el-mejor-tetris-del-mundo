package com.mycompany.app;

public class PieceSquare extends PieceBase {

    @Override
    public void rotateRight() {
    }

    @Override
    public void rotateLeft() {
    }

    @Override
    public int[][] forma() {
        return new int[][] {
            {0,0}, {0,1},
            {1,0}, {1,1}
        };
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
        int[][] formaActual = forma();
        for (int[] coord : formaActual) {
            int f = fila + coord[0];
            int c = columna + coord[1];
            if (f < 0 || f >= tablero.length || c < 0 || c >= tablero[0].length || !tablero[f][c].equals(".")) {
                return false;
            }
        }
        return true;
    }
}