package com.mycompany.app;

public class Board {

    private int filas; 
    private int columnas;
    private int [][] board;
    private int [][] piezaActual; // la pieza que está cayendo
    private int cantidadBloques;
 

    public boolean Colocar(int[][] pieza, int cantidadBloques) {
        this.cantidadBloques = cantidadBloques;
        return Colocar(pieza);
    }

    public Board(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.board = new int [filas][columnas];
        this.piezaActual = null; // al inicio no hay pieza en el tablero
        this.cantidadBloques = 0;
    }


    // pone una nueva pieza activa (y la cantidad de bloques que tiene)
    public void setPiezaActual(int[][] nuevaPieza, int cantidadBloques) {
        this.piezaActual = nuevaPieza;
        this.cantidadBloques = cantidadBloques;
    }


    public boolean Colocar(int[][] pieza) {

        // valida que la pieza no se salga del tablero
        for (int i = 0; i < cantidadBloques; i++) {
            int fila = pieza[i][0];
            int columna = pieza[i][1];
            if (estaFuera(fila, columna)) return false;
        }

        // colocar la pieza en el tablero y marca con un 1 si los lugares estan bien
        for (int i = 0; i < cantidadBloques; i++) {
            int fila = pieza[i][0];
            int columna = pieza[i][1];
            board[fila][columna] = 1;
        }
        return true;
    }

    public int getCelda(int fila, int columna) { // pregunta el estado de una celda
        if (estaFuera(fila, columna))
            return -1;      // fuera del tablero
        return board[fila][columna];
    }

    // devuelve true si la celda está fuera del tablero
    private boolean estaFuera(int fila, int columna) {
        return (fila < 0 || fila >= filas || columna < 0 || columna >= columnas);
    }
    
        // Baja la pieza actual una fila si puede
    public boolean moveDown() {
        if (piezaActual == null) return false;
        // Verifica si la pieza puede bajar
        for (int i = 0; i < cantidadBloques; i++) {
            int filaActual = piezaActual[i][0];
            int columnaActual = piezaActual[i][1];
            int filaAbajo = filaActual + 1;
            if (filaAbajo >= filas || board[filaAbajo][columnaActual] == 1) {
                Colocar(piezaActual);
                piezaActual = null;
                return false;
            }
        }
        // Si puede, baja todos los bloques
        for (int i = 0; i < cantidadBloques; i++) {
            piezaActual[i][0]++;
        }
        return true;
    }
}