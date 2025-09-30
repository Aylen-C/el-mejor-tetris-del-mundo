package com.mycompany.app;

public abstract class PieceBase implements IRotator {

    public static PieceBase nuevaPieza() {
        int cantidad = 7; // cantidad de piezas
        int tipo = (int) (Math.random() * cantidad);
        switch (tipo) {
            case 0: return new PieceSquare();
            case 1: return new PieceL();
            case 2: return new PieceL2();
            case 3: return new PieceT();
            case 4: return new PieceStick();
            case 5: return new PieceDog();
            case 6: return new PieceDog2();
        }
        return null;
    }

    private int posicionActual = 0;

    int getPosicionActual() {
        return posicionActual;
    }

    void setPosicionActual(int nuevaPosicion) {
        posicionActual = nuevaPosicion;
    }

    int orientacionActual() {
        return posicionActual;
    }

    public void rotateRight() {
        switch (posicionActual) { //  0 = normal   -   1 = derecha   -   2 = abajo   -   3 = izquierda
            case 0: posicionActual = 1;
            break; // normal -> derecha
            case 1: posicionActual = 2;
            break; // derecha -> abajo
            case 2: posicionActual = 3;
            break; // abajo -> izquierda
            case 3: posicionActual = 0;
            break; // izquierda -> normal
        }
    }

    public void rotateLeft() {
        switch (posicionActual) {
            case 0: posicionActual = 3;
            break; // normal -> izquierda
            case 1: posicionActual = 0;
            break; // derecha -> normal
            case 2: posicionActual = 1;
            break; // abajo -> derecha
            case 3: posicionActual = 2;
            break; // izquierda -> abajo
        }
    }

    public abstract int[][] forma();  /* cada pieza implementa su propia forma y  
                                        la devuelve segun su posicion actual
                                        (0, 1, 2, 3)  */
}