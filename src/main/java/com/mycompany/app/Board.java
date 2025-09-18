package com.mycompany.app;

public class Board {

    private int filas; 
    private int columnas;
    private int [][] board; 

    
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

        // validar
        for (int[] posicion : pieza) {
            int fila = posicion[0];
            int columna = posicion[1];
            if (estaFuera(fila, columna)) return false;
        }
        // colocar
        for (int[] posicion : pieza) {
            int fila = posicion[0];
            int columna = posicion[1];
            board[fila][columna] = 1;
        }
        return true; // si todas las piezas estan bien retorna true
    }

    public int Colocar(int fila, int columna) {
        if (estaFuera(fila, columna))
        return -1;
        return board[fila][columna];
    }

    // dice si por lo menos una pieza está fuera
    public boolean Afuera(int[][] pieza) {
        for (int[] posicion : pieza) {
            int fila = posicion[0];
            int columna = posicion[1];
            if (estaFuera(fila, columna)) return true;
        }
        return false;

    }
}
