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
    
}
