package com.mycompany.app;

public abstract class Piece implements IRotator {
    private int posicionActual = 0;

    int getPosicionActual(){
        return posicionActual;
    }

    void setPosicionActual(int nuevaPosicion){
        posicionActual = nuevaPosicion;
    }

    int orientacionActual(){
        return 4;
    }
    public void rotateRight(){
        switch (posicionActual){//  0 = normal   -   1 = derecha   -   2 = abajo   -   3 = izquierda

            case 0: posicionActual = 1;   // normal -> derecha
                break;

            case 1: posicionActual = 2;   // derecha -> abajo
                break;

            case 2: posicionActual = 3;   // abajo -> izquierda
                break;

            case 3: posicionActual = 0;   // izquierda -> normal
                break;
        }
    }
    

    public void rotateLeft(){
        switch (posicionActual){

            case 0: posicionActual = 3;   // normal -> izquierda
                break;

            case 1: posicionActual = 0;   // derecha -> normal
                break;

            case 2: posicionActual = 1;   // abajo -> derecha
                break;

            case 3: posicionActual = 2;   // izquierda -> abajo
                break;
        }
    }
    
    public abstract String[][] forma();  /* cada pieza implementa su propia forma y  
                                            la devuelve segun su posicion actual
                                            (0, 1, 2, 3)  */
    public abstract boolean puedeDescender(String[][] tablero, int fila, int columna);
    public abstract boolean puedeRotar(String[][] tablero, int fila, int columna);

}