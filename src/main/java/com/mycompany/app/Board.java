package com.mycompany.app;

public class Board {

    private int filas; 
    private int columnas;
    private int [][] board; 

    public boolean moveDown() {
        // mueve la pieza hacia abajo
    }
    
    public Board(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.board = new int [filas][columnas];
    }

    private boolean estaFuera(int fila, int columna) { 
        return fila < 0 || fila >= filas || columna < 0 || columna >= columnas;
    }

    // pone una pieza y marca con un 1 los lugares ocupados
    // devuelve true si todas las piezas están dentro
    public boolean Colocar(int[][] pieza) {

        // valida que la pieza no se salga del tablero
        for (int[] posicion : pieza) { // 
            int fila = posicion[0]; // 
            int columna = posicion[1];//
            if (estaFuera(fila, columna))
            return false;
        }
        // colocar la pieza en el tablero y marca con un 1 si los lugares estan bien
        for (int[] posicion : pieza) {
            int fila = posicion[0];
            int columna = posicion[1]; 
            board[fila][columna] = 1;
        }
        return true;
    }

    public int Colocar(int fila, int columna) { // pregunta el estado de una celda
        if (estaFuera(fila, columna))
        return -1;      // fuera del tablero
        return board[fila][columna];
    }

    // dice si por lo menos una pieza está fuera
    public boolean Afuera(int[][] pieza) {
        for (int[] posicion : pieza) { // 
            int fila = posicion[0];
            int columna = posicion[1];
            if (estaFuera(fila, columna)) 
            
            return true; // una pieza está fuera
        }
        return false; // todas las piezas están dentro

    }
}
