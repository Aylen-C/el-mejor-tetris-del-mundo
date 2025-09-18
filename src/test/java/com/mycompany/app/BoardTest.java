package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BoardTest {


   @Test   
   public void CreaTablero () {
      int filas = 20 ;  //cambiar a 20 
      int columnas = 10; // cambiar a 10 

      int matriz [][]= new int [filas][columnas];
      for (int i = 0; i<filas; i++){
        for (int j = 0; j<columnas; j++){

            assertEquals(0, matriz[i][j]);
         }
      }
   }

    @Test
    public void PiezasTablero() {

         Board board = new Board(20,10); 

         int [][] PieceSqueare= {
            {19,3} ,{19,4}, {18,3}, {18,4}  
         };

         boolean ColocarPieza = board.Colocar(PieceSqueare);
         assertTrue(ColocarPieza, "La pieza esta dentro del tablero");

        assertEquals(1, board.Colocar(19,3));
        assertEquals(1, board.Colocar(19,4));
        assertEquals(1, board.Colocar(18,3));
        assertEquals(1, board.Colocar(18,4));


        int [][] PieceStick= {
            {19,6} ,{18,6}, {17,6}, {16,6}  
         };

         ColocarPieza = board.Colocar(PieceStick); //no es necesario volver a poner boolean 
         assertTrue(ColocarPieza, "La pieza esta dentro del tablero");

        assertEquals(1, board.Colocar(19,6));
        assertEquals(1, board.Colocar(18,6));
        assertEquals(1, board.Colocar(17,6));
        assertEquals(1, board.Colocar(16,6));
      } 

   @Test
   public void FueraDelTablero(){
    
      Board board = new Board(20,10);

         int [][] pieceSqueareAfuera= {
            {20,3} ,{20,4}, 
            {18,3}, {18,4}  
         };
         boolean EstaAfuera = board.Afuera(pieceSqueareAfuera);
         assertTrue(EstaAfuera, "Hay piezas que estan fuera del tablero");

        int [][] pieceStickAfuera= {
            {21,6} ,
            {20,6}, 
            {19,6},
            {17,6}  
         };

         EstaAfuera = board.Afuera(pieceStickAfuera); //no es necesario volver a poner boolean 
         assertTrue(EstaAfuera, "La pieza no puede estar fuera del tablero");

   }


    //parametro de interfaces

}
