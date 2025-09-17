package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BoardTest {


 @Test   
 public void CreaTablero () {
    int filas = 10 ;
    int columnas = 20; 

    int matriz [][]= new int [filas][columnas];

    for (int i = 0; i<filas; i++){
        for (int j = 0; j<columnas; j++){

            assertEquals(0, matriz[i][j]);
        }
    }
 }
    @Test
    public void PiezasTalbero() {
         Board board = new BoardTest(); 

         int [][] PieceT(){

         return new int[][] {
            {8,4} ,{8,5}, {8,6}, {9,5}
         };  
         }
    } 
    //parametro de interfaces



    
 
}
