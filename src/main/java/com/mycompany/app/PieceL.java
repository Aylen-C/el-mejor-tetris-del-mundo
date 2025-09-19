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
    public String[][] forma() {
        switch (getPosicionActual()) {
            case 0: // L normal
                return new String[][] {
                    {"*", ".", "."},
                    {"*", ".", "."},
                    {"*", "*", "."}
                };
            case 1: // L rotada derecha
                return new String[][] {
                    {".", ".", "."},
                    {"*", "*", "*"},
                    {"*", ".", "."}
                };
            case 2: // L rotada abajo
                return new String[][] {
                    {"*", "*", "."},
                    {".", "*", "."},
                    {".", "*", "."}
                };
            case 3: // L rotada izquierda
                return new String[][] {
                    {".", ".", "*"},
                    {"*", "*", "*"},
                    {".", ".", "."}
                };
        }
        return null;
    }
      @Override
    public boolean puedeDescender(String[][] tablero, int fila, int columna) {
        String[][] formaActual = forma();
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