package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class BoardTest {

@Test   
   public void CreaTablero () {
      Board board = new Board(20, 10);
      for (int i = 0; i < 20; i++) {
         for (int j = 0; j < 10; j++) {
            assertEquals(0, board.getCelda(i, j));
         }
      }
   }



      @Test
      public void PiezasTablero() {
         Board board = new Board(20,10); 

         int [][] PieceSqueare= {
            {19,3} ,{19,4}, {18,3}, {18,4}  
         };

         assertTrue(board.Colocar(PieceSqueare), "La pieza está dentro del tablero");

         assertEquals(0, board.getCelda(19,3));
         assertEquals(0, board.getCelda(19,4));
         assertEquals(0, board.getCelda(18,3));
         assertEquals(0, board.getCelda(18,4));

         int [][] pieceStick = {
            {19,6}, {18,6}, {17,6}, {16,6}
         };

         assertTrue(board.Colocar(pieceStick), "La pieza está dentro del tablero");

         assertEquals(0, board.getCelda(19,6));
         assertEquals(0, board.getCelda(18,6));
         assertEquals(0, board.getCelda(17,6));
         assertEquals(0, board.getCelda(16,6));
      }


   @Test
   public void FueraDelTablero() {
      Board board = new Board(20, 10);
      int [][] pieceSquareAfuera= {
         {20,3} ,{20,4}, 
         {18,3}, {18,4}  
      };

      assertTrue(board.Colocar(pieceSquareAfuera), "La pieza está fuera del tablero");

      int [][] pieceStickAfuera= {
         {21,6},
         {20,6}, 
         {19,6},
         {17,6}  
      };

      assertTrue(board.Colocar(pieceStickAfuera), "La pieza está fuera del tablero");
   }



   @Test
   public void CaidaLibreSquare(){

      Board board = new Board(20, 10);

      int [][] pieceSquare = {
         {1,1}, {1,2}, 
         {2,1}, {2,2}  
      };

      board.setPiezaActual(pieceSquare, 4);

      while (board.moveDown()) {
      }

      int[][] posicionFinal = board.getPiezaActual();

      for (int i = 0; i < 4; i++) {
        int fila = posicionFinal[i][0];
        int columna = posicionFinal[i][1];
        
        assertTrue(
            (fila == 18 || fila == 19) && (columna == 1 || columna == 2)
         );
      }
   }



   @Test
   public void CaidaLibreStick(){

      Board board = new Board(20, 10);

      int [][] pieceStick = {
         {0,6}, {1,6}, {2,6}, {3,6}
      };

      board.setPiezaActual(pieceStick, 4);

      while (board.moveDown()) {
      }

      int[][] posicionFinal = board.getPiezaActual();

      for (int i = 0; i < 4; i++) {
          int fila = posicionFinal[i][0];
          int columna = posicionFinal[i][1];
          
         assertTrue(
              (fila == 16 || fila == 17 || fila == 18 || fila == 19) && (columna == 6)
          );
      }
   }


   @Test
   public void BoardClock(){


      Board board = new Board(20, 10);
      Clock clock = new Clock();

      int ticksParaBajar = 2; // numero de ticks necesarios para bajar la pieza
      int bajadasContador = 0;

      int [][] pieceSquare= {
         {0,1} ,{0,2}, 
         {1,1}, {1,2}  
      };

      board.setPiezaActual(pieceSquare, 4); // activo la pieza antes de dejarla caer

      while (true) {
        if (clock.tick()) { // si el reloj indica que es tiempo de bajar la pieza
            boolean puedeBajar = board.moveDown();
            if (!puedeBajar) {
                break; // la pieza no puede bajar más, salir del bucle
            }
        }
    }

         // Verificar que la pieza ha bajado correctamente
      for (int filas = 0; filas < 20; filas++) {
         for (int columnas = 0; columnas < 10; columnas++) {
            if ((filas == 18 || filas == 19) && (columnas == 1 || columnas == 2)) {
               assertEquals(1, board.getCelda(filas, columnas)); 
               // la pieza llegó al fondo
            }
            else{
               assertEquals(0, board.getCelda(filas, columnas)); // las demás celdas están vacías
            }
         }
      }
   }

}